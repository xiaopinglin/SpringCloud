package com.cnzx.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author lxp
 * @date 2018年12月13日 下午3:43:45
 * @parameter
 * @return
 */
@EnableZuulProxy
@SpringBootApplication
public class ZuulGatewayAppStart8051 {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGatewayAppStart8051.class, args);
	}

}
