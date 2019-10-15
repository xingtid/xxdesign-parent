package xyz.hpwyx.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.fegin.ShareServiceFigen;
import xyz.hpwyx.fegin.UserServiceFigen;
import xyz.hpwyx.pojo.XShare;
import xyz.hpwyx.pojo.XUser;
import xyz.hpwyx.pojo.XUserInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author tid
 * @create 2019-09-23 7:10 下午
 **/
@Slf4j
@Controller
public class UserController {

    @Autowired
    private UserServiceFigen serviceFigen;
    @Autowired
    private ShareServiceFigen shareServiceFigen;

    @RequestMapping(value = "/findMyInfo")
    public String index(HttpServletRequest reqest, HttpSession session) {

        XUser userinfo = (XUser) session.getAttribute ("USERINFO");
        if (userinfo == null){
            return "login.html";
        }
        XUser userById = serviceFigen.findUserById (userinfo.getUId ());
        XUserInfo infoById = serviceFigen.findInfoById (userinfo.getUId ());
        List<XShare> shareByUId = shareServiceFigen.findShareByUId (userinfo.getUId ());
        session.setAttribute ("share",shareByUId);
        session.setAttribute ("USERINFO", userById);
        session.setAttribute ("userinfo", infoById);
        return "user/userinfo";
    }



}
