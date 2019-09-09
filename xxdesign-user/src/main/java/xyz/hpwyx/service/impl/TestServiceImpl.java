package xyz.hpwyx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.mapper.XUserMapper;
import xyz.hpwyx.pojo.XUser;
import xyz.hpwyx.pojo.XUserExample;
import xyz.hpwyx.service.TestService;

import java.util.List;


/**
 * @author tid
 * @create 2019-09-06 1:06 下午
 **/
@RestController
public class TestServiceImpl  implements TestService {
    @Autowired
    XUserMapper xUserMapper;
    @Override
    public XResult test(String phone) {
        XUserExample example = new XUserExample ();
        XUserExample.Criteria criteria = example.createCriteria ();
        criteria.andUPhoneEqualTo ("18896785465");
        List<XUser> xUsers = xUserMapper.selectByExample (example);
        System.out.println (xUsers.get (0).getUName ());
        return  XResult.build (200,"success",new String ("afsfs"));
    }
}
