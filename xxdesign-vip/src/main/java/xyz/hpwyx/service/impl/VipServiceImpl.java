package xyz.hpwyx.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.mapper.XVipMapper;
import xyz.hpwyx.service.VipService;

/**
 * @author tid
 * @create 2019-10-05 10:03 下午
 **/
@Slf4j
@RestController
public class VipServiceImpl  implements VipService {
    @Autowired
    private XVipMapper xVipMapper;

    @Override
    public XResult addVip() {
        return null;
    }
}
