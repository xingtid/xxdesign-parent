package xyz.hpwyx.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.hpwyx.baseresult.XResult;

import xyz.hpwyx.mapper.XWardrobeMapper;
import xyz.hpwyx.pojo.XWardrobe;
import xyz.hpwyx.pojo.XWardrobeExample;
import xyz.hpwyx.service.WardrobeService;

import java.util.Date;
import java.util.List;

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
    public XResult insertWard(@RequestBody XWardrobe xWardrobe) {
        xWardrobe.setWCreateTime (new Date ());

        int insert = wardrobeMapper.insert (xWardrobe);
        if (insert > 0) {
            return XResult.isOk ();
        }
        return XResult.failNoMsg ();
    }

    @Override
    public List<XWardrobe> getWardList(@RequestParam("uId") Integer uId) {
        XWardrobeExample example = new XWardrobeExample ();
        XWardrobeExample.Criteria criteria = example.createCriteria ();
        criteria.andWUseridEqualTo (uId);
        List<XWardrobe> xWardrobes = wardrobeMapper.selectByExample (example);
        return xWardrobes;
    }
}
