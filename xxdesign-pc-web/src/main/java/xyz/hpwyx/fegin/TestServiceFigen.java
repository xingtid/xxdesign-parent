package xyz.hpwyx.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import xyz.hpwyx.service.TestService;

/**
 * @author tid
 * @create 2019-07-15 19:19
 **/
@Component
@FeignClient("member")
public interface TestServiceFigen extends TestService {
}
