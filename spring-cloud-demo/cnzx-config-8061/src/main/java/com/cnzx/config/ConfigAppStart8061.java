package com.cnzx.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author lxp
 * @date 2018年12月13日 下午5:34:02
 * @parameter
 * @return
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigAppStart8061 {

	public static void main(String[] args) {
		SpringApplication.run(ConfigAppStart8061.class, args);
	}

}
