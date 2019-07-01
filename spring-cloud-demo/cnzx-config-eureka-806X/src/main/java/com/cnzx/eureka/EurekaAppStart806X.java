package com.cnzx.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lxp
 * @date 2018年12月10日 上午11:32:52
 * @parameter
 * @return
 */
@SpringBootApplication
@EnableEurekaServer // EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurekaAppStart806X {

	public static void main(String[] args) {
		SpringApplication.run(EurekaAppStart806X.class, args);
	}

}
