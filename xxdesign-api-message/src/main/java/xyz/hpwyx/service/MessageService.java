package xyz.hpwyx.service;

import org.springframework.web.bind.annotation.RequestMapping;
import xyz.hpwyx.pojo.XMessage;

import java.util.List;

/**
 * @author tid
 * @create 2019-09-26 4:28 下午
 **/
@RequestMapping("/message")
public interface MessageService {
    @RequestMapping("/showPic")
    List<XMessage> showPic();
}
