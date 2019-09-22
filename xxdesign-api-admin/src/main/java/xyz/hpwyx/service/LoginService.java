package xyz.hpwyx.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.pojo.XAdmin;

/**
 * @author tid
 * @create 2019-09-22 12:53 下午
 **/
@RequestMapping("/admin")
public interface LoginService {
    @RequestMapping("/adminlogin")
    XAdmin Login(@RequestBody XAdmin user);
}
