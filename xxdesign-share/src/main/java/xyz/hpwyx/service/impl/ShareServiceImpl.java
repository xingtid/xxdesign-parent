package xyz.hpwyx.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.hpwyx.baseresult.IndexPojo;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.mapper.XShareMapper;
import xyz.hpwyx.pojo.XShare;
import xyz.hpwyx.pojo.XShareExample;
import xyz.hpwyx.service.ShareService;

import java.util.List;

/**
 * @author tid
 * @create 2019-09-19 1:48 下午
 **/
@Slf4j
@RestController
public class ShareServiceImpl implements ShareService {
    @Autowired
    private XShareMapper shareMapper;
    @Override
    public XResult showShare(@RequestParam("sId")Integer sId) {
        XShare xShare = shareMapper.selectShareAndUserById (sId);
        return XResult.isOk (xShare);
    }

    @Override
    public List<XShare> getList() {
        List<XShare> xShares = shareMapper.selectShareAndUser ();
        return xShares;
    }

    @Override
    public XResult insertShare(XShare xShare) {
        int insert = shareMapper.insert (xShare);
        if (insert<0){
            return XResult.failMsg ("插入失败");
        }
        return XResult.isOk ();
    }
}
