package xyz.hpwyx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.hpwyx.IDutil.IDUtils;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.fegin.ShareServiceFigen;
import xyz.hpwyx.pojo.XShare;
import xyz.hpwyx.pojo.XUser;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @author tid
 * @create 2019-09-19 1:50 下午
 **/
@Controller
public class ShareController {
    @Autowired
    private ShareServiceFigen shareServiceFigen;

    @RequestMapping(value = "/getShare/{sId}")
    public String toShare(@PathVariable Integer sId, Model model) {
        XResult xResult = shareServiceFigen.showShare (sId);
        System.out.println (sId);
        model.addAttribute ("share", xResult.getData ());
        return "share";
    }
    @RequestMapping(value = "/insertShare")
    public XResult insertShare(@RequestParam("sTitle")String title,@RequestParam("sContent")String content,  HttpSession session) {
        XUser user = (XUser) session.getAttribute ("USERINFO");
        XShare xShare = new XShare ();
        xShare.setsAnthId (user.getUId ());
        xShare.setsContent (content);
        xShare.setsGetClick (0);
        xShare.setsTime (new Date ());
        xShare.setsTitle (title);
        Integer integer = IDUtils.genItemId ();
        xShare.setsId (integer);
        System.out.println ("aaaa"+integer);
        //分割出第一张图片地址
        String[] imgs = content.split ("img", 2);
        String[] split;
        String[] split2;
        if (imgs.length > 1) {
            split = imgs[1].split ("src");
            split2 = split[1].split ("\"");
            System.out.println (split2[1]);
            xShare.setsImg (split2[1]);
            //默认图片
        } else {
            xShare.setsImg ("https://ss1.baidu.com/6ONXsjip0QIZ8tyhnq/it/u=4014397714,1926373168&fm=173&app=49&f=JPEG?w=640&h=358&s=E5368674C6317E370696D0430300A098");
        }
        System.out.println ();
        XResult xResult = shareServiceFigen.insertShare (xShare);
        xResult.setMsg (""+integer);
        return xResult;
    }
    @RequestMapping(value = "/getShareList")
    public String getShareList( Model model) {
        List<XShare> list = shareServiceFigen.getList ();
        model.addAttribute ("shareList",list);
        return "shareList";
    }
}
