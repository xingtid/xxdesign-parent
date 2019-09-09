package xyz.hpwyx.cookie;

import org.apache.tomcat.util.http.LegacyCookieProcessor;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tid
 * @create 2019-04-10 21:02
 **/
@Configuration
public class CookieCon {


    /**
     * 解决问题：
     * There was an unexpected error (type=Internal Server Error, status=500).
     * An invalid domain [.localhost.com] was specified for this cookie
     *
     * @return
     */
    @Bean
    public WebServerFactoryCustomizer<TomcatServletWebServerFactory> cookieProcessorCustomizer() {
        return (factory) -> factory.addContextCustomizers (
                (context) -> context.setCookieProcessor (new LegacyCookieProcessor ()));
    }

}


