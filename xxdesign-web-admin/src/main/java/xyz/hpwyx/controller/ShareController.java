package xyz.hpwyx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.feign.ShareServiceFigen;
import xyz.hpwyx.pojo.XShare;

import java.util.List;

/**
 * @author tid
 * @create 2019-09-26 4:23 下午
 **/
@RestController
public class ShareController {
    @Autowired
    private ShareServiceFigen serviceFigen;
    @RequestMapping("/findAllShare")
    public XResult findAll() {
        List<XShare> alls = serviceFigen.getList (1);
        return XResult.isOk (alls);
    }
    @RequestMapping("/delShare/{sid}")
    public XResult delShare(@PathVariable int sid) {
        System.out.println (sid);
        XResult xResult = serviceFigen.delShare (sid);
        return xResult;
    }
    @RequestMapping("/searchShare/{key}")
    public XResult delShare(@PathVariable String key) {
        System.out.println (key);
        List<XShare> xShares = serviceFigen.searchShare (key);
        return XResult.isOk (xShares);
    }
}
