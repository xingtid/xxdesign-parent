package xyz.hpwyx.service.impl;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import xyz.alipay.config.AlipayConfig;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.mapper.XPayMapper;
import xyz.hpwyx.mapper.XVipMapper;
import xyz.hpwyx.pojo.XPay;
import xyz.hpwyx.pojo.XVip;
import xyz.hpwyx.pojo.XVipExample;
import xyz.hpwyx.redis.RedisUtil;
import xyz.hpwyx.service.VipService;
import xyz.hpwyx.token.TokenUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @author tid
 * @create 2019-10-05 10:03 下午
 **/
@Slf4j
@RestController
public class VipServiceImpl implements VipService {
    @Autowired
    private XVipMapper xVipMapper;
    @Autowired
    private XPayMapper xPayMapper;

    @Override
    public XResult addPay(XPay xPay) {
        int insert = xPayMapper.insert (xPay);
        if (insert < 0) {

            return XResult.failMsg ("订单插入失败");
        }
        return XResult.isOk ();
    }

    @Override
    public List<XVip> findAllVip() {
        XVipExample example= new XVipExample ();
        List<XVip> xVips = xVipMapper.selectByExample (example);
        return xVips;
    }

    @Override
    public XResult addVIP(XVip xVip) {
        int insert = xVipMapper.insert (xVip);
        if (insert < 0) {

            return XResult.failMsg ("会员插入失败");
        }
        return XResult.isOk ();
    }

    @Override
    public String updateVIP(@RequestParam("uId") Integer uId){

        XVipExample example = new XVipExample ();
        XVipExample.Criteria criteria = example.createCriteria ();
        criteria.andVUidEqualTo (uId);
        List<XVip> xVips = xVipMapper.selectByExample (example);

        return xVips.get (0).getvTimeLeft ();
    }

    @Override
    public XResult updatePay(XPay xPay) {
        int i = xPayMapper.updateByPrimaryKey (xPay);
        if (i < 0) {

            return XResult.failMsg ("订单插入失败");
        }
        return XResult.isOk ();
    }

    @Override
    public XPay getPayById(String id) {
        XPay pay = xPayMapper.selectByPrimaryKey (id);
        return pay;
    }

    @Autowired
    private XPayMapper paymentInfoDao;
    @Autowired
    private RedisUtil redisUtil;


    @Override
    public String createOrder(@RequestParam("orderNo") String orderNo, @RequestParam("amount") double amount, @RequestParam("body") String body) throws AlipayApiException {
        //SDK已经封装掉了公共参数，这里只需要传入业务参数。以下方法为sdk的model入参方式(model和biz_content同时存在的情况下取biz_content)。
        AlipayClient alipayClient = new DefaultAlipayClient (AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
        AlipayTradeAppPayModel model = new AlipayTradeAppPayModel ();
        model.setSubject (body);
        model.setOutTradeNo (orderNo);
        model.setTotalAmount (String.valueOf (amount));
        model.setProductCode ("QUICK_MSECURITY_PAY");
        model.setPassbackParams ("公用回传参数，如果请求时传递了该参数，则返回给商户时会回传该参数");

        //实例化具体API对应的request类,类名称和接口名称对应,当前调用接口名称：alipay.trade.app.pay
        AlipayTradeAppPayRequest ali_request = new AlipayTradeAppPayRequest ();
        ali_request.setBizModel (model);
        ali_request.setNotifyUrl (AlipayConfig.notify_url);// 回调地址
        ali_request.setReturnUrl (AlipayConfig.return_url);
        AlipayTradeAppPayResponse ali_response = alipayClient.sdkExecute (ali_request);
        //就是orderString 可以直接给客户端请求，无需再做处理。
        return ali_response.getBody ();
    }

    @Override
    public boolean notify(@RequestParam("tradeStatus") String tradeStatus, @RequestParam("orderNo") String orderNo, @RequestParam("tradeNo") String tradeNo) {
        if ("TRADE_FINISHED".equals (tradeStatus)
                || "TRADE_SUCCESS".equals (tradeStatus)) {
            // 支付成功，根据业务逻辑修改相应数据的状态
            System.out.println ("orderNo" + orderNo);
            System.out.println ("tradeNo" + tradeNo);
            XPay payById = xPayMapper.selectByPrimaryKey (orderNo);
            payById.setoPlatformorderid (tradeNo);
            payById.setoState (1);
            xPayMapper.updateByPrimaryKey (payById);

            XVipExample example = new XVipExample ();
            XVipExample.Criteria criteria = example.createCriteria ();
            criteria.andVUidEqualTo (payById.getoUserid ());
            List<XVip> xVips = xVipMapper.selectByExample (example);
            XVip vip = new XVip ();
            int score = 0;
            int left = 0;
            if (xVips.size () > 0) {
                vip = xVips.get (0);
                score =vip.getvScore ();
                left = Integer.parseInt (vip.getvTimeLeft ());
            }else {
                vip.setvId (TokenUtils.getUserToken ());
                vip.setvLevel (1);
            }
            String aDouble = payById.getoPrice () + "";
            System.out.println (aDouble);
            int day = 0;
            int pay =0;
            /**
             * 根据不同对价位开通不同时间段的会员
             */
            switch (aDouble) {
                case "30.0":
                    day = 31;
                    pay = 30;
                    break;
                case "70.0":
                    day = 90;
                    pay = 70;
                    break;
                case "230.0":
                    day = 365;
                    pay = 230;
                    break;
                case "700.0":
                    day = 999999;
                    pay = 700;
                    break;
                default:
                    day = 0;
                    break;
            }

            vip.setvTime (new Date ());
            vip.setvUid (payById.getoUserid ());
            vip.setvScore (pay + score);
            System.out.println ((left+ day)+"");
            vip.setvTimeLeft ((left + day)+"");
            if (xVips.size () > 0) {
                xVipMapper.updateByPrimaryKey (vip);
            }else {
                xVipMapper.insert (vip);
            }

            return true;
        }
        System.out.println ("支付失败notify");
        return false;
    }

    @Override
    public boolean returnU(@RequestParam("tradeStatus") String tradeStatus, @RequestParam("orderNo") String orderNo, @RequestParam("tradeNo") String tradeNo) {
        if ("TRADE_FINISHED".equals (tradeStatus)
                || "TRADE_SUCCESS".equals (tradeStatus)) {
            // 支付成功，根据业务逻辑修改相应数据的状态
            System.out.println ("orderNo" + orderNo);
            System.out.println ("tradeNo" + tradeNo);
            return true;
        }
        System.out.println ("支付失败notify");
        return false;
    }

    @Override
    public boolean rsaCheckV1(HttpServletRequest request) {
        try {
            Map<String, String> params = new HashMap<> ();
            Map<String, String[]> requestParams = request.getParameterMap ();
            for (Iterator iter = requestParams.keySet ().iterator (); iter.hasNext (); ) {
                String name = (String) iter.next ();
                String[] values = requestParams.get (name);
                String valueStr = "";
                for (int i = 0; i < values.length; i++) {
                    valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
                }
                params.put (name, valueStr);
            }

            boolean verifyResult = AlipaySignature.rsaCheckV1 (params, AlipayConfig.alipay_public_key, AlipayConfig.charset, AlipayConfig.sign_type);
            return verifyResult;
        } catch (AlipayApiException e) {
            return false;
        }
    }

}
