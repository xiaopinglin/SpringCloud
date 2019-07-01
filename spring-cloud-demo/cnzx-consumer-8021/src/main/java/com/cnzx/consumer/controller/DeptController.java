package com.cnzx.consumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cnzx.entities.DeptEntity;

/**
 * @author lxp
 * @date 2018年12月7日 下午5:47:39
 * @parameter
 * @return
 */
@RestController
public class DeptController {

	// private static final String REST_URL_PREFIX = "http://localhost:8011";
	private static final String REST_URL_PREFIX = "http://CNZX-PROVIDER";

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/dept/add")
	public boolean add(DeptEntity dept) {
		return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
	}

	@RequestMapping(value = "/dept/get/{id}")
	public DeptEntity get(@PathVariable("id") Long id) {
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, DeptEntity.class);
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/dept/list")
	public List<DeptEntity> list() {
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
	}

}
