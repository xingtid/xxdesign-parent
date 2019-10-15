package xyz.hpwyx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.feign.CertifiedServiceFigen;
import xyz.hpwyx.feign.UserServiceFigen;
import xyz.hpwyx.pojo.XCertified;
import xyz.hpwyx.pojo.XUser;

import java.util.List;

/**
 * @author tid
 * @create 2019-10-13 1:55 下午
 **/
@RestController
public class DesignController {
    @Autowired
    private UserServiceFigen userServiceFigen;

    @Autowired
    private CertifiedServiceFigen certifiedServiceFigen;

    @RequestMapping("/findAlldesign")
    public XResult findAlldesign() {
        List<XUser> alls = userServiceFigen.getDesignList ();
        return XResult.isOk (alls);
    }

    @RequestMapping("/findAllCertified")
    public XResult findAllCertified() {
        List<XCertified> certified = certifiedServiceFigen.findCertified ();
        return XResult.isOk (certified);
    }
}
