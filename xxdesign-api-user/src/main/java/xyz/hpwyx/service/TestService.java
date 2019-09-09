package xyz.hpwyx.service;

import org.springframework.web.bind.annotation.RequestMapping;
import xyz.hpwyx.baseresult.XResult;

/**
 * @author tid
 * @create 2019-09-06 10:18 上午
 **/
@RequestMapping("/member")
public interface TestService {
    @RequestMapping("/test")
    XResult test(String phone);
}
