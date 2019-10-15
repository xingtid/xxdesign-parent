package xyz.hpwyx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.feign.ShareServiceFigen;
import xyz.hpwyx.feign.UserServiceFigen;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author tid
 * @create 2019-10-14 10:08 上午
 **/
@RestController
public class IndexController {
    @Autowired
    private UserServiceFigen serviceFigen;

    @Autowired
    private ShareServiceFigen shareServiceFigen;
    @RequestMapping("/count")
    public XResult findAlldesign(HttpServletRequest request) {
        int yesa = serviceFigen.countBy ("yesa");
        int yes = serviceFigen.countBy ("yes");
        request.setAttribute ("vipCount", yes+yesa);
        request.setAttribute ("designCount", yesa);
        Integer integer = shareServiceFigen.shareCount ("null");
        request.setAttribute ("shareCount", integer);
        Map<String,Integer> map = new HashMap<> ();
        map.put ("vipCount", yes+yesa);
        map.put ("designCount", yesa);
        map.put ("shareCount", integer);

        return XResult.isOk (map);
    }
}
