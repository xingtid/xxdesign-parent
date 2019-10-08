package xyz.hpwyx.search;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.hpwyx.baseresult.XUser;
import xyz.hpwyx.pojo.SearchItem;
import xyz.hpwyx.pojo.SearchResult;

import java.util.ArrayList;
import java.util.List;

/**
 * Dao
 *
 * @author tid
 * @create 2019-01-25 10:10
 **/
@Service
public class SearchDao {
    @Autowired
    private SolrClient solrServer;

    public SearchResult SearchResult(SolrQuery solrQuery) throws Exception {
        QueryResponse queryResponse = solrServer.query (solrQuery);
        SolrDocumentList results = queryResponse.getResults ();
        long numFound = results.getNumFound ();
        SearchResult searchResult = new SearchResult ();
        searchResult.setRecordCount (numFound);

        List<SearchItem> list = new ArrayList<> ();
        for (SolrDocument result : results) {
            SearchItem item = new SearchItem ();
            item.setcId (Integer.parseInt ((String) result.get ("id")));
            item.setcTitle ((String) result.get ("item_title"));
            item.setcImg ((String) result.get ("item_image"));
            item.setcGetClick ((Integer) result.get ("item_get_click"));
            XUser user = new XUser ();
            user.setUName ((String) result.get ("item_user_name"));
            user.setUEx1 ((String) result.get ("item_user_img"));
            item.setUser (user);

            list.add (item);

        }
        searchResult.setItemList (list);
        return searchResult;

    }

}
