package xyz.hpwyx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.hpwyx.fegin.UserServiceFigen;
import xyz.hpwyx.pojo.XDesign;
import xyz.hpwyx.pojo.XUser;


/**
 * @author tid
 * @create 2019-10-12 2:04 下午
 **/
@Controller
public class DesignController {
@Autowired
private UserServiceFigen userServiceFigen;
    @RequestMapping(value = "/findById/{id}")
    public String findById(@PathVariable Integer id, Model model) {
        XDesign design = userServiceFigen.findByUId (id);
        XUser userById = userServiceFigen.findUserById (id);
        userById.setUPassword ("");
        userById.setULoginAt (null);
        model.addAttribute ("user",userById);
        model.addAttribute ("design",design);
        return "designer";
    }
}
