package xyz.hpwyx.service;

import org.springframework.web.bind.annotation.RequestMapping;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.pojo.XWardrobe;

/**
 * @author tid
 * @create 2019-09-24 9:09 下午
 **/
@RequestMapping("/wardrobe")
public interface WardrobeService {
    @RequestMapping("/insertWard")
    XResult insertWard(XWardrobe xWardrobe);
}
