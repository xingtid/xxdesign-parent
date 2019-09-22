package xyz.hpwyx.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import xyz.hpwyx.service.UserService;

/**
 * @author tid
 * @create 2019-09-08 5:03 下午
 **/
@Component
@FeignClient("user")
public interface UserServiceFigen extends UserService {

}
