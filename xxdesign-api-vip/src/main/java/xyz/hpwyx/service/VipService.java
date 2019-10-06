package xyz.hpwyx.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.hpwyx.baseresult.XResult;

/**
 * @author tid
 * @create 2019-10-05 10:01 下午
 **/
@RequestMapping("/vip")
public interface VipService {
    /**
     * @return
     */
    @RequestMapping("/addVip")
    XResult addVip();

}
