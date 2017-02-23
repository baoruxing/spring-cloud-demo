package com.brx.test.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

/**
 * Created by ruxing.bao on 2017/2/22.
 */
@Configuration
@EnableAutoConfiguration
@Controller
@EnableHystrixDashboard

public class HystrixDashboardApplication {

    public String home() {
        return "forward:/hystrix";
    }

    public  static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApplication.class,args);
    }
}
