package xyz.hpwyx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.fegin.CertifiedServiceFigen;
import xyz.hpwyx.pojo.XCertified;

/**
 * @author tid
 * @create 2019-10-12 4:37 下午
 **/
@Controller
public class CertifiedController {
    @Autowired
    private CertifiedServiceFigen serviceFigen;

    @RequestMapping(value = "/addCertified")
    @ResponseBody
    public XResult addCertified(XCertified xCertified){
        XResult xResult = serviceFigen.insertCertified (xCertified);
        return xResult;
    }
}
