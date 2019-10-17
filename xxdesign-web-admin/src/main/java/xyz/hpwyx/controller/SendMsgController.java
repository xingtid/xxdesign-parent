package xyz.hpwyx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.feign.MsgServiceFigen;
import xyz.hpwyx.pojo.XMessage;
import xyz.hpwyx.service.MessageService;

import java.util.Date;

/**
 * @author xh
 * @create 2019-10-17 6:59 下午
 **/
@RestController
public class SendMsgController {
    @Autowired
    private MsgServiceFigen messageService;
    @RequestMapping("/sendMsg/{id}/{msg}")
    public XResult sendMsg(@PathVariable int id,@PathVariable String msg){
        XMessage xMessage = new XMessage ();
        xMessage.setmBesendId (id);
        xMessage.setmType (0);
        xMessage.setmParent (0);
        xMessage.setmTime (new Date ());
        xMessage.setmTitle (msg);
        xMessage.setmContent (msg);
        XResult xResult = messageService.insertMessage (xMessage);
        return xResult;
    }
}
