package xyz.hpwyx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.fegin.WardrobeFeign;
import xyz.hpwyx.pojo.XUser;
import xyz.hpwyx.pojo.XWardrobe;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author tid
 * @create 2019-09-24 9:34 下午
 **/
@Controller
public class WardrobeController {

    @Autowired
    private WardrobeFeign wardrobeFeign;
    @RequestMapping(value = "/insertWard")
    @ResponseBody
    public XResult insertWard(XWardrobe xWardrobe, @RequestParam("date") String date, HttpSession session) throws ParseException {
        XUser userinfo = (XUser) session.getAttribute ("USERINFO");
        if (userinfo==null){
            return XResult.failMsg ("未登录");
        }
        System.out.println ("date::"+date);
        SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd");
        Date parse = format.parse (date);
        xWardrobe.setWUserid (userinfo.getUId ());
        xWardrobe.setWCreateTime (parse);
        List<String> img = (List<String>) session.getAttribute ("img");
            if (img.size ()==1) {
                xWardrobe.setWImg (img.get (0));
            }else if(img.size () == 2) {
                xWardrobe.setWImg (img.get (0));
                xWardrobe.setWImg2 (img.get (1));
            }else {
                xWardrobe.setWImg (img.get (0));
                xWardrobe.setWImg2 (img.get (1));
                xWardrobe.setWImg3 (img.get (2));
            }
        XResult xResult = wardrobeFeign.insertWard (xWardrobe);
        return xResult;
    }

    @RequestMapping(value = "/getWardList")
    public String getWardList(HttpSession session, Model model) {
        XUser userinfo = (XUser) session.getAttribute ("USERINFO");
        if (userinfo == null){
            return "login.html";
        }
        List<XWardrobe> wardList = wardrobeFeign.getWardList (userinfo.getUId ());
        model.addAttribute ("wardrobe",wardList);
        return "wardrobe";
    }
}
