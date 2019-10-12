package xyz.hpwyx.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import xyz.hpwyx.service.CertifiedService;

/**
 * @author tid
 * @create 2019-10-12 4:34 下午
 **/
@Component
@FeignClient("Certified")
public interface CertifiedServiceFigen extends CertifiedService {
}
