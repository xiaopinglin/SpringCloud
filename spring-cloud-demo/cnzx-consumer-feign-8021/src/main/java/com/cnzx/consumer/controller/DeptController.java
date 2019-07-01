package com.cnzx.consumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnzx.entities.DeptEntity;
import com.cnzx.service.DeptClientService;

/**
 * @author lxp
 * @date 2018年12月7日 下午5:47:39
 * @parameter
 * @return
 */
@RestController
public class DeptController {

	@Autowired
	private DeptClientService deptClientService;

	@RequestMapping(value = "/dept/add")
	public boolean add(DeptEntity dept) {
		return deptClientService.add(dept);
	}

	@RequestMapping(value = "/dept/get/{id}")
	public DeptEntity get(@PathVariable("id") Long id) {
		return deptClientService.get(id);
	}

	@RequestMapping(value = "/dept/list")
	public List<DeptEntity> list() {
		return deptClientService.list();
	}

}
