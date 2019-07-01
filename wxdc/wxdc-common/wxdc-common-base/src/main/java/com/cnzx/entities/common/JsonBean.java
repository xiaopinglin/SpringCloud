package com.cnzx.entities.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author lxp
 * @date 2018年7月20日 下午5:04:23
 * @parameter
 * @return
 */
@Data
@AllArgsConstructor
@Accessors(chain = true)
public class JsonBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private boolean success;
	private String code;
	private String msg;
	private Object obj;

	public JsonBean(){
		this.success = true;
		this.code = "200";
	}
}
