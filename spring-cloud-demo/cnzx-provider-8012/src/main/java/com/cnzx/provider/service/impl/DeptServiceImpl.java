package com.cnzx.provider.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnzx.entities.DeptEntity;
import com.cnzx.provider.dao.DeptDao;
import com.cnzx.provider.service.DeptService;

/**
 * @author lxp
 * @date 2018年12月7日 下午5:02:14
 * @parameter
 * @return
 */
@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao deptDao;

	@Override
	public boolean add(DeptEntity dept) {
		return deptDao.addDept(dept);
	}

	@Override
	public DeptEntity get(Long id) {
		return deptDao.findById(id);
	}

	@Override
	public List<DeptEntity> list() {
		return deptDao.findAll();
	}

}
