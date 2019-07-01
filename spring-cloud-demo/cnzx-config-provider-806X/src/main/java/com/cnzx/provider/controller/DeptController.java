package com.cnzx.provider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cnzx.entities.DeptEntity;
import com.cnzx.provider.service.DeptService;

/**
 * @author lxp
 * @date 2018年12月7日 下午5:05:44
 * @parameter
 * @return
 */
@RestController
public class DeptController {
	@Autowired
	private DeptService deptService;

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(@RequestBody DeptEntity dept) {
		return deptService.add(dept);
	}

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public DeptEntity get(@PathVariable("id") Long id) {
		return deptService.get(id);
	}

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<DeptEntity> list() {
		return deptService.list();
	}
}
