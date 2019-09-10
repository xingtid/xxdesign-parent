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
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.cookie.CookieUtil;
import xyz.hpwyx.fegin.UserServiceFigen;
import xyz.hpwyx.iputil.GetIp;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedHashMap;

/**
 * @author tid
 * @create 2019-09-09 4:20 下午
 **/
@Slf4j
@Controller
public class IndexController {
    @Autowired
    private UserServiceFigen serviceFigen;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(HttpServletRequest reqest) {
        // 1.从cookie中获取 token信息
        String token = CookieUtil.getUid(reqest, Constants.COOKIE_TOKEN);
        // 2.如果cookie 存在 token，调用会员服务接口，使用token查询用户信息
        if (!StringUtils.isEmpty(token)) {
            XResult responseBase = serviceFigen.findByToken(token);
            //如果正确获取用户信息发送到前端
            if (responseBase.getRtnCode().equals(Constants.HTTP_RES_CODE_200)) {
                LinkedHashMap userData = (LinkedHashMap) responseBase.getData();
                String username = (String) userData.get("username");
                reqest.setAttribute("username", username);
            }
        }
        return "index";
    }
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page, HttpServletRequest request, Model model) {
        String ipAddress = GetIp.getIpAddress (request);
        log.info ("page:" + ipAddress + " " + page);
        String url = request.getHeader ("REFERER");
        System.out.println (url);
        model.addAttribute ("REFERER", url);
        return page;
    }
}
