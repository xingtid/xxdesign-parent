package xyz.hpwyx.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import xyz.hpwyx.service.VipService;

/**
 * @author tid
 * @create 2019-10-05 10:05 下午
 **/
@Component
@FeignClient("vip")
public interface VipServiceFigen extends VipService {
}
