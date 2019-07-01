package com.cnzx.hystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author lxp
 * @date 2018年12月13日 上午11:08:22
 * @parameter
 * @return
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardAppStart8041 {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardAppStart8041.class, args);
	}

}
