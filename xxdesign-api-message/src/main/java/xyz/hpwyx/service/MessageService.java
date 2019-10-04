package xyz.hpwyx.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.pojo.XMessage;

import java.util.List;

/**
 * @author tid
 * @create 2019-09-26 4:28 下午
 **/
@RequestMapping("/message")
public interface MessageService {
    @RequestMapping("/showMess")
    List<XMessage> showMess(@RequestParam("uId") Integer uId);
    @RequestMapping("/getMessage")
    List<XMessage> getMessage(@RequestParam("uId") Integer uId,@RequestParam("mType") Integer mType);
    @RequestMapping("/delMessage")
    XResult delMessage(@RequestParam("mId")Integer mId);
    @RequestMapping("/readMessage")
    XResult readMessage(@RequestParam("mId")Integer mId);
    @RequestMapping("/insertMessage")
    XResult insertMessage(@RequestBody XMessage message);
}
