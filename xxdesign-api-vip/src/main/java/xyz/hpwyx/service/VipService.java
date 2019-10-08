package xyz.hpwyx.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.pojo.XPay;

import java.util.Map;

/**
 * @author tid
 * @create 2019-10-05 10:01 下午
 **/
@RequestMapping("/vip")
public interface VipService {
    /**
     * @return
     */
    @RequestMapping("/addVip")
    XResult addVip();


    //创建支付令牌
    @RequestMapping("/createPayToken")
    public XResult createToken(@RequestBody XPay PaymentInfo);
    // 使用支付令牌查找支付信息
    @RequestMapping("/findPayToken")
    public XResult findPayToken (@RequestParam("payToken") String payToken);


    // 同步通知
    @RequestMapping("/synCallBack")
    public XResult synCallBack(@RequestParam Map<String, String> params);

    // 异步通知
    @RequestMapping("/asynCallBack")
    public String asynCallBack(@RequestParam Map<String, String> params);

}
