package xyz.hpwyx.oauth2;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author tid
 * @create 2019-03-17 18:47
 **/
@Configuration
public class ShiroConfig {

    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager securityManager) {

        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean ();
        shiroFilterFactoryBean.setSecurityManager (securityManager);
        System.out.println ("--------shiro-------");
        /**
         * 过滤器
         * anon: 无需登录
         * authc: 必须登录
         * user: 如果使用rememberMe的功能可以访问
         * perms: 资源授权
         * role: 角色授权
         */

        Map<String, String> filterMap = new LinkedHashMap<String, String> ();
        filterMap.put ("/login.html", "anon");
        filterMap.put ("/login", "anon");
//        filterMap.put ("/isContent.html", "authc");
//        filterMap.put ("/isContent", "authc");

        //修改跳转页面
        shiroFilterFactoryBean.setLoginUrl ("login");
        shiroFilterFactoryBean.setUnauthorizedUrl ("/noAuth");
        shiroFilterFactoryBean.setFilterChainDefinitionMap (filterMap);
        return shiroFilterFactoryBean;
    }

    @Bean(name = "securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager ();

        securityManager.setRealm (userRealm);
        return securityManager;
    }

    @Bean(name = "userRealm")
    public UserRealm getRealm() {

        return new UserRealm ();
    }


}
