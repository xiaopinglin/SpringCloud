package com.cnzx.provider.service;

import java.util.List;

import com.cnzx.entities.DeptEntity;

/**
 * @author lxp
 * @date 2018年12月7日 下午5:01:47
 * @parameter
 * @return
 */
public interface DeptService {

	public boolean add(DeptEntity dept);

	public DeptEntity get(Long id);

	public List<DeptEntity> list();

}
