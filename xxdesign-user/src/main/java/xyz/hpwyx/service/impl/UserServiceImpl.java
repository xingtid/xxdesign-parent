package xyz.hpwyx.service.impl;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.hpwyx.baseresult.Constants;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.mapper.XUserInfoMapper;
import xyz.hpwyx.mapper.XUserMapper;
import xyz.hpwyx.pojo.XUser;
import xyz.hpwyx.pojo.XUserInfo;
import xyz.hpwyx.redis.RedisUtil;
import xyz.hpwyx.service.UserService;
import xyz.hpwyx.token.TokenUtils;

import java.util.Date;


/**
 * @author tid
 * @create 2019-09-08 5:04 下午
 **/
@Slf4j
@RestController
public class UserServiceImpl implements UserService {
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    XUserMapper xUserMapper;
    @Autowired
    XUserInfoMapper xUserInfoMapper;
    @Override
    public XResult baseLogin(@RequestBody XUser user) {
        String phone = user.getUPhone ();
        String password = user.getUPassword ();

        //判断为空
        if (phone.isEmpty ()) {
            return XResult.failMsg ("用户名不能为空");
        }
        if (password.isEmpty ()) {
            return XResult.failMsg ("密码不能为空");
        }
        //加盐MD5加密
        password = user.getUPassword () + "+1998";
        String pwd = DigestUtils.md5DigestAsHex (password.getBytes ());

        //shiro进入
        Subject subject = SecurityUtils.getSubject ();
        UsernamePasswordToken token = new UsernamePasswordToken (phone, pwd);
        try {
            subject.login (token);
        } catch (UnknownAccountException e) {
            return XResult.build (400, "用户名不存在", null);
        } catch (IncorrectCredentialsException e) {
            return XResult.build (400, "密码错误", null);
        }

        XUser xUser = xUserMapper.findByPhone (token.getUsername ());
        //调用mapper查找
        return setLogin (xUser);
    }

    @Override
    public XResult findUserByPhone(String phone) {
        XUser byPhone = xUserMapper.findByPhone (phone);

        return XResult.isOk (byPhone);
    }

    @Override
    public XUser findUserById(@RequestParam("id")Integer id) {
        XUser xUser = xUserMapper.selectByPrimaryKey (id);
        return xUser;
    }

    @Override
    public XUserInfo findInfoById(@RequestParam("id") Integer id){
        XUserInfo xUserInfo = xUserInfoMapper.selectByPrimaryKey (id);
        return xUserInfo;
    }
    @Override
    public XResult regUser(XUser user) {
        String password = user.getUPassword () + "+1998";
        System.out.println (password);
        if (StringUtils.isEmpty (password)) {
            return XResult.failNoMsg ();
        }
        String pwdMD5 = DigestUtils.md5DigestAsHex (password.getBytes ());
        System.out.println (pwdMD5);
        user.setUPassword (pwdMD5);
        user.setUCreateAt (new Date ());
        user.setUIsdesign ("not");
        user.setULoginAt (new Date ());
        Integer re = xUserMapper.insert (user);
        if (re <= 0) {
            return XResult.failMsg ("注册失败");
        }
        return XResult.isOk ();
    }


    @Override
    public XResult findByToken(@RequestParam("token")  String token) {
        if (StringUtils.isEmpty (token)) {
            return XResult.failMsg ("token不能为空");
        }
        String token1 = redisUtil.get (token, 0);
        if (StringUtils.isEmpty (token1)) {
            return XResult.failMsg ("token无效或者过期");
        }
        Integer l = Integer.parseInt (token1);
        XUser user = xUserMapper.selectByPrimaryKey (l);
        if (user == null) {
            return XResult.failMsg ("未查找到该用户");
        }
        user.setUPassword ("");
        return XResult.isOk (user);
    }

    @Override
    public XResult findOpenIdUser(String openId) {
        //验证参数
        if (StringUtils.isEmpty (openId)) {
            return XResult.failMsg ("系统错误");
        }
        //使用openid查询数据库对应的信息
        XUser user = xUserMapper.findOpenIdUser (openId);
        if (user == null) {
            return XResult.build (Constants.HTTP_RES_CODE_201, "该openID没有关联", null);
        }
        //自动登录
        XResult responseBase = setLogin (user);
        return responseBase;
    }

    @Override
    public XResult qqlogin(XUser user) {
        //1.验证参数
        String openId = user.getUOpenid ();
        if (StringUtils.isEmpty (openId)) {
            return XResult.failMsg ("openId不能为空");
        }
        //2.登录 数据库修改openid
        XResult setLogin = baseLogin (user);
        if (!setLogin.getRtnCode ().equals (Constants.HTTP_RES_CODE_200)) {
            //失败
            return setLogin;
        }
        //成功
        JSONObject data = (JSONObject) setLogin.getData ();
        String token = data.getString ("memberToken");
        XResult byToken = findByToken (token);
        if (byToken.getRtnCode () != 200) {
            return XResult.failMsg ("失败");
        }
        XUser userPojo = (XUser) byToken.getData ();

        Integer integer = xUserMapper.updateOpenIdUser (openId, userPojo.getUId ());
        if (integer <= 0) {
            return XResult.failMsg ("账号关联失败");
        }
        return setLogin;
    }

    /**
     * 放入redis
     *
     * @param userPojo
     * @return
     */
    private XResult setLogin(XUser userPojo) {
        if (userPojo == null) {
            return XResult.failMsg ("用户名或密码错误");
        }
        Integer id = userPojo.getUId ();
        String userToken = TokenUtils.getUserToken ();
        redisUtil.set (userToken, id + "", 0);
        redisUtil.expire (userToken, 20000, 0);
        log.info ("#### 用户信息 key为{} ####", userToken);
        JSONObject jsonObject = new JSONObject ();
        jsonObject.put ("token", userToken);
        return XResult.isOk (jsonObject);
    }
}
