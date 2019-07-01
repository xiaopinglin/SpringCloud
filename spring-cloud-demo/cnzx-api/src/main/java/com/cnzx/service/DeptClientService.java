package com.cnzx.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cnzx.entities.DeptEntity;
import com.cnzx.fallback.DeptClientServiceFallbackFactory;

/**
 * @author lxp
 * @date 2018年12月12日 下午3:01:31
 * @parameter
 * @return
 */
@FeignClient(value = "CNZX-PROVIDER", fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public DeptEntity get(@PathVariable("id") long id);

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<DeptEntity> list();

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(DeptEntity dept);

}
