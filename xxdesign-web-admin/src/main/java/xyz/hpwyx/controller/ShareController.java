package xyz.hpwyx.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
        List<XShare> alls = serviceFigen.getList ();
        return XResult.isOk (alls);
    }
}
