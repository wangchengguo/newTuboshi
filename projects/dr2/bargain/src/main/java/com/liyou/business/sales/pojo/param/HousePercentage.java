package com.liyou.business.sales.pojo.param;

public class HousePercentage {
	private Integer houseId;// 必须参数，Number类型，需要查询的小区

	private Integer cityId;// 必须参数，Number类型，需要查询的小区所在城市的ID

	private String [] rooms;// 可选参数，Number类型列表，使用逗号分隔（比如：rooms=1,2,3），如果该参数不存在，选取小区所有的房型销量，如果存在则选择指定的房型销售比例；

	private String baseName;
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

	public String[] getRooms() {
		return rooms;
	}

	public void setRooms(String[] rooms) {
		this.rooms = rooms;
	}

	public String getBaseName() {
		return baseName;
	}

	public void setBaseName(String baseName) {
		this.baseName = baseName;
	}
	
}
