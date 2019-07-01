package com.cnzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class WxdcEurekaStart {

    public static void main(String[] args){
        SpringApplication.run(WxdcEurekaStart.class,args);
    }
}
