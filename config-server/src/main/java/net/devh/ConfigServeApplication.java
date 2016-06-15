package net.devh;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * User: Michael
 * Email: zhangyichen@xiaoniu66.com
 * Date: 2016/6/3
 */
@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServeApplication.class, args);
    }
}
