package com.cnzx.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author lxp
 * @date 2018年12月7日 下午5:58:22
 * @parameter
 * @return
 */

@ComponentScan("com.cnzx")
@EnableFeignClients(basePackages = { "com.cnzx" })
@EnableEurekaClient
@SpringBootApplication
public class ConsumerAppStart8021 {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerAppStart8021.class, args);
	}

}
