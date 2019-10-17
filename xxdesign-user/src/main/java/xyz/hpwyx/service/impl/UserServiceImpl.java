package xyz.hpwyx.service.impl;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.hpwyx.IDutil.IDUtils;
import xyz.hpwyx.baseresult.Constants;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.mapper.XDesignMapper;
import xyz.hpwyx.mapper.XUserInfoMapper;
import xyz.hpwyx.mapper.XUserMapper;
import xyz.hpwyx.pojo.XDesign;
import xyz.hpwyx.pojo.XUser;
import xyz.hpwyx.pojo.XUserExample;
import xyz.hpwyx.pojo.XUserInfo;
import xyz.hpwyx.redis.RedisUtil;
import xyz.hpwyx.service.UserService;
import xyz.hpwyx.token.TokenUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


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
    @Autowired
    private XDesignMapper xDesignMapper;

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

        //调用mapper查找
        return setLogin (user);
    }

    @Override
    public List<XUser> getDesignList() {
        List<XUser> allUserInfoAndDesign = xUserMapper.findAllUserInfoAndDesign ();

        return allUserInfoAndDesign;
    }

    @Override
    public XUser findUserByPhone(@RequestParam String phone) {
        XUser byPhone = xUserMapper.findByPhone (phone);

        return byPhone;
    }

    @Override
    public List<XUser> findAllUser() {
        XUserExample example = new XUserExample ();
        List<XUser> xUsers = xUserMapper.selectByExample (example);
        return xUsers;
    }

    @Override
    public XUser findUserById(@RequestParam("id") Integer id) {
        XUser xUser = xUserMapper.selectByPrimaryKey (id);
        return xUser;
    }

    @Override
    public XUserInfo findInfoById(@RequestParam("id") Integer id) {
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
        user.setUPassword (pwdMD5);
        user.setUCreateAt (new Date ());
        user.setUIsdesign ("not");
        user.setUEx1 ("http://www.hpwyx.xyz:81/group1/M00/00/00/rBM2QlyuAZOABsqEAAApq-VjHyY8..jpeg");
        user.setULoginAt (new Date ());
        //生成ID
        Integer integer = IDUtils.genItemId ();
        user.setUId (integer);
        Integer re = xUserMapper.insert (user);
        XUserInfo xUserInfo = new XUserInfo ();
        xUserInfo.setUId (integer);
        xUserInfo.setUCity ("江苏");
        xUserInfoMapper.insert (xUserInfo);
        if (re <= 0) {
            return XResult.failMsg ("注册失败");
        }
        return XResult.isOk ();
    }

    @Override
    public XResult findByToken(@RequestParam("token") String token) {
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
    public XResult isVip(String sId) {

        return null;
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

    @Override
    public XResult changeStates(@RequestParam("state") String states) {

        return null;
    }

    @Override
    public int countBy(@RequestParam("type") String type) {
        XUserExample example = new XUserExample ();
        XUserExample.Criteria criteria = example.createCriteria ();
        criteria.andUIsdesignEqualTo (type);
        int i = xUserMapper.countByExample (example);
        return i;
    }

    @Override
    public XResult insertIntoUserInfo(@RequestBody XUserInfo xUserInfo) {
        System.out.println (xUserInfo.getUId ());
        int i = xUserInfoMapper.updateByPrimaryKey (xUserInfo);
        System.out.println (i);
        return XResult.isOk ();
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

    @Override
    public XDesign findByUId(@RequestParam("id") Integer id) {
        XDesign xDesign = xDesignMapper.selectByPrimaryKey (id);
        return xDesign;
    }
}
