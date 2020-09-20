package xyz.hpwyx.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.mapper.XMessageMapper;
import xyz.hpwyx.pojo.XMessage;
import xyz.hpwyx.pojo.XMessageExample;
import xyz.hpwyx.service.MessageService;

import java.util.List;

/**
 * @author tid
 * @create 2019-10-03 7:21 下午
 **/
@Slf4j
@RestController
public class MessageServiceImpl implements MessageService {
    @Autowired
    private XMessageMapper messageMapper;
    @Override
    public List<XMessage> showMess(@RequestParam("uId") Integer uId) {
        List<XMessage> xMessages = messageMapper.selectAll (uId);
        return xMessages;
    }

    @Override
    public List<XMessage> getMessage(@RequestParam("uId") Integer uId,@RequestParam("mType") Integer mType) {
        XMessageExample example = new XMessageExample ();
        XMessageExample.Criteria criteria = example.createCriteria ();
        criteria.andMBesendIdEqualTo (uId);
        criteria.andMTypeEqualTo (mType);
        List<XMessage> sMessages = messageMapper.selectByExample (example);
        return sMessages;
    }

    @Override
    public XResult delMessage(Integer mId) {
        int i = messageMapper.deleteByPrimaryKey (mId);
        return XResult.isOk ();
    }

    @Override
    public XResult readMessage(Integer mId) {
//        int i = messageMapper.updateMark (mId);

        return XResult.isOk ();
    }

    @Override
    public XResult insertMessage(XMessage message) {
        int insert = messageMapper.insert (message);
        System.out.println ("insert"+insert);
        return XResult.isOk ();
    }


}
