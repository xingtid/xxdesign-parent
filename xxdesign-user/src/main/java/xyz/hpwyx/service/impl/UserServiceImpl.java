package xyz.hpwyx.service.impl;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.mapper.XUserMapper;
import xyz.hpwyx.pojo.XUser;
import xyz.hpwyx.redis.RedisUtil;
import xyz.hpwyx.service.UserService;
import xyz.hpwyx.token.TokenUtils;


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
    @Override
    public XResult baseLogin(@RequestBody XUser user) {
        String phone = user.getUPhone ();
        String password = user.getUPassword ();
        //判断师范为空
        if (phone.isEmpty ()) {
            return XResult.failMsg ("用户名不能为空");
        }
        if (password.isEmpty ()) {
            return XResult.failMsg ("密码不能为空");
        }
        //加盐MD5加密
        password = user.getUPassword () + "+1998";
        String pwd = DigestUtils.md5DigestAsHex (password.getBytes ());
        System.out.println (pwd);
        //调用mapper查找
        XUser xUser = xUserMapper.selectByPhoneAndPassword (phone, pwd);
        return setLogin (xUser);
    }

    @Override
    public XResult findUserById(Long id) {
        return null;
    }

    @Override
    public XResult regUser(XUser user) {
        return null;
    }

    @Override
    public XResult login(XUser user) {
        return null;
    }

    @Override
    public XResult findByToken(String token) {
        if (StringUtils.isEmpty (token)) {
            return XResult.failMsg ("token不能为空");

        }
        String token1 = redisUtil.get ("token", 0);
        if (StringUtils.isEmpty (token1)) {
            return XResult.failMsg ("token无效或者过期");
        }
        long l = Long.parseLong (token1);
        XUser byID = xUserMapper.selectByPrimaryKey ((int) l);
        if (byID == null) {
            return XResult.failMsg ("未查找到该用户");
        }
        byID.setUPassword ("");
        return XResult.isOk (byID);
    }

    @Override
    public XResult findOpenIdUser(String openId) {
        return null;
    }

    @Override
    public XResult qqlogin(XUser user) {
        return null;
    }

    /**
     * 放入redis
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
        redisUtil.expire (userToken, 200000, 0);
        log.info ("#### 用户信息 key为{} ####", userToken);
        JSONObject JSONObject = new JSONObject ();
        JSONObject.put ("token", userToken);
        return XResult.isOk (JSONObject);

    }
}
