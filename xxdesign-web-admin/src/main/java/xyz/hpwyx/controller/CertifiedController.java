package xyz.hpwyx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.feign.CertifiedServiceFigen;
import xyz.hpwyx.feign.UserServiceFigen;
import xyz.hpwyx.pojo.XCertified;
import xyz.hpwyx.pojo.XDesign;
import xyz.hpwyx.pojo.XUser;
import xyz.hpwyx.pojo.XUserInfo;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author tid
 * @create 2019-10-12 4:37 下午
 **/
@RestController
public class CertifiedController {
    @Autowired
    private CertifiedServiceFigen serviceFigen;
    @Autowired
    private UserServiceFigen userServiceFigen;

    @RequestMapping(value = "/changeState")
    public XResult changeState( @RequestParam("id") int id) {
        XResult xResult = serviceFigen.changeErtified (id);

        XCertified erti = serviceFigen.findErti (id);
        XUser xUser = userServiceFigen.findUserById (erti.getrId ());
        System.out.println ("xx"+xUser.getUId ());
        xUser.setUIsdesign ("yesa");
        userServiceFigen.updateUser (xUser);

        XDesign xDesign= new XDesign ();
        xDesign.setDId (xUser.getUId ());
        xDesign.setDStar ("4");
        xDesign.setDHead (xUser.getUEx1 ());
        userServiceFigen.insertDesign (xDesign);
        List<XCertified> certified = serviceFigen.findCertified ();
        return XResult.build (200,"",certified);
    }
    @RequestMapping(value = "/addCertified")
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
        XResult xResult;
        try {
            xResult = serviceFigen.insertCertified (xCertified);
        }catch (Exception e){
            return XResult.failMsg ("已经提交");
        }
        return xResult;
    }
}
