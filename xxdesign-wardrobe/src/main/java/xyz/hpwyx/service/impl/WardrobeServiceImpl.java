package xyz.hpwyx.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.mapper.XWardrobeMapper;
import xyz.hpwyx.pojo.XWardrobe;
import xyz.hpwyx.service.WardrobeService;

/**
 * @author tid
 * @create 2019-09-24 9:07 下午
 **/
@Slf4j
@RestController
public class WardrobeServiceImpl implements WardrobeService {
    @Autowired
    private XWardrobeMapper wardrobeMapper;

    @Override
    public XResult insertWard(XWardrobe xWardrobe) {
        int insert = wardrobeMapper.insert (xWardrobe);
        if (insert > 0) {
            return XResult.isOk ();
        }
        return XResult.failNoMsg ();
    }
}
