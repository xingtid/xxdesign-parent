package xyz.hpwyx.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.pojo.XDesign;
import xyz.hpwyx.pojo.XUser;
import xyz.hpwyx.pojo.XUserInfo;

import java.util.List;

/**
 * @author tid
 * @create 2019-09-08 5:03 下午
 **/
@RequestMapping("/user")
public interface UserService {
    /**
     * 登录
     * @param user
     * @return
     */
    @RequestMapping("/baselogin")
    XResult baseLogin(@RequestBody XUser user);
    /**
     * 根据类型获取文章列表
     * @return
     */
    @RequestMapping("/getDesignList")
    List<XUser> getDesignList();
    @RequestMapping("/findById")
    XUser findUserById(@RequestParam("id")Integer id);
    @RequestMapping("/findInfoById")
    XUserInfo findInfoById(@RequestParam("id") Integer id);
    @RequestMapping("/findByPhone")
    XUser findUserByPhone(@RequestParam("phone") String phone);
    @RequestMapping("/findAllUser")
    List<XUser> findAllUser();
    /**
     * 注册用户
     * @param user
     * @return
     */
    @RequestMapping("/register")
    XResult regUser(@RequestBody XUser user);

    @RequestMapping("/findByToken")
    XResult findByToken(@RequestParam("token")String token);

    /**
     * 使用token登录
     * @param openId
     * @return
     */
    @RequestMapping("/findOpenIdUser")
    XResult findOpenIdUser(@RequestParam("openId") String openId);

    /**
     * 判断是否是会员
     * @param sId
     * @return
     */
    @RequestMapping("/isVip")
    XResult isVip(@RequestParam("sId") String sId);
    /**
     * qq登录
     * @param user
     * @return
     */
    @RequestMapping("/qqlogin")
    XResult qqlogin(@RequestBody XUser user);

    @RequestMapping("/changeStates")
     XResult changeStates(@RequestParam("state") String states);


    @RequestMapping("/findByUId")
    XDesign findByUId(@RequestParam("id") Integer id);

    @RequestMapping("/countBy")
    int countBy(@RequestParam("type") String type);
}
