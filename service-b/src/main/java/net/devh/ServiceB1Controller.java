package net.devh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Michael
 * Email: yidongnan@gmail.com
 * Date: 2016/6/3
 */
@RefreshScope
@RestController
public class ServiceB1Controller {

    @Autowired
    DiscoveryClient discoveryClient;

    @Value("${msg:unknown}")
    private String msg;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printServiceB() {
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        return serviceInstance.getServiceId() + " (" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + ")" + "===>Say " + msg;
    }
}
