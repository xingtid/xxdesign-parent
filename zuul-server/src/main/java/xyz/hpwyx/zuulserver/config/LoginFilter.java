package xyz.hpwyx.zuulserver.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author tid
 * @create 2019-09-25 10:03 上午
 **/
@Component
public class LoginFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        // 登录校验逻辑
        // 1）获取zuul提供的请求上下文对象（即是请求全部内容）
        RequestContext currentContext = RequestContext.getCurrentContext();
        // 2) 从上下文中获取request对象
        HttpSession session = currentContext.getRequest().getSession ();
        // 3) 从请求中获取token
        Object token =  session.getAttribute ("USERINFO");
        HttpServletRequest request = currentContext.getRequest();
        // 3) 从请求中获取url
        String url= request.getRequestURI();
        System.out.println (url);
        if(url.indexOf("register") != -1||url.indexOf("login") != -1){
            currentContext.setSendZuulResponse(false);
            // 返回401状态码。也可以考虑重定向到登录页
            currentContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
        }else {
            return null;
        }
        // 4) 判断（如果没有token，认为用户还没有登录，返回401状态码）
        if(token == null ){
            // 没有token，认为登录校验失败，进行拦截
            currentContext.setSendZuulResponse(false);
            // 返回401状态码。也可以考虑重定向到登录页
            currentContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
        }

        // 如果校验通过，可以考虑吧用户信息放入上下文，继续向后执行
        return null;

    }
}
