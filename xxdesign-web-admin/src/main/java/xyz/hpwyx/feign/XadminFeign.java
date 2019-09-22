package xyz.hpwyx.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import xyz.hpwyx.pojo.XAdmin;
import xyz.hpwyx.service.LoginService;

/**
 * @author tid
 * @create 2019-09-22 1:16 下午
 **/
@Component
@FeignClient("admin")
public interface XadminFeign extends LoginService {
}
