package net.devh;


import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * User: Michael
 * Email: yidongnan@gmail.com
 * Date: 2016/6/3
 */
@EnableEurekaClient
@EnableHystrix
@EnableFeignClients
@SpringBootApplication
public class A1ServiceApplication implements ApplicationContextAware {
    private static ApplicationContext context;

    public static void main(String[] args) {
        SpringApplication.run(A1ServiceApplication.class, args);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    public static <T> T get(Class<T> type) {
        return context.getBean(type);
    }

    public static Object get(String name) {
        return context.getBean(name);
    }
}
