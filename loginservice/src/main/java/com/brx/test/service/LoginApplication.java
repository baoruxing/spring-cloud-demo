package com.brx.test.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Created by ruxing.bao on 2017/2/24.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix

public class LoginApplication {

    public static void main(String [] args) {
        SpringApplication.run(LoginApplication.class,args);
    }
}
