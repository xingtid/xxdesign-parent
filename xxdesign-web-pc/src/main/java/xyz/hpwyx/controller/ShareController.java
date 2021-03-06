package xyz.hpwyx.controller;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import xyz.hpwyx.IDutil.IDUtils;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.fegin.ShareServiceFigen;
import xyz.hpwyx.pojo.SearchResult;
import xyz.hpwyx.pojo.XShare;
import xyz.hpwyx.pojo.XUser;

import javax.jms.Destination;
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
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    /**
     * 通过ID获取文章
     * @param sId
     * @param model
     * @return
     */
    @RequestMapping(value = "/getShare/{sId}")
    public String toShare(@PathVariable Integer sId,Model model) {
        XShare xResult = shareServiceFigen.showShare (sId);
        System.out.println (sId);
        model.addAttribute ("share", xResult);
        return "share";
    }

    /**
     * 文章插入
     * @param title
     * @param content
     * @param session
     * @return
     */
    @ResponseBody
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
        //ActivityMQ加入搜索域
        Destination destination = new ActiveMQQueue ("Content_id");
        jmsMessagingTemplate.convertAndSend (destination,  integer + "");
        return xResult;
    }

    /**
     * 获取文章列表
     * @param model
     * @param page
     * @return
     */
    @RequestMapping(value = "/getShareList/{page}")
    public String getShareList( Model model,@PathVariable int page) {


        List<XShare> list = shareServiceFigen.getList (page);
        if (list.size ()<3){
            model.addAttribute ("num",0);
        }else {
            model.addAttribute ("num",1);
        }
        System.out.println (list.size ());
        model.addAttribute ("shareList",list);
        model.addAttribute ("page",page);
        return "shareList";
    }


    /**
     * 导入所有文章到索引库
     * @return
     */
    @RequestMapping("/solr")
    @ResponseBody
    public XResult importAllContent() {

        XResult result = shareServiceFigen.importAllItem ();
        return result;
    }

    /**
     * 搜索
     * @param key
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/search")
    public String search(@RequestParam(value = "key",required=false) String key, Model model) throws Exception{
        System.out.println (key);
        SearchResult search = shareServiceFigen.search (key, 1, 24);
        System.out.println (search.getItemList ().size ());
        if (search.getItemList ().size ()==0){
            return "shareQuery";
        }
        model.addAttribute ("query", key);
        model.addAttribute ("CONTENT", search.getItemList ());
        model.addAttribute ("totalPages", search.getTotalPages ());
        model.addAttribute ("page", 1);

        return "shareQuery";
    }
}
