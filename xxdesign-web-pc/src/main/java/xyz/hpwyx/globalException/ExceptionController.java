package xyz.hpwyx.globalException;


import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tid
 * @create 2019-09-10 7:09 下午
 **/

@Controller

public class ExceptionController implements ErrorController {


    private static final String ERROR_PATH = "/error";

    @RequestMapping(ERROR_PATH)
    public String error(){
        return "/error/404.html";
    }
    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }

}
