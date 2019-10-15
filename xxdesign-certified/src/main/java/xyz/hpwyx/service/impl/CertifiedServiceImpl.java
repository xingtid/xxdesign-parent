package xyz.hpwyx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.mapper.XCertifiedMapper;
import xyz.hpwyx.pojo.XCertified;
import xyz.hpwyx.pojo.XCertifiedExample;
import xyz.hpwyx.service.CertifiedService;

import java.util.List;

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

    @Override
    public List<XCertified> findCertified() {
        XCertifiedExample example = new XCertifiedExample ();
        XCertifiedExample.Criteria criteria = example.createCriteria ();
        criteria.andRTypeNotEqualTo (0);
        List<XCertified> xCertifieds = xCertifiedMapper.selectByExample (example);

        return xCertifieds;
    }

    @Override
    public XResult changeErtified(@RequestParam("id")int id) {

        XCertified xCertified = xCertifiedMapper.selectByPrimaryKey (id);
        xCertified.setrType (0);
        int i = xCertifiedMapper.updateByPrimaryKey (xCertified);
        return XResult.isOk ();
    }
}
