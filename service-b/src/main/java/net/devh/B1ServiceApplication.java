package net.devh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * User: Michael
 * Email: yidongnan@gmail.com
 * Date: 2016/6/3
 */
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
public class B1ServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(B1ServiceApplication.class, args);
    }
}
