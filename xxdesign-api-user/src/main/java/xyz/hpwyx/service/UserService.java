package xyz.hpwyx.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.pojo.XUser;

/**
 * @author tid
 * @create 2019-09-08 5:03 下午
 **/
@RequestMapping("/user")
public interface UserService {
    @RequestMapping("/baselogin")
    XResult baseLogin(@RequestBody XUser user);

    @RequestMapping("/findById")
    XResult findUserById(Long id);
    @RequestMapping("/findByPhone")
    XResult findUserByPhone(String phone);
    @RequestMapping("/register")
    XResult regUser(@RequestBody XUser user);

    @RequestMapping("/findByToken")
    XResult findByToken(@RequestParam("token")String token);

    //使用token登录
    @RequestMapping("/findOpenIdUser")
    XResult findOpenIdUser(@RequestParam("openId") String openId);

    //qq登录
    @RequestMapping("/qqlogin")
    XResult qqlogin(@RequestBody XUser user);
}
