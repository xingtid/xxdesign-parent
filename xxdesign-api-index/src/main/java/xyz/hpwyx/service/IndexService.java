package xyz.hpwyx.service;

import org.springframework.web.bind.annotation.RequestMapping;
import xyz.hpwyx.baseresult.XResult;

/**
 * @author tid
 * @create 2019-09-16 4:10 下午
 **/
@RequestMapping("/index")
public interface IndexService {
    @RequestMapping("/show")
    XResult showIndex();
}
