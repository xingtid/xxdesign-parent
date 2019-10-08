package xyz.hpwyx.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.alipay.config.AlipayConfig;
import xyz.hpwyx.baseresult.Constants;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.mapper.XPayMapper;
import xyz.hpwyx.mapper.XVipMapper;
import xyz.hpwyx.pojo.XPay;
import xyz.hpwyx.redis.RedisUtil;
import xyz.hpwyx.service.VipService;
import xyz.hpwyx.token.TokenUtils;

import java.util.Map;

/**
 * @author tid
 * @create 2019-10-05 10:03 下午
 **/
@Slf4j
@RestController
public class VipServiceImpl  implements VipService {
    @Autowired
    private XVipMapper xVipMapper;

    @Override
    public XResult addVip() {
        return null;
    }

    @Autowired
    private XPayMapper paymentInfoDao;
    @Autowired
    private RedisUtil redisUtil;

    // 创建支付令牌
    @Override
    @RequestMapping("/createPayToken")
    public XResult createToken(@RequestBody XPay paymentInfo) {
        // 1.创建支付请求信息
        Integer savePaymentType = paymentInfoDao.insert (paymentInfo);
        if (savePaymentType <= 0) {
            return XResult.failMsg ("创建支付订单支付失败");
        }
        // 2.生成对应的token
        String payToken = TokenUtils.getPayToken();
        // 3.存放在Redis中，key为 token value 支付id
        redisUtil.set (payToken, paymentInfo.getoId () + "", 0);
        // 4.返回token
        JSONObject data = new JSONObject ();
        data.put("payToken", payToken);
        return XResult.isOk (data);
    }

    // 使用支付令牌查找支付信息
    @Override
    @RequestMapping("/findPayToken")
    public XResult findPayToken(@RequestParam("payToken") String payToken) {
        // 1.参数验证
        if (StringUtils.isEmpty(payToken)) {
            return XResult.failMsg ("tokne不能为空");
        }
        // 2.判断token有效期
        // 3.使用token 查找redis 找到对应支付id
        String payId = redisUtil.get (payToken,0);
        if (StringUtils.isEmpty(payId)) {
            return XResult.failMsg ("支付请求已经超时!");
        }
        // 4.使用支付id，进行下单
        Integer payIDl = Integer.parseInt (payId);

        // 5.使用支付id查询支付信息
        XPay paymentInfo = paymentInfoDao.selectByPrimaryKey (payIDl);
        if (paymentInfo == null) {
            return XResult.failMsg ("未找到支付信息");
        }
        // 6.对接支付代码 返回提交支付from表单元素给客户端
        // 获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient (AlipayConfig.gatewayUrl, AlipayConfig.app_id,
                AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key,
                AlipayConfig.sign_type);

        // 设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest ();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);

        // 付款金额，必填 企业金额
        String total_amount = paymentInfo.getoPrice () + "";
        // 商品描述，可空
        // String body = new
        // String(request.getParameter("WIDbody").getBytes("ISO-8859-1"),"UTF-8");

        alipayRequest.setBizContent("{\"out_trade_no\":\"" + "\"total_amount\":\"" + total_amount
                + "\"," + "\","
                // + "\"body\":\""+ body +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

        // 若想给BizContent增加其他可选请求参数，以增加自定义超时时间参数timeout_express来举例说明
        // alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no
        // +"\","
        // + "\"total_amount\":\""+ total_amount +"\","
        // + "\"subject\":\""+ subject +"\","
        // + "\"body\":\""+ body +"\","
        // + "\"timeout_express\":\"10m\","
        // + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        // 请求参数可查阅【电脑网站支付的API文档-alipay.trade.page.pay-请求参数】章节

        // 请求
        try {
            String result = alipayClient.pageExecute(alipayRequest).getBody();
            JSONObject data = new JSONObject ();
            data.put("payHtml", result);
            return XResult.isOk (data);
        } catch (Exception e) {
            return XResult.failMsg ("支付异常");
        }

    }

    @Override
    public XResult synCallBack(@RequestParam Map<String, String> params) {
        // 1.日志记录
        log.info("#####支付宝同步通知synCallBack#####开始,params:{}", params);
        // 2.验签操作
        try {
            boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key,
                    AlipayConfig.charset, AlipayConfig.sign_type); // 调用SDK验证签名
            log.info("#####支付宝同步通知signVerified:{}######", signVerified);
            // ——请在这里编写您的程序（以下代码仅作参考）——
            if (!signVerified) {
                return XResult.failMsg ("验签失败!");
            }
            // 商户订单号
            String outTradeNo = params.get("out_trade_no");
            // 支付宝交易号
            String tradeNo = params.get("trade_no");
            // 付款金额
            String totalAmount = params.get("total_amount");
            JSONObject data = new JSONObject ();
            data.put("outTradeNo", outTradeNo);
            data.put("tradeNo", tradeNo);
            data.put("totalAmount", totalAmount);
            return XResult.isOk (data);
        } catch (Exception e) {
            log.error("####支付宝同步通知出现异常,ERROR:", e);
            return XResult.failMsg ("系统错误!");
        } finally {
            log.info("#####支付宝同步通知synCallBack#####结束,params:{}", params);
        }

    }

    @Override
    public String asynCallBack(@RequestParam Map<String, String> params) {
        // 1.日志记录
        log.info("#####支付宝异步通知synCallBack#####开始,params:{}", params);
        // 2.验签操作
        try {
            boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key,
                    AlipayConfig.charset, AlipayConfig.sign_type); // 调用SDK验证签名
            log.info("#####支付宝异步通知signVerified:{}######", signVerified);
            // ——请在这里编写您的程序（以下代码仅作参考）——
            if (!signVerified) {
                return Constants.PAY_FAIL;
            }
            // 商户订单号
            String outTradeNo = params.get("out_trade_no");
            XPay paymentInfo = null;
            if (paymentInfo == null) {
                return Constants.PAY_FAIL;
            }

            // 支付宝重试机制
            Integer state = paymentInfo.getoState ();
            if (state == 1) {
                return Constants.PAY_SUCCESS;
            }

            // 支付宝交易号
            String tradeNo = params.get("trade_no");
            // 付款金额
            // String totalAmount = params.get("total_amount");
            // 判断实际付款金额与商品金额是否一致
            // 修改 支付表状态
            paymentInfo.setoState (1);// 标识为已经支付
            paymentInfo.setoPlatformorderid (tradeNo);
            // 手动 begin begin
            Integer updateResult = paymentInfoDao.updateByPrimaryKey (paymentInfo);
            if (updateResult <= 0) {
                return Constants.PAY_FAIL;
            }
            // 调用订单接口通知 支付状态
            // 手动 提交 comiit;
            return Constants.PAY_SUCCESS;
        } catch (Exception e) {
            log.error("####支付宝异步通知出现异常,ERROR:", e);
            // 回滚 手动回滚 rollback
            return Constants.PAY_FAIL;
        } finally {
            log.info("#####支付宝异步通知synCallBack#####结束,params:{}", params);
        }
    }

}
