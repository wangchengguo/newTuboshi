package com.liyou.commons.pojo;

/**
 * 礼友科技 - 数据库名  - 分库处理 <br>
 * 所有pojo数据库映射类继承此类
 * @author 刘超
 * @date   2016-01-04
 */
public class LiyouBase {

	/**
	 * 分库处理 - 不同城市的id做不同城市的分库
	 */
	private Integer city_id ;
	
	/**
	 * 数据库名称 - 做分库处理
	 */
	private String baseName ;

	/**
	 * 分页参数 - 从多少页开始
	 */
	private Integer start = 0 ;
	
	/**
	 * 分页参数 - 每页多少条记录
	 */
	private Integer limit = 10 ;
	
	public LiyouBase(){
		
	}
	
	public String getBaseName() {
		return baseName;
	}

	public void setBaseName(String baseName) {
		this.baseName = baseName;
	}

	public Integer getCity_id() {
		return city_id;
	}

	public void setCity_id(Integer city_id) {
		this.city_id = city_id;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	
}
