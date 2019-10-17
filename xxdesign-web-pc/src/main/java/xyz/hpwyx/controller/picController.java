package xyz.hpwyx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import xyz.hpwyx.fastDFS.FastDFSClient;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author tid
 * @create 2019-09-16 6:51 下午
 **/
@Controller
public class picController {
    @ResponseBody
    @RequestMapping(value = "/uploadImg")
    public Map upLoadImg(MultipartFile file, HttpServletResponse response, HttpSession session) throws IOException {
        try {
            FastDFSClient fastDFSClient = new FastDFSClient ("/config/client.conf");
            //取扩展名
            String originalFilename = file.getOriginalFilename ();
            String extName = originalFilename.substring (originalFilename.lastIndexOf (".") + 1);
            //得到一个图片的地址和文件名
            String urla = fastDFSClient.uploadFile (file.getBytes (), extName);
            urla = "http://www.hpwyx.xyz:81/" + urla;
            System.out.println ("图片地址：" + urla);
            List<String> img = (List<String>) session.getAttribute ("img");
            if (img != null) {
                System.out.println (img.get (0));
                img.add (urla);
                session.setAttribute ("img",img);
            } else {
                List<String> imgList = new ArrayList<> ();
                imgList.add (urla);
                session.setAttribute ("img",imgList);
            }
            response.getWriter ().write (urla);
            Map map = new HashMap ();
            map.put ("success", true);
            map.put ("file_path", urla);
            return map;
        } catch (Exception e) {
            e.printStackTrace ();
            response.getWriter ().write (e.toString ());
            Map map = new HashMap ();
            map.put ("success", false);
            return map;
        }
    }
}