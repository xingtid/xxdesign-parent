package xyz.hpwyx.controller;

import com.qq.connect.QQConnectException;
import com.qq.connect.api.OpenID;
import com.qq.connect.javabeans.AccessToken;
import com.qq.connect.oauth.Oauth;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import xyz.hpwyx.baseresult.Constants;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.cookie.CookieUtil;
import xyz.hpwyx.cookie.CookieUtils;
import xyz.hpwyx.fegin.UserServiceFigen;
import xyz.hpwyx.pojo.XUser;
import xyz.hpwyx.redis.RedisUtil;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;
import java.util.LinkedHashMap;

/**
 * @author tid
 * @create 2019-09-08 4:39 下午
 **/
@Controller
public class LoginController {
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    UserServiceFigen serviceFigen;
    @ResponseBody
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
        System.out.println (membertoken);
        //3。将token 存在 cookie 中
        setCooke (membertoken,request,response);

        return XResult.isOk (login);
    }
    // 生成qq授权登录链接
    @RequestMapping("/localQQlogin")
    public String locaQQLogin(ServletRequest reqest) throws QQConnectException {
        String authorizeURL = new Oauth ().getAuthorizeURL(reqest);
//        return XResult.isOk (authorizeURL);
        return "redirect:" + authorizeURL;
    }
    @RequestMapping("/qqlogin")
    public String qqlogin(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws QQConnectException {
        //1.获取授权吗code
        Enumeration<String> attributeNames = request.getSession ().getAttributeNames ();
//        System.out.println (attributeNames.nextElement ());
        //2。使用授权码 获取accesstoken
        AccessToken accessTokenByRequest = new Oauth ().getAccessTokenByRequest (request);


        // 我们的网站被CSRF攻击了或者用户取消了授权
        if (accessTokenByRequest == null||accessTokenByRequest.getAccessToken ().equals ("")){

            return "error";
        }
        System.out.println ("ds"+accessTokenByRequest);
        String accessToken = accessTokenByRequest.getAccessToken ();

        if (accessToken == null){
//            return XResult.failNoMsg ();
            return "error";
        }
        //3。使用accesstoken获取openid
        OpenID openID = new OpenID (accessToken);
        String userOpenID = openID.getUserOpenID ();
        System.out.println (userOpenID);
        if (userOpenID == null){
//            return XResult.failNoMsg ();
            return "error";
        }

        //查找是否关联账号
        XResult responseBase = serviceFigen.findOpenIdUser (userOpenID);
        if (responseBase.getRtnCode ().equals (Constants.HTTP_RES_CODE_201)){
            //如果没有关联账号
            session.setAttribute ("qqOpenId",userOpenID);
//            return XResult.build (Constants.HTTP_RES_CODE_201,"没有关联账号",null);
            return "redirect:localhost:8080/login";
        }
        LinkedHashMap data = (LinkedHashMap) responseBase.getData ();
        String memberToken = (String) data.get ("membertoken");
        setCooke (memberToken,request,response);
        //已经绑定

        return "redirect:localhost:8088/login";
//        return XResult.isOk ();
    }
    @RequestMapping(value = "/loginOut")
    public String loginOut(HttpServletRequest request,HttpServletResponse response){
        XUser xUser = (XUser) request.getSession ().getAttribute ("USERINFO");
        String token = CookieUtil.getUid(request, Constants.COOKIE_TOKEN);
        CookieUtils.deleteCookie (request,response,Constants.COOKIE_TOKEN);
       request.getSession ().removeAttribute ("USERINFO");
        redisUtil.del (0,xUser.getUId ()+"",token);
        return "redirect:http://localhost:8088";
    }
    public void setCooke(String memberToken,HttpServletRequest request,HttpServletResponse response){
        System.out.println ("setCookie::"+memberToken);
        CookieUtils.setCookie (request,response, Constants.COOKIE_TOKEN,memberToken,60*30*12);

    }
}
