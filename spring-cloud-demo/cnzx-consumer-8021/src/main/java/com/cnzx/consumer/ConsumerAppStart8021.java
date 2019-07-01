package com.cnzx.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.cnzx.myrule.MyConfigRule;

/**
 * @author lxp
 * @date 2018年12月7日 下午5:58:22
 * @parameter
 * @return
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CNZX-PROVIDER", configuration = MyConfigRule.class)
public class ConsumerAppStart8021 {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerAppStart8021.class, args);
	}

}
