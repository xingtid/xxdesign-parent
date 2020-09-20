package xyz.hpwyx.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.hpwyx.baseresult.XResult;
import xyz.hpwyx.pojo.XCertified;

import java.util.List;

/**
 * @author tid
 * @create 2019-10-12 4:03 下午
 **/
@RequestMapping("/certified")
public interface CertifiedService {
    @RequestMapping("/insertCertified")
    XResult insertCertified(@RequestBody XCertified xCertified);

    @RequestMapping("/findCertified")
    List<XCertified> findCertified();

    @RequestMapping("/changeErtified")
   XResult changeErtified(@RequestParam("id")int id);

    @RequestMapping("/findErtified")
    XCertified findErti(@RequestParam("id")int id);
}
