package com.cnzx.utils;

/**
 * 字符串操作类
 * 
 * @author lxp
 * @date 2018年7月23日 下午3:22:19
 * @parameter
 * @return
 */
public class StringUtil {

	/**
	 * 字符串控制判断
	 * 
	 * @param str
	 * @return
	 */
	public static Boolean StringIfNullOrEmpty(String str) {
		if ("".equals(str) || "null".equals(str) || str == null || "undefined".equals(str)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 字符串空值转为''
	 * 
	 * @param str
	 * @return
	 */
	public static String ChangeNullString(String str) {
		if ("".equals(str) || "null".equals(str) || str == null || "undefined".equals(str)) {
			return "";
		} else {
			return str;
		}
	}

	/**
	 * 判断两个字符串是否相等
	 * 
	 * @param str
	 * @param value
	 * @return
	 */
	public static boolean IsEqual(String str, String value) {
		if (str == null && value == null) {
			return true;
		} else if (str != null) {
			return str.equals(value);
		} else {
			return value.equals(str);
		}
	}
}
