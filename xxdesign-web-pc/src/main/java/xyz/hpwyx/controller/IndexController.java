package xyz.hpwyx.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xyz.hpwyx.baseresult.Constants;
import xyz.hpwyx.baseresult.DesignPojo;
import xyz.hpwyx.baseresult.IndexPojo;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.cookie.CookieUtil;
import xyz.hpwyx.fegin.IndexServiceFigen;
import xyz.hpwyx.fegin.UserServiceFigen;
import xyz.hpwyx.iputil.GetIp;
import xyz.hpwyx.json.JsonUtils;
import xyz.hpwyx.pojo.XIndex;
import xyz.hpwyx.pojo.XUser;
import xyz.hpwyx.redis.RedisUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author tid
 * @create 2019-09-09 4:20 下午
 **/
@Slf4j
@Controller
public class IndexController {
    @Autowired
    RedisUtil redisUtil;
    @Autowired
    private IndexServiceFigen indexServiceFigen;
    @Autowired
    private UserServiceFigen serviceFigen;

    @Autowired
    MsgController msgController;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(HttpServletRequest reqest, HttpSession session) {


        try {
            String json3 = redisUtil.hget ("INDEX", "index_pic1");
            if (StringUtils.isNotBlank (json3)) {
                System.out.println ("取出缓存");
                reqest.setAttribute ("index_pic1", JsonUtils.jsonToList (json3, XIndex.class));
            }else {
                List<XIndex> xResult = indexServiceFigen.showPic ();
                reqest.setAttribute ("index_pic1", xResult);

                redisUtil.hset ("INDEX", "index_pic1", JsonUtils.objectToJson (xResult));
                redisUtil.expire ("INDEX", 20000, 0);
            }
        }catch (Exception e) {
            e.printStackTrace ();
        }

        List<IndexPojo> indexPojos1 = indexServiceFigen.showShare ();

        reqest.setAttribute ("shareList",indexPojos1);
        List<DesignPojo> indexPojos = indexServiceFigen.showDesign ();
        reqest.setAttribute ("designList", indexPojos);
        List<XIndex> xIndices = indexServiceFigen.showService ();
        reqest.setAttribute ("serviceList", xIndices);


        // 1.从cookie中获取 token信息
        String token = CookieUtil.getUid (reqest, Constants.COOKIE_TOKEN);
//        System.out.println ("token"+token);
        // 2.如果cookie 存在 token，调用会员服务接口，使用token查询用户信息
        if (!StringUtils.isEmpty (token)) {
            XResult responseBase = serviceFigen.findByToken (token);
            //如果正确获取用户信息发送到前端
            XUser getuser = getuser (responseBase);

            if (getuser != null) {
                session.setAttribute ("USERINFO", getuser);
                msgController.refreshA (reqest.getSession ());
            }

        }
        return "index";
    }

    @RequestMapping("/login.html")
    public String toLogin(HttpServletRequest request, HttpSession session) {
        // 1.从cookie中获取 token信息
        String token = CookieUtil.getUid (request, Constants.COOKIE_TOKEN);
        System.out.println ("login");
        // 2.如果cookie 存在 token，调用会员服务接口，使用token查询用户信息
        if (!StringUtils.isEmpty (token)) {
            XResult responseBase = serviceFigen.findByToken (token);
            //如果正确获取用户信息发送到前端
            XUser getuser = getuser (responseBase);
            if (getuser != null) {
                session.setAttribute ("USERINFO", getuser);
                msgController.refreshA (request.getSession ());
                return "redirect:/";
            }
        }
        return "login";
    }

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page, HttpServletRequest request, Model model) {
        String ipAddress = GetIp.getIpAddress (request);
        if (request.getSession ().getAttribute ("USERINFO") != null) {
            log.info ("page:" + ipAddress + " " + page);
            String url = request.getHeader ("REFERER");
            System.out.println (url);
            System.out.println ("page:" + page);
            model.addAttribute ("REFERER", url);
            return page;
        }else
        if ("isContent.html".equals (page)) {
            log.info ("page:" + ipAddress + " " + page);
            String url = request.getHeader ("REFERER");
            System.out.println (url);
            System.out.println ("page:" + page);
            model.addAttribute ("REFERER", url);
            return "login";
        }

        return page;
    }

    @RequestMapping("/{path}/{page}.html")
    public String showPage2(@PathVariable String path, @PathVariable String page, HttpServletRequest request, Model model) {
        String ipAddress = GetIp.getIpAddress (request);
        log.info ("page:" + ipAddress + " " + page);
        String url = request.getHeader ("REFERER");
        System.out.println (url);
        System.out.println ("page:" + page);
        model.addAttribute ("REFERER", url);
        return path + "/" + page;
    }

    private XUser getuser(XResult responseBase) {
        if (responseBase.getRtnCode ().equals (Constants.HTTP_RES_CODE_200)) {
            LinkedHashMap userData = (LinkedHashMap) responseBase.getData ();
            String username = (String) userData.get ("uname");
            String img = (String) userData.get ("uex1");
            String uphone = (String) userData.get ("uphone");
            String uisdesign = (String) userData.get ("uisdesign");
            String uopenid = (String) userData.get ("uopenid");
            String uip = (String) userData.get ("uip");
            Integer uId = (Integer) userData.get ("uid");
            XUser xUser = new XUser ();
            xUser.setUPhone (uphone);
            xUser.setUName (username);
            xUser.setUEx1 (img);
            xUser.setUId (uId);
            xUser.setUIp (uip);
            xUser.setUIsdesign (uisdesign);
            xUser.setUOpenid (uopenid);
            return xUser;
        }
        return null;
    }
}
