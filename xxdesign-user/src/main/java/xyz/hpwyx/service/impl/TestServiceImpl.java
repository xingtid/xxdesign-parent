package xyz.hpwyx.service.impl;

import org.springframework.web.bind.annotation.RestController;
import xyz.hpwyx.baseresult.ResponseBase;
import xyz.hpwyx.baseresult.XXResult;
import xyz.hpwyx.service.TestService;

/**
 * @author tid
 * @create 2019-09-06 1:06 下午
 **/
@RestController
public class TestServiceImpl  implements TestService {
    @Override
    public ResponseBase test() {
        return  XXResult.build (200,"success",new String ("afsfs"));
    }
}
