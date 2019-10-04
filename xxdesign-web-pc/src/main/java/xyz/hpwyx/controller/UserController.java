package xyz.hpwyx.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.fegin.UserServiceFigen;
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

    @RequestMapping(value = "/findMyInfo")
    public String index(HttpServletRequest reqest, HttpSession session) {

        XUser userinfo = (XUser) session.getAttribute ("USERINFO");
        XUser userById = serviceFigen.findUserById (userinfo.getUId ());
        XUserInfo infoById = serviceFigen.findInfoById (userinfo.getUId ());
        session.setAttribute ("USERINFO", userById);
        reqest.setAttribute ("userinfo", infoById);
        return "user/userinfo";
    }



}
