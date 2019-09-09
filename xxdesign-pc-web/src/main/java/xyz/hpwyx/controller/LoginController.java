package xyz.hpwyx.controller;

import org.apache.catalina.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.hpwyx.baseresult.Constants;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.cookie.CookieUtils;
import xyz.hpwyx.fegin.UserServiceFigen;
import xyz.hpwyx.pojo.XUser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.LinkedHashMap;

/**
 * @author tid
 * @create 2019-09-08 4:39 下午
 **/
@RestController
public class LoginController {

    @Autowired
    UserServiceFigen serviceFigen;
    @RequestMapping(value = "/baseLogin", method = RequestMethod.POST)
    public XResult baseLogin(@RequestParam("uPhone") String phone,@RequestParam("uPassword") String password, HttpServletResponse response, HttpServletRequest request){
        //1.验证参数

        if (phone==null||password==null){
            return XResult.failMsg("用户名或密码为空");
        }
        System.out.println (phone);
        XUser user = new XUser ();
        user.setUPhone (phone);
        user.setUPassword (password);
        //2。调用接口，获取token 信息
        XResult login = serviceFigen.baseLogin (user);
        // 判断
        if (!login.getRtnCode ().equals (200)) {
            return XResult.failMsg ("账号或密码错误");
        }
        LinkedHashMap data = (LinkedHashMap) login.getData ();
        String membertoken = (String) data.get ("token");
        if (StringUtils.isEmpty (membertoken)){
            return XResult.failMsg ("会话失效");
        }

        //3。将token 存在 cookie 中
        setCooke (membertoken,request,response);

        return XResult.isOk (login);
    }
    public void setCooke(String memberToken,HttpServletRequest request,HttpServletResponse response){
        CookieUtils.setCookie (request,response, Constants.COOKIE_TOKEN,memberToken,60*30);
    }
}
