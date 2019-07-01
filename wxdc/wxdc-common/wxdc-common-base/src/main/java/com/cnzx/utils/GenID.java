package com.cnzx.utils;

import java.util.Random;

/**
 * 采用系统时间+自增长序列+机器编号的方式获取主键
 * 
 * @author lxp
 * @date 2018年7月3日 下午3:24:38
 * @parameter
 * @return
 */
public class GenID {

	public static long id = 1;
	public static String prex = "";
	public static long key = 1;

	public static synchronized String gen(int length) {

		String sPrex = new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS").format(new java.util.Date());
		Random random = new Random();
		String rand = String.valueOf(random.nextInt(999999999));
		sPrex = sPrex + rand;
		if (!prex.equals(sPrex)) {
			id = 1;
		}
		prex = sPrex;
		while ((sPrex + String.valueOf(id)).length() < length) {
			sPrex = sPrex + "0";
		}
		return sPrex + String.valueOf(id++);
	}

	public static void main(String[] args) throws Exception {

		for (int i = 0; i < 100; i++) {
			System.out.println(gen(32));
		}

	}
}
