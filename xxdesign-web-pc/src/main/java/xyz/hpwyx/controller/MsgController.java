package xyz.hpwyx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.fegin.MsgServiceFigen;
import xyz.hpwyx.fegin.ShareServiceFigen;
import xyz.hpwyx.fegin.UserServiceFigen;
import xyz.hpwyx.fegin.WardrobeFeign;
import xyz.hpwyx.pojo.*;
import xyz.hpwyx.service.MessageService;

import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * @author tid
 * @create 2019-10-03 7:36 下午
 **/
@Controller
public class MsgController {
    @Autowired
    private MsgServiceFigen msgServiceFigen;
    @Autowired
    private UserServiceFigen serviceFigen;
    @Autowired
    private ShareServiceFigen shareServiceFigen;
    @Autowired
    private WardrobeFeign wardrobeFeign;

    @RequestMapping("/getMsg")
    public String getMsg(HttpSession session, Model model) {
        XUser user = (XUser) session.getAttribute ("USERINFO");
        if (user == null) {
            return "login";
        }
        System.out.println ("getMsg");
        List<XMessage> msgs = msgServiceFigen.showMess (user.getUId ());
//        refresh (session, model);
        XUser userById = serviceFigen.findUserById (user.getUId ());
        List<XWardrobe> wardList = wardrobeFeign.getWardList (userById.getUId ());
        session.setAttribute ("woSize",wardList.size ());
        XUserInfo infoById = serviceFigen.findInfoById (user.getUId ());
        List<XShare> shareByUId = shareServiceFigen.findShareByUId (user.getUId ());
        session.setAttribute ("share", shareByUId);
        session.setAttribute ("USERINFO", userById);
        session.setAttribute ("userinfo", infoById);
        model.addAttribute ("msgList", msgs);
        return "user/usermessage";
    }


    @RequestMapping("/refresh")
    public XResult refresh(HttpSession session, Model model) {
        session.setMaxInactiveInterval (60 * 60);
        XUser user = (XUser) session.getAttribute ("USERTOKEN");
        List<XMessage> message = msgServiceFigen.getMessage (user.getUId (), 1);
        List<XMessage> message2 = msgServiceFigen.getMessage (user.getUId (), 2);
        List<Map<String, Object>> list = new ArrayList<> ();
        List<Map<String, Object>> list2 = new ArrayList<> ();

        int i = 0;
        for (XMessage sMessage : message2) {
            Map<String, Object> map2 = new HashMap<> ();
            map2.put ("text", sMessage.getmTitle ());
            map2.put ("id", sMessage.getmId ());
            map2.put ("readStatus", sMessage.getmMark ());
            if ("1".equals (sMessage.getmMark ())) {
                i++;
            }
            list2.add (map2);
        }
        int j = 0;
        for (XMessage sMessage : message) {
            Map<String, Object> map = new HashMap<> ();
            map.put ("text", sMessage.getmTitle ());
            map.put ("id", sMessage.getmId ());
            map.put ("readStatus", sMessage.getmMark ());
            if ("1".equals (sMessage.getmMark ())) {
                j++;
            }
            list.add (map);
        }

        session.setAttribute ("msg1Size", j);
        session.setAttribute ("msg", list);
        session.setAttribute ("note1Size", i);
        session.setAttribute ("note", list2);
        return XResult.isOk ();
    }

    @RequestMapping("/refreshA")
    @ResponseBody
    public XResult refreshA(HttpSession session) {
        System.out.println ("消息");
        XUser user = (XUser) session.getAttribute ("USERINFO");

        if (user == null) {
            return XResult.isOk ();
        }
        List<XMessage> message = msgServiceFigen.getMessage (user.getUId (), 1);
        List<XMessage> message2 = msgServiceFigen.getMessage (user.getUId (), 2);
        if (message.size () == 0) {
            session.setAttribute ("msg1Size", 0);
            session.setAttribute ("msg", null);
        }
        List<Map<String, Object>> list = new ArrayList<> ();

        List<Map<String, Object>> list2 = new ArrayList<> ();

        int i = 0;
        for (XMessage sMessage : message2) {
            Map<String, Object> map2 = new HashMap<> ();
            map2.put ("text", sMessage.getmTitle ());
            map2.put ("id", sMessage.getmId ());
            map2.put ("readStatus", sMessage.getmMark ());
            if ("1".equals (sMessage.getmMark ())) {
                i++;
            }
            list2.add (map2);
        }
        int j = 0;
        for (XMessage sMessage : message) {
            Map<String, Object> map = new HashMap<> ();
            map.put ("text", sMessage.getmTitle ());
            map.put ("id", sMessage.getmId ());
            map.put ("readStatus", sMessage.getmMark ());
            if ("1".equals (sMessage.getmMark ())) {
                j++;
            }
            list.add (map);
        }

        session.setAttribute ("msg1Size", j);
        session.setAttribute ("msg", list);
        session.setAttribute ("note1Size", i);
        session.setAttribute ("note", list2);
        return XResult.isOk ();
    }

    @RequestMapping("/delMsg")
    @ResponseBody
    public XResult delMsg(@RequestParam(value = "mId", required = false) int mId) {

        XResult result = msgServiceFigen.delMessage (mId);
        return result;
    }

    @RequestMapping("/touchMsg")
    @ResponseBody
    public XResult touchMsg(@RequestParam(value = "mId", required = false) int mId) {

        XResult result = msgServiceFigen.readMessage (mId);
        return result;
    }

    @RequestMapping("/insertMsg/{bsendId}")
    @ResponseBody
    public XResult insertMsg(@PathVariable int bsendId,HttpSession session){
        System.out.println (bsendId);
        XUser userById = serviceFigen.findUserById (bsendId);
        XUser user = (XUser) session.getAttribute ("USERINFO");
        if (user==null){
            return XResult.failNoMsg ();
        }
        String msg = "<a href='/toUInfo?id="+user.getUId ()+"'>"+user.getUName ()+"</a>"+"要求你当设计师";
        String t = user.getUName ()+"要求你当设计师";
        XMessage message = new XMessage ();
        message.setmBesendId (bsendId);
        message.setmContent (msg);
        message.setmParent (0);
        message.setmSendId (user.getUId ());
        message.setmTitle (t);
        message.setmType (2);
        message.setmMark ("1");
        message.setmTime (new Date ());
        XResult xResult = msgServiceFigen.insertMessage (message);
        return xResult;
    }
}
