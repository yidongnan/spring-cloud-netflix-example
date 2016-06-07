package net.devh.controller;

import net.devh.hystrix.HystrixWrappedServiceBClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Michael
 * Email: zhangyichen@xiaoniu66.com
 * Date: 2016/6/3
 */
@RestController
public class AServiceController {

    @Autowired
    private HystrixWrappedServiceBClient serviceBClient;

    @RequestMapping("/")
    public String printServiceA() {
        return "service-a-1:\n\t" + serviceBClient.printServiceB();
    }

}
