package com.liyou.business.sales.pojo.param;

import java.io.Serializable;
import java.util.List;


public class PeriodStatisticVo implements Serializable {

	private static final long serialVersionUID = 5857783986119447580L;
	
	private Integer rooms;
	
	private List<PeriodObjVo> periodList;

	public Integer getRooms() {
		return rooms;
	}

	public void setRooms(Integer rooms) {
		this.rooms = rooms;
	}

	public List<PeriodObjVo> getPeriodList() {
		return periodList;
	}

	public void setPeriodList(List<PeriodObjVo> periodList) {
		this.periodList = periodList;
	}
	
	
}
