package xyz.hpwyx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author tid
 * @create 2019-07-11 21:31
 **/
@SpringBootApplication
@EnableEurekaClient
public class ShareServer {
    public static void main(String[] args) {
        SpringApplication.run (ShareServer.class,args);
    }
}
