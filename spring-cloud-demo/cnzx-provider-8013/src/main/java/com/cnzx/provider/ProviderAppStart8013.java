package com.cnzx.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lxp
 * @date 2018年12月7日 下午5:07:08
 * @parameter
 * @return
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderAppStart8013 {

	public static void main(String[] args) {
		SpringApplication.run(ProviderAppStart8013.class, args);
	}

}
