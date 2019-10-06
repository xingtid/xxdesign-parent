package xyz.hpwyx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import xyz.hpwyx.service.VipService;

/**
 * @author tid
 * @create 2019-10-05 10:04 下午
 **/
@Controller
public class VipController {
    @Autowired
    private VipService vipService;


}
