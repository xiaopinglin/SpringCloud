package com.cnzx.fallback;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cnzx.entities.DeptEntity;
import com.cnzx.service.DeptClientService;

import feign.hystrix.FallbackFactory;

/**
 * @author lxp
 * @date 2018年12月12日 下午5:30:01
 * @parameter
 * @return
 */
@Component // 不要忘记添加，不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

	@Override
	public DeptClientService create(Throwable arg0) {

		return new DeptClientService() {

			@Override
			public List<DeptEntity> list() {
				return null;
			}

			@Override
			public DeptEntity get(long id) {
				return new DeptEntity().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭").setDb_source("no this database in MySQL");
			}

			@Override
			public boolean add(DeptEntity dept) {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}

}
