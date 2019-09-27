package xyz.hpwyx.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import xyz.hpwyx.service.WardrobeService;

/**
 * @author tid
 * @create 2019-09-24 9:34 下午
 **/
@Component
@FeignClient("wardrobe")
public interface WardrobeFeign extends WardrobeService {
}
