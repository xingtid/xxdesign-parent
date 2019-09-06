package xyz.hpwyx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 启动类
 *
 * @author tid
 * @create 2019-07-15 18:53
 **/
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class PCwebApp {
    public static void main(String[] args) {
        SpringApplication.run (PCwebApp.class,args);
    }
}
