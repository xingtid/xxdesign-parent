package xyz.hpwyx.mapper;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import xyz.hpwyx.pojo.XShare;


/**
 * @author tid
 * @create 2019-04-22 16:27
 * 接收消息 加入solr索引库
 **/
@Component
public class ContentMessageListener {
    @Autowired
    private XShareMapper contentMapper;

    @Autowired
    private SolrClient solrClient;
    @JmsListener(destination = "Content_id")
    public void onMessage(String message) {
        try {
            int id = new Integer (message);
            Thread.sleep (1000);
            XShare sContent ;
            sContent = contentMapper.selectShareAndUserById (id);
            SolrInputDocument document = new SolrInputDocument ();
            //向文档对象中添加域
            document.addField ("id", sContent.getsId ());
            document.addField ("item_title", sContent.getsTitle ());
            document.addField ("item_image", sContent.getsImg ());
            document.addField ("item_get_click", sContent.getsGetClick ());
            document.addField ("item_user_name",sContent.getxUser ().getUName ());
            document.addField ("item_user_img",sContent.getxUser ().getUEx1 ());
            solrClient.add (document);
            solrClient.commit ();
            System.out.println ("写入solr");
        }catch (Exception e){
            e.printStackTrace ();
        }
    }
}
