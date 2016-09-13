package com.liyou.util;

import java.text.SimpleDateFormat;

public class Tools {
	/**
	 * 判断是否是日期格式
	 * isOK(这里用一句话描述这个方法的作用)
	 * (这里描述这个方法适用条件 – 可选)
	 * @param str
	 * @return
	 *boolean
	 * @exception
	 * @since  1.0.0
	 */
	public static boolean isOK(String str) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			format.parse(str);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	/**
	 * 将对应日期转换为字符串
	 * getDates(这里用一句话描述这个方法的作用)
	 * (这里描述这个方法适用条件 – 可选)
	 * @param date
	 * @return
	 * @throws Exception
	 *String
	 * @exception
	 * @since  1.0.0
	 */
	public static String getDates(String date) throws Exception {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		if (date != null && isOK(date)) {
			return df.format(df.parse(date));
		} else {
			return "";
		}

	}
}
