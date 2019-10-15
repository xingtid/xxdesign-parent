package xyz.hpwyx.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.request.AlipayTradePagePayRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import xyz.alipay.config.AlipayConfig;
import xyz.hpwyx.fegin.VipServiceFigen;
import xyz.hpwyx.pojo.XPay;
import xyz.hpwyx.pojo.XUser;
import xyz.hpwyx.token.TokenUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author tid
 * @create 2019-10-05 10:04 下午
 **/
@Controller
public class VipController {
    @Autowired
    private VipServiceFigen vipServiceFigen;


    /**
     * 创建订单
     */
    @RequestMapping("/createOrder")
    @ResponseBody
    public String createOrder(double amount, HttpServletResponse response, HttpSession session) throws Exception {

        XUser userinfo = (XUser) session.getAttribute ("USERINFO");
        if (userinfo == null) {
            return "login.html";
        }
        AlipayClient alipayClient = new DefaultAlipayClient (AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
        AlipayTradeAppPayModel model = new AlipayTradeAppPayModel ();

        //实例化具体API对应的request类,类名称和接口名称对应,当前调用接口名称：alipay.trade.app.pay
        AlipayTradeAppPayRequest ali_request = new AlipayTradeAppPayRequest ();
        ali_request.setBizModel (model);
        // 回调地址
        ali_request.setNotifyUrl (AlipayConfig.notify_url);
        //就是orderString 可以直接给客户端请求，无需再做处理。

        String orderNo = TokenUtils.getPayToken ();
        XPay pay = new XPay ();
        pay.setoState (0);
        pay.setoDate (new Date ());
        pay.setoId (orderNo);
        pay.setoPrice (amount);
        pay.setoTypeid (3);
        pay.setoUserid (userinfo.getUId ());
        System.out.println ("no" + orderNo);
        vipServiceFigen.addPay (pay);
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest ();
        alipayRequest.setReturnUrl (AlipayConfig.return_url); //同步通知url
        alipayRequest.setNotifyUrl (AlipayConfig.notify_url);//异步通知url
        alipayRequest.setBizContent ("{\"out_trade_no\":\"" + orderNo + "\","
                + "\"total_amount\":\"" + amount + "\","
                + "\"subject\":\"" + "subject" + "\","
                + "\"body\":\"" + "会员支付" + "\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

        String webForm = "";//输出页面的表单
        webForm = alipayClient.pageExecute (alipayRequest).getBody ();
        response.setContentType ("text/html;charset=" + AlipayConfig.charset);
        response.getWriter ().write (webForm);//直接将完整的表单html输出到页面
        response.getWriter ().flush ();
        response.getWriter ().close ();
        return webForm;
    }

    /**
     * 支付异步通知
     * 接收到异步通知并验签通过后，一定要检查通知内容，
     * 包括通知中的app_id、out_trade_no、total_amount是否与请求中的一致，并根据trade_status进行后续业务处理。
     * https://docs.open.alipay.com/194/103296
     */
    @ResponseBody
    @RequestMapping("/callBack/notifyUrl")
    public String notify(HttpServletRequest request, HttpSession session) {
        // 验证签名
        boolean flag = rsaCheck (request);
        if (flag) {
            String tradeStatus = request.getParameter ("trade_status"); // 交易状态
            String outTradeNo = request.getParameter ("out_trade_no"); // 商户订单号
            String tradeNo = request.getParameter ("trade_no"); // 支付宝订单号
            /**
             * 还可以从request中获取更多有用的参数，自己尝试
             */
            boolean notify = vipServiceFigen.notify (tradeStatus, outTradeNo, tradeNo);
            if (notify) {
                XUser userinfo = (XUser) session.getAttribute ("USERINFO");
                if (userinfo == null) {
                    return "fail";
                }
                return "success";
            }
        }
        return "fail";
    }

    /**
     * 同步
     *
     * @param request
     * @return
     */
    @RequestMapping("/callBack/returnUrl")
    @ResponseBody
    public String returnUrl(HttpServletRequest request) {
        // 验证签名
        boolean flag = rsaCheck (request);
        if (flag) {

        } else {

        }
        return "success";

    }

    public boolean rsaCheck(HttpServletRequest request) {
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
