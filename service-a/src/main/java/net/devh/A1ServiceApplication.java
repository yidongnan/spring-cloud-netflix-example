package net.devh;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import io.swagger.annotations.Api;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.RequestHandlerSelectors.withClassAnnotation;

/**
 * User: Michael
 * Email: yidongnan@gmail.com
 * Date: 2016/6/3
 */
@EnableEurekaClient
@EnableHystrix
@EnableFeignClients
@SpringBootApplication
@EnableSwagger2
public class A1ServiceApplication {

    @Bean
    public Docket docket() {
        ApiSelectorBuilder apiSelectorBuilder = new Docket(DocumentationType.SWAGGER_2).select();
        apiSelectorBuilder.apis(withClassAnnotation(Api.class));
        return apiSelectorBuilder
                .build()
                .pathMapping("/")
                .useDefaultResponseMessages(false)
                .apiInfo(new ApiInfo("Service A API Doc", "Service A API Doc", "1.0", "https://github.com/yidongnan/spring-cloud-netflix-example",
                        new Contact("Michael", "https://github.com/yidongnan", "yidongnan@gmail.com"), null, null))
                .forCodeGeneration(true);
    }

    public static void main(String[] args) {
        SpringApplication.run(A1ServiceApplication.class, args);
    }

}
