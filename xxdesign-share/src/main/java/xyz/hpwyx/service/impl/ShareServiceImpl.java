package xyz.hpwyx.service.impl;

import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.common.SolrInputDocument;
import org.bouncycastle.asn1.cmc.IdentityProofV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.hpwyx.baseresult.IndexPojo;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.mapper.XShareMapper;
import xyz.hpwyx.pojo.SearchResult;
import xyz.hpwyx.pojo.XShare;
import xyz.hpwyx.pojo.XShareExample;
import xyz.hpwyx.search.SearchDao;
import xyz.hpwyx.service.ShareService;

import java.util.List;

/**
 * @author tid
 * @create 2019-09-19 1:48 下午
 **/
@Slf4j
@RestController
public class ShareServiceImpl implements ShareService {
    @Autowired
    private XShareMapper shareMapper;
    @Override
    public XShare showShare(@RequestParam("sId")Integer sId) {
        XShare xShare = shareMapper.selectShareAndUserById (sId);
        return xShare;
    }

    @Override
    public List<XShare> getList() {
        PageHelper.startPage (0, 12);
        List<XShare> xShares = shareMapper.selectShareAndUser ();
        return xShares;
    }

    @Override
    public XResult insertShare(XShare xShare) {
        int insert = shareMapper.insert (xShare);
        if (insert<0){
            return XResult.failMsg ("插入失败");
        }
        return XResult.isOk ();
    }

    @Override
    public XResult delShare(Integer sId) {
        int i = shareMapper.deleteByPrimaryKey (sId);
        if (i<0){
            return XResult.failNoMsg ();
        }else {
            return XResult.isOk ();
        }
    }

    @Override
    public List<XShare> searchShare(String key) {
        List<XShare> xShares = shareMapper.selectByKeyShareAndUser (key);
        return xShares;
    }

    @Autowired
    private SearchDao searchDao;
    @Autowired
    private SolrClient solrServer;
    @Override
    public SearchResult search(@RequestParam("keyword")String keyword,@RequestParam("page") int page, @RequestParam("rows")int rows) throws Exception {
        SolrQuery solrQuery = new SolrQuery ();
        solrQuery.setQuery (keyword);
        if (page <= 0) page = 1;
        solrQuery.setStart ((page - 1) * rows);
        solrQuery.setRows (rows);
        //设置搜索域
        solrQuery.set ("df", "item_title");
        SearchResult searchResult = searchDao.SearchResult (solrQuery);
        long recordCount = searchResult.getRecordCount ();
        int totle = (int) (recordCount / rows);
        if (recordCount % rows > 0) {
            totle++;
        }
        searchResult.setTotalPages (totle);
        return searchResult;
    }

    @Override
    public XResult importAllItem() {
        //查找商品对象
        List<XShare> itemList = shareMapper.selectAllShareAndUser ();
        try {
            //遍历商品对象
            for (XShare sContent : itemList) {
                //创建文档对象
                SolrInputDocument document = new SolrInputDocument ();
                //向文档对象中添加域
                document.addField ("id", sContent.getsId ());
                document.addField ("item_title", sContent.getsTitle ());
                document.addField ("item_image", sContent.getsImg ());
                document.addField ("item_get_click", sContent.getsGetClick ());
                document.addField ("item_user_name",sContent.getxUser ().getUName ());
                document.addField ("item_user_img",sContent.getxUser ().getUEx1 ());
                //把文档对象写入索引库
                solrServer.add (document);
            }
            //提交
            solrServer.commit ();
            return XResult.isOk ();
        } catch (Exception e) {
            e.printStackTrace ();
            return XResult.build (500, "异常",null);
        }
    }
}
