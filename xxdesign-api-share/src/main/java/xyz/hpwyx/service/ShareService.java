package xyz.hpwyx.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.pojo.SearchResult;
import xyz.hpwyx.pojo.XShare;

import java.util.List;

/**
 * @author tid
 * @create 2019-09-19 1:46 下午
 **/
@RequestMapping("/share")
public interface ShareService {
    /**
     * 更具ID 获取文章内容
     * @param sId
     * @return
     */
    @RequestMapping("/getShare")
    XShare showShare(@RequestParam("sId")Integer sId);

    /**
     * 根据类型获取文章列表
     * @return
     */
    @RequestMapping("/getList")
    List<XShare> getList();

    /**
     * 插入
     * @param xShare
     * @return
     */
    @RequestMapping("/insertShare")
    XResult insertShare(@RequestBody XShare xShare);

    @RequestMapping("/delShare")
    XResult delShare(@RequestParam("sId")Integer sId);
    @RequestMapping("/searchShare")
    List<XShare> searchShare(@RequestParam("key")String key);
    /**
     * 通过solr进行查询
     * @param keyword
     * @param page
     * @param rows
     * @return
     * @throws Exception
     */
    @RequestMapping("/search")
    SearchResult search(@RequestParam("keyword")String keyword,@RequestParam("page") int page, @RequestParam("rows")int rows) throws Exception;

    /**
     * 插入全部数据到solr
     * @return
     */
    @RequestMapping("/importAllItem")
    XResult importAllItem();

}
