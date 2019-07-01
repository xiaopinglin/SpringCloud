package com.cnzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class WxdcGatewayStart {

    public static void main(String[] args){
        SpringApplication.run(WxdcGatewayStart.class,args);
    }
}
