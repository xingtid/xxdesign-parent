package xyz.hpwyx.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import xyz.hpwyx.service.IndexService;

/**
 * @author tid
 * @create 2019-09-16 7:19 下午
 **/
@Component
@FeignClient("index")
public interface IndexServiceFigen extends IndexService {
}
