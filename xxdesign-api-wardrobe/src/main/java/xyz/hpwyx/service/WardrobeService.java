package xyz.hpwyx.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.pojo.XWardrobe;

import java.util.List;

/**
 * @author tid
 * @create 2019-09-24 9:09 下午
 **/
@RequestMapping("/wardrobe")
public interface WardrobeService {
    @RequestMapping("/insertWard")
    XResult insertWard(@RequestBody XWardrobe xWardrobe);
    @RequestMapping("/getWardList")
    List<XWardrobe> getWardList(@RequestParam("uId") Integer uId);
}
