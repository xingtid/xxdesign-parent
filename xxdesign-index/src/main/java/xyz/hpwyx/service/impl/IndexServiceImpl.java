package xyz.hpwyx.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.mapper.XIndexMapper;
import xyz.hpwyx.pojo.XIndex;
import xyz.hpwyx.pojo.XIndexExample;
import xyz.hpwyx.service.IndexService;

import java.util.List;

/**
 * @author tid
 * @create 2019-09-16 4:13 下午
 **/
@Slf4j
@RestController
public class IndexServiceImpl implements IndexService {
    @Autowired
    XIndexMapper indexMapper;

    @Override
    public XResult showIndex() {
        XIndexExample example = new XIndexExample ();
        XIndexExample.Criteria criteria = example.createCriteria ();
        criteria.andITypeEqualTo (1+"");
        List<XIndex> xIndices = indexMapper.selectByExample (example);
        return XResult.isOk (xIndices);
    }
}
