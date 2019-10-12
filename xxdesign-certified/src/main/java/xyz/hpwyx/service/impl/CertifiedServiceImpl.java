package xyz.hpwyx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.mapper.XCertifiedMapper;
import xyz.hpwyx.pojo.XCertified;
import xyz.hpwyx.service.CertifiedService;

/**
 * @author tid
 * @create 2019-10-12 4:08 下午
 **/
@RestController
public class CertifiedServiceImpl implements CertifiedService {
    @Autowired
    private XCertifiedMapper xCertifiedMapper;
    @Override
    public XResult insertCertified(@RequestBody XCertified xCertified) {
        xCertifiedMapper.insert (xCertified);
        return XResult.isOk ();
    }
}
