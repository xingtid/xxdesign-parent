package xyz.hpwyx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.feign.UserServiceFigen;
import xyz.hpwyx.pojo.XUser;

import java.util.List;

/**
 * @author tid
 * @create 2019-09-24 10:11 下午
 **/
@RestController
public class UserController {
    @Autowired
    private UserServiceFigen serviceFigen;
    @RequestMapping("/findAll")
    public XResult findAll() {
        List<XUser> allUser = serviceFigen.findAllUser ();
        return XResult.isOk (allUser);
    }
}
