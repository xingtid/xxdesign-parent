package xyz.hpwyx.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.mapper.XAdminMapper;
import xyz.hpwyx.pojo.XAdmin;
import xyz.hpwyx.pojo.XAdminExample;
import xyz.hpwyx.service.LoginService;

import java.util.List;

/**
 * @author tid
 * @create 2019-09-22 12:56 下午
 **/
@Slf4j
@RestController
public class LoginServiceImpl implements LoginService {
    @Autowired
    private XAdminMapper xAdminMapper;
    @Override
    public XAdmin Login(@RequestBody XAdmin user) {

        XAdminExample example = new XAdminExample ();
        XAdminExample.Criteria criteria = example.createCriteria ();
        criteria.andAUsernameNotEqualTo (user.getAUsername ());
        criteria.andAPwdEqualTo (user.getAPwd ());

        List<XAdmin> xAdmins = xAdminMapper.selectByExample (example);

        return xAdmins.get (0);
    }
}
