package com.brx.test.service.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

/**
 * Created by ruxing.bao on 2017/3/8.
 */
@SpringBootApplication
@EnableZipkinStreamServer
public class SleuthServiceApplication {
    public static void main(String [] args) {
        SpringApplication.run(SleuthServiceApplication.class,args);
    }
}
