package xyz.hpwyx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.fegin.CertifiedServiceFigen;
import xyz.hpwyx.pojo.XCertified;
import xyz.hpwyx.pojo.XUser;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author tid
 * @create 2019-10-12 4:37 下午
 **/
@Controller
public class CertifiedController {
    @Autowired
    private CertifiedServiceFigen serviceFigen;

    /**
     * 提交认证
     * @param xCertified
     * @param date
     * @param session
     * @return
     * @throws ParseException
     */
    @RequestMapping(value = "/addCertified")
    @ResponseBody
    public XResult addCertified(XCertified xCertified, @RequestParam("date") String date, HttpSession session) throws ParseException {
        XUser userinfo = (XUser) session.getAttribute ("USERINFO");
        if (userinfo==null){
            return XResult.failMsg ("未登录");
        }
        xCertified.setrId (userinfo.getUId ());
        List<String> img = (List<String>) session.getAttribute ("img");
        if (img.size ()==1) {
            xCertified.setrImg (img.get (0));
        }else if(img.size () == 2) {
            xCertified.setrImg (img.get (0)+";"+img.get (1));
        }else {
            xCertified.setrImg (img.get (0)+";"+img.get (1)+";"+img.get (2));
        }
        SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd");
        Date parse = format.parse (date);
        xCertified.setrTime (parse);
        XResult xResult = serviceFigen.insertCertified (xCertified);
        return xResult;
    }
}
