package net.devh.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * User: Michael
 * Email: zhangyichen@xiaoniu66.com
 * Date: 2016/6/3
 */
@FeignClient(name = "service-b")
public interface ServiceBClient {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String printServiceB();
}
