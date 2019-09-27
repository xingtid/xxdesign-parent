package xyz.hpwyx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import xyz.hpwyx.fastDFS.FastDFSClient;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @author tid
 * @create 2019-09-16 6:51 下午
 **/
@Controller
public class picController {
    @ResponseBody
    @RequestMapping(value = "/uploadImg")
    public void upLoadImg(MultipartFile file, HttpServletResponse response) throws IOException {
        try {
            FastDFSClient fastDFSClient = new FastDFSClient ("/config/client.conf");
            //取扩展名
            String originalFilename = file.getOriginalFilename ();
            String extName = originalFilename.substring (originalFilename.lastIndexOf (".") + 1);
            //得到一个图片的地址和文件名
            String urla = fastDFSClient.uploadFile (file.getBytes (), extName);
            urla = "http://www.hpwyx.xyz:81/" + urla;
            System.out.println ("图片地址："+urla);
            response.getWriter().write (urla);
        }catch (Exception e) {
            e.printStackTrace ();
            response.getWriter().write (e.toString ());
        }
    }
}