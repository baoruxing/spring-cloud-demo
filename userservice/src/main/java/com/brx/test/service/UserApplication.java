package com.brx.test.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by ruxing.bao on 2017/2/22.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableZuulProxy
public class UserApplication {
}
