package xyz.hpwyx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.fegin.WardrobeFeign;
import xyz.hpwyx.pojo.XWardrobe;

/**
 * @author tid
 * @create 2019-09-24 9:34 下午
 **/
@Controller
public class WardrobeController {

    @Autowired
    private WardrobeFeign wardrobeFeign;
    @RequestMapping(value = "/insertWard")
    public XResult insertWard(XWardrobe xWardrobe){
        XResult xResult = wardrobeFeign.insertWard (xWardrobe);

        return xResult;
    }
}
