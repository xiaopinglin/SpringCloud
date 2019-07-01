package com.cnzx.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lxp
 * @date 2018年12月14日 下午3:44:15
 * @parameter
 * @return
 */
@RestController
public class ConfigClientRest {

	@Value("${server.port}")
	private String port;

	@Value("${spring.application.name}")
	private String applicationName;

	@Value("${eureka.client.service-url.defaultZone}")
	private String eurekaServers;

	@RequestMapping("/config")
	public String getConfig() {
		String str = "applicationName: " + applicationName + "\t    eurekaServers:" + eurekaServers + "\t   port: " + port;
		return str;
	}

}
