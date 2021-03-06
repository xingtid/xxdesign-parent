package xyz.hpwyx.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.pojo.XDesign;
import xyz.hpwyx.pojo.XUserInfo;

/**
 * @author tid
 * @create 2019-09-24 6:49 下午
 **/
@RequestMapping("/userinfo")
public interface UserInfoService {
    /**
     * 添加用户
     * @param xUserInfo
     * @return
     */
    @RequestMapping("/insertUserOtherInfo")
    XResult insertUserOtherInfo(XUserInfo xUserInfo);

    @RequestMapping("/findAllUser")
    XResult findAllUser();

}
