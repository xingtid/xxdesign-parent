package xyz.hpwyx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.feign.VipServiceFigen;
import xyz.hpwyx.pojo.XVip;

import java.util.List;

/**
 * @author tid
 * @create 2019-10-10 6:37 下午
 **/
@RestController
public class VipController {
    @Autowired
    VipServiceFigen vipServiceFigen;

    @RequestMapping("/findAllVIP")
        public XResult findAll() {
        List<XVip> allVip = vipServiceFigen.findAllVip ();
        return XResult.isOk (allVip);
    }
}
