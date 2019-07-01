package com.cnzx.provider.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cnzx.entities.DeptEntity;

/**
 * @author lxp
 * @date 2018年11月30日 下午2:36:45
 * @parameter
 * @return
 */
@Mapper
public interface DeptDao {

	public boolean addDept(DeptEntity dept);

	public DeptEntity findById(Long id);

	public List<DeptEntity> findAll();
}