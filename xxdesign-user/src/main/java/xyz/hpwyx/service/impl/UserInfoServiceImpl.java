package xyz.hpwyx.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.mapper.XUserInfoMapper;
import xyz.hpwyx.pojo.XUserInfo;
import xyz.hpwyx.service.UserInfoService;

/**
 * @author tid
 * @create 2019-09-24 6:48 下午
 **/
@Slf4j
@RestController
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private XUserInfoMapper xUserInfoMapper;
    @Override
    public XResult insertUserOtherInfo(XUserInfo xUserInfo) {
        int insert = xUserInfoMapper.insert (xUserInfo);
        if (insert>0){
            return XResult.isOk ();
        }
        return XResult.failNoMsg ();
    }

    @Override
    public XResult findAllUser() {

        return null;
    }
}
