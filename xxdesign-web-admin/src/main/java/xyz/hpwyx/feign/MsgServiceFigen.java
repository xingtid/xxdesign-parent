package xyz.hpwyx.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import xyz.hpwyx.service.MessageService;

/**
 * @author tid
 * @create 2019-10-03 7:37 下午
 **/
@Component
@FeignClient("message")
public interface MsgServiceFigen extends MessageService {
}
