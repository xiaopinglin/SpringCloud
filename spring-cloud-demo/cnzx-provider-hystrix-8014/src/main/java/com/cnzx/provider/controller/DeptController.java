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
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

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

	@HystrixCommand(fallbackMethod = "fallbanck_get")
	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public DeptEntity get(@PathVariable("id") Long id) {
		DeptEntity dept = this.deptService.get(id);
		if (null == dept) {
			throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
		}
		return deptService.get(id);
	}

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<DeptEntity> list() {
		return deptService.list();
	}

	public DeptEntity fallbanck_get(@PathVariable("id") Long id) {
		return new DeptEntity().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand").setDb_source("no this database in MySQL");
	}

}
