package xyz.hpwyx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.feign.XadminFeign;
import xyz.hpwyx.pojo.XAdmin;

import java.util.LinkedHashMap;

/**
 * @author tid
 * @create 2019-09-22 1:29 下午
 **/
@RestController
public class LoginController {
    @Autowired
    private XadminFeign xadminFeign;
    @RequestMapping("/adminlogin")
    public XAdmin login(@RequestParam("uPhone") String phone,@RequestParam("uPassword") String password){
        XAdmin xAdmin = new XAdmin ();
        xAdmin.setAUsername (password);
        xAdmin.setAPwd (password);
        XAdmin login = xadminFeign.Login (xAdmin);
        return login ;
    }
}
