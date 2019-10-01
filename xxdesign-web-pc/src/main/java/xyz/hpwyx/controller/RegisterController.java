package xyz.hpwyx.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.fegin.UserServiceFigen;
import xyz.hpwyx.iputil.GetIp;
import xyz.hpwyx.msg.SendMsg;
import xyz.hpwyx.pojo.XUser;

import javax.servlet.http.HttpServletRequest;

/**
 * @author tid
 * @create 2019-09-10 10:39 上午
 **/
@RestController
public class RegisterController {
    @Autowired
    private UserServiceFigen serviceFigen;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public XResult doregister(@RequestParam(value = "uName", required = false) String uName, @RequestParam(value = "uPassword", required = false) String uPassword,@RequestParam(value = "uPhone", required = false) String uPhone,HttpServletRequest request, @RequestParam(value = "usercode", required = false) String usercode) {
        String ipAddress = GetIp.getIpAddress (request);
        XUser pojo = new XUser ();
        pojo.setUName (uName);
        pojo.setUPassword (uPassword);
        pojo.setUPhone (uPhone);
        System.out.println (uName);
        String code = (String) request.getSession ().getAttribute ("verifyCode");
        if (!usercode.equals (code)) {
            return XResult.build (400, "验证码错误", null);
        }
        //1. 验证参数
        if (StringUtils.isEmpty (uPhone)) {
            return XResult.failNoMsg ();
        }
        pojo.setUIp (ipAddress);
        //2. 调用会员注册接口
        XResult responseBase = serviceFigen.regUser (pojo);

        //3. 如果失败
        if (responseBase.getRtnCode () != 200) {

            return XResult.failMsg ("注册失败");
        }
        //4. 如果成功
        return responseBase;
    }

    /**
     * 发送验证码
     *
     * @return
     */
    @RequestMapping(value = "/sendCode", method = RequestMethod.POST)
    @ResponseBody
    public XResult sendCode(@RequestParam(value = "phone", required = false) String phone, HttpServletRequest request) {
        String code = SendMsg.sendduanxing (phone);
        request.getSession ().setAttribute ("verifyCode", code);
        System.out.println ("phone"+phone);
        return XResult.isOk ();
    }
}
