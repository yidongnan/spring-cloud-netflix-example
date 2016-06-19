package net.devh.controller;

import net.devh.hystrix.HystrixWrappedServiceBClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Michael
 * Email: zhangyichen@xiaoniu66.com
 * Date: 2016/6/3
 */
@RefreshScope
@RestController
public class AServiceController {

    @Value("${name:unknown}")
    private String name;

    @Autowired
    private HystrixWrappedServiceBClient serviceBClient;

    @RequestMapping("/")
    public String printServiceA() {
        return name + ":" + "service-a:\n\t" + serviceBClient.printServiceB();
    }

}
