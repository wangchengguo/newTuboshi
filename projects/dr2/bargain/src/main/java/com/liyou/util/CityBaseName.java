package com.liyou.util;

import java.io.InputStream;
import java.util.Properties;

/**
 * 礼友科技 - 数据库分库处理  - 获取数据库名字
 * @author 刘超
 * @date   2016-01-04
 */
public class CityBaseName {
	
	/**
	 * 数据库名 - 主库
	 */
	private static String main_baseName ;
	
	/**
	 * 数据库名 - 北京分库
	 */
	private static String beijing_baseName ;
	
	/**
	 * 数据库名 - 上海分库
	 */
	private static String shanghai_baseName ;
	
	/**
	 * 数据库名 - 广州分库
	 */
	private static String guangzhou_baseName ;
	
	/**
	 * 数据库名 - 深圳分库
	 */
	private static String shenzhen_baseName ;
	
	/**
	 * 数据库名 - 杭州分库
	 */
	private static String hangzhou_baseName ;
	
	/**
	 * 将库名放内存中 - 静态变量
	 */
	static{
		if( shenzhen_baseName == null ){
			try{
				Properties props = new Properties();
	 			InputStream fis = 
	 					CityBaseName.class.getResourceAsStream("/data-sources.properties"); 
				props.load(fis);
				fis.close();//关闭io
				
				/*
	 	         * 库名 - 读取配置中的信息
	 	         */
				main_baseName = props.getProperty("jdbc.main.database") ;
				beijing_baseName = props.getProperty("mjdbc.beijing.database") ;
				shanghai_baseName = props.getProperty("mjdbc.shanghai.database") ;
				guangzhou_baseName = props.getProperty("mjdbc.guangzhou.database") ;
				shenzhen_baseName = props.getProperty("mjdbc.shenzhen.database") ;
				hangzhou_baseName = props.getProperty("mjdbc.hangzhou.database") ;
			}catch( Exception e ){
				e.printStackTrace();
			}
		}
	}

	public static String getMain_baseName() {
		return main_baseName;
	}

	public static String getBeijing_baseName() {
		return beijing_baseName;
	}

	public static String getShanghai_baseName() {
		return shanghai_baseName;
	}

	public static String getGuangzhou_baseName() {
		return guangzhou_baseName;
	}

	public static String getShenzhen_baseName() {
		return shenzhen_baseName;
	}

	public static String getHangzhou_baseName() {
		return hangzhou_baseName;
	}
	
	
	
}
