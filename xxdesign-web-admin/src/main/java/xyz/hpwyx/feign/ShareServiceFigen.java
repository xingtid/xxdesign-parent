package xyz.hpwyx.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import xyz.hpwyx.service.ShareService;

/**
 * @author tid
 * @create 2019-09-19 1:51 下午
 **/
@Component
@FeignClient("share")
public interface ShareServiceFigen extends ShareService {
}
