package com.cnzx.consumer.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author lxp
 * @date 2018年12月7日 下午5:42:28
 * @parameter
 * @return
 */
@Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	/*
	 * @Bean public IRule myRule() { // 覆盖默认的轮询算法为随机算法 return new RandomRule();
	 * }
	 */

}
