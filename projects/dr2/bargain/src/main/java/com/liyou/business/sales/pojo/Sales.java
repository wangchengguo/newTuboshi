package com.liyou.business.sales.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Sales implements Serializable{
	private Integer house_id;
	private Integer valyear;	
	private Integer valmonth;	
	private Integer totalprice_period_id;	
	private Integer h_price;	
	private Integer l_price;	
	private Integer rooms;
	private String building;	
	private Integer floor;	
	private Integer sales_count;	
	private Integer rate;	
	private Integer if_first;
	private Integer bottom_price;
	private Integer top_price;
	private String roomtype;
	private Integer sinprice;
	private Long bargain_area;
	private String bargaindate;
	private Long totalprice;
	public Integer getHouse_id() {
		return house_id;
	}
	public void setHouse_id(Integer house_id) {
		this.house_id = house_id;
	}
	public Integer getValyear() {
		return valyear;
	}
	public void setValyear(Integer valyear) {
		this.valyear = valyear;
	}
	public Integer getValmonth() {
		return valmonth;
	}
	public void setValmonth(Integer valmonth) {
		this.valmonth = valmonth;
	}
	public Integer getTotalprice_period_id() {
		return totalprice_period_id;
	}
	public void setTotalprice_period_id(Integer totalprice_period_id) {
		this.totalprice_period_id = totalprice_period_id;
	}
	public Integer getH_price() {
		return h_price;
	}
	public void setH_price(Integer h_price) {
		this.h_price = h_price;
	}
	public Integer getL_price() {
		return l_price;
	}
	public void setL_price(Integer l_price) {
		this.l_price = l_price;
	}
	public Integer getRooms() {
		return rooms;
	}
	public void setRooms(Integer rooms) {
		this.rooms = rooms;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public Integer getFloor() {
		return floor;
	}
	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	public Integer getSales_count() {
		return sales_count;
	}
	public void setSales_count(Integer sales_count) {
		this.sales_count = sales_count;
	}
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	public Integer getIf_first() {
		return if_first;
	}
	public void setIf_first(Integer if_first) {
		this.if_first = if_first;
	}
	public Integer getBottom_price() {
		return bottom_price;
	}
	public void setBottom_price(Integer bottom_price) {
		this.bottom_price = bottom_price;
	}
	public Integer getTop_price() {
		return top_price;
	}
	public void setTop_price(Integer top_price) {
		this.top_price = top_price;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public Integer getSinprice() {
		return sinprice;
	}
	public void setSinprice(Integer sinprice) {
		this.sinprice = sinprice;
	}
	public Long getBargain_area() {
		return bargain_area;
	}
	public void setBargain_area(Long bargain_area) {
		this.bargain_area = bargain_area;
	}
	public String getBargaindate() {
		return bargaindate;
	}
	public void setBargaindate(String bargaindate) {
		this.bargaindate = bargaindate;
	}
	public Long getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(Long totalprice) {
		this.totalprice = totalprice;
	}
		
	
}
