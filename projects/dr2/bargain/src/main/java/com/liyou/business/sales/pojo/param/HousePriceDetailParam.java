package com.liyou.business.sales.pojo.param;

public class HousePriceDetailParam {
	private Integer houseId;// 必须参数，Number类型，小区的ID

	private Integer cityId;// 必须参数，Number类型，小区所处的城市ID

	private Integer rooms; //可选参数，Number类型，查询rooms对应房型的报价

	private Integer floor; //可选参数，Number类型，查询对应楼层的报价

	private String sortDesc; //可选参数，String类型，对该字段进行降序排序

	private String sortAsc; //可选参数，String类型，对该字段进行升序排序

	private Integer start; //可选参数，Number类型，从该参数指定的起始位置获取，如果为负数，或者无效值，直接从头开始获取

	private Integer count; //可选参数，Number类型，一次获取多少条数据，如果参数为负数、无效值或者没有指定，该参数默认为5条数据
    
	private String baseName; //必须参数  分库
	public Integer getHouseId() {
		return houseId;
	}

	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public Integer getRooms() {
		return rooms;
	}

	public void setRooms(Integer rooms) {
		this.rooms = rooms;
	}

	public Integer getFloor() {
		return floor;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	

	public String getSortDesc() {
		return sortDesc;
	}

	public void setSortDesc(String sortDesc) {
		this.sortDesc = sortDesc;
	}

	public String getSortAsc() {
		return sortAsc;
	}

	public void setSortAsc(String sortAsc) {
		this.sortAsc = sortAsc;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getBaseName() {
		return baseName;
	}

	public void setBaseName(String baseName) {
		this.baseName = baseName;
	}
	
}
