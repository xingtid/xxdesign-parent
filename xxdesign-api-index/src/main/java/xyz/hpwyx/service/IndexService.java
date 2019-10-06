package xyz.hpwyx.service;

import org.springframework.web.bind.annotation.RequestMapping;
import xyz.hpwyx.baseresult.DesignPojo;
import xyz.hpwyx.baseresult.IndexPojo;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.pojo.XIndex;

import java.util.List;

/**
 * @author tid
 * @create 2019-09-16 4:10 下午
 **/
@RequestMapping("/index")
public interface IndexService {
    @RequestMapping("/showPic")
    List<XIndex> showPic();
    @RequestMapping("/showShare")
    List<IndexPojo> showShare();
    @RequestMapping("/showDesign")
    List<DesignPojo> showDesign();
    @RequestMapping("/showService")
    List<XIndex> showService();
}
