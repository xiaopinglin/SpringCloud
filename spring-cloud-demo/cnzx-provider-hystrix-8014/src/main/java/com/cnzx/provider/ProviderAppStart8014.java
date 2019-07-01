package com.cnzx.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lxp
 * @date 2018年12月7日 下午5:07:08
 * @parameter
 * @return
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker // 对hystrixR熔断机制的支持
public class ProviderAppStart8014 {

	public static void main(String[] args) {
		SpringApplication.run(ProviderAppStart8014.class, args);
	}

}
