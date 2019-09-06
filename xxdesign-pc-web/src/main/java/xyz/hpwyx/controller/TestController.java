package xyz.hpwyx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.hpwyx.baseresult.ResponseBase;
import xyz.hpwyx.fegin.TestServiceFigen;

/**
 * @author tid
 * @create 2019-09-06 1:34 下午
 **/
@CrossOrigin
@RestController
public class TestController {
    @Autowired
    private TestServiceFigen testServiceFigen;
    @RequestMapping("/findAll")
    public ResponseBase findAll(){
        ResponseBase all = testServiceFigen.test ();
        return all;
    }
}
