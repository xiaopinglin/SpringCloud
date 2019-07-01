package com.cnzx.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

/**
 * @author lxp
 * @date 2018年12月12日 上午11:20:02
 * @parameter
 * @return
 */
@Configuration
public class MyConfigRule {

	@Bean
	public IRule myRule() {
		return new RoundRobinRuleNew();
	}
}
