package xyz.hpwyx.controller;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.fegin.ShareServiceFigen;
import xyz.hpwyx.fegin.UserServiceFigen;
import xyz.hpwyx.fegin.VipServiceFigen;
import xyz.hpwyx.fegin.WardrobeFeign;
import xyz.hpwyx.pojo.*;

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
    @Autowired
    private WardrobeFeign wardrobeFeign;
    @Autowired
    private VipServiceFigen vipServiceFigen;

    @RequestMapping(value = "/findMyInfo")
    public String index(HttpSession session) {
        XUser userinfo = (XUser) session.getAttribute ("USERINFO");
        if (userinfo == null) {
            return "login.html";
        }
        Integer integer = shareServiceFigen.shareCount ("null");
        session.setAttribute ("shareCount",integer);
        XUser userById = serviceFigen.findUserById (userinfo.getUId ());
        List<XWardrobe> wardList = wardrobeFeign.getWardList (userById.getUId ());
        session.setAttribute ("woSize",wardList.size ());
        XUserInfo infoById = serviceFigen.findInfoById (userinfo.getUId ());
        List<XShare> shareByUId = shareServiceFigen.findShareByUId (userinfo.getUId ());

        String integer1 = "";
        List<XVip> byUserId = vipServiceFigen.findByUserId (userinfo.getUId ());
        if (byUserId.size ()!=0){
            integer1 = byUserId.get (0).getvTimeLeft ();
        }
        session.setAttribute ("levelcount",integer1);
        session.setAttribute ("share", shareByUId);
        session.setAttribute ("USERINFO", userById);
        session.setAttribute ("userinfo", infoById);


        return "/user/userinfo";
    }


    @RequestMapping(value = "/toUInfo")
    public String toUInfo(int id, HttpSession session, Model model) {

        XUser userById = serviceFigen.findUserById (id);
        List<XWardrobe> wardList = wardrobeFeign.getWardList (userById.getUId ());
        session.setAttribute ("woSize",wardList.size ());
        XUserInfo infoById = serviceFigen.findInfoById (id);
        List<XShare> shareByUId = shareServiceFigen.findShareByUId (id);
        session.setAttribute ("share", shareByUId);
        model.addAttribute ("USERINFO", userById);
        model.addAttribute ("userinfo", infoById);
        return "/user/info";
    }
    @RequestMapping(value = "/getInfo")
    public String getInfo(HttpSession session) {

        XUser userinfo = (XUser) session.getAttribute ("USERINFO");
        if (userinfo == null) {
            return "login.html";
        }
        XUser userById = serviceFigen.findUserById (userinfo.getUId ());
        List<XWardrobe> wardList = wardrobeFeign.getWardList (userById.getUId ());
        session.setAttribute ("woSize",wardList.size ());
        XUserInfo infoById = serviceFigen.findInfoById (userinfo.getUId ());
        List<XShare> shareByUId = shareServiceFigen.findShareByUId (userinfo.getUId ());
        session.setAttribute ("share", shareByUId);
        session.setAttribute ("USERINFO", userById);
        session.setAttribute ("userinfo", infoById);
        return "/user/infoall";
    }

    @RequestMapping(value = "/updateUserInfo")
    @ResponseBody
    public XResult updateUserInfo(XUserInfo xUserInfo, HttpSession session) {
        XUser user = (XUser) session.getAttribute ("USERINFO");
        if (user == null) {
            return XResult.failMsg ("登录失效");
        }
        XUserInfo infoById = serviceFigen.findInfoById (user.getUId ());

        infoById.setUAge (xUserInfo.getUAge ());
        infoById.setUFace (xUserInfo.getUFace ());
        infoById.setUHair (xUserInfo.getUHair ());
        infoById.setUHeight (xUserInfo.getUHeight ());
        infoById.setUPosition (xUserInfo.getUPosition ());
        infoById.setUSex (xUserInfo.getUSex ());
        infoById.setUSkin (xUserInfo.getUSkin ());
        infoById.setUStyle1 (xUserInfo.getUStyle1 ());
        infoById.setUWeight (xUserInfo.getUWeight ());

        List<String> img = (List<String>) session.getAttribute ("img");
        if (img!=null&&img.size () != 0) {
            infoById.setUPhoto (img.get (0));
        }

        XResult xResult = serviceFigen.insertIntoUserInfo (infoById);
        return xResult;
    }


}
