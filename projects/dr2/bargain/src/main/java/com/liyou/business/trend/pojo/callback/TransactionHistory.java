package com.liyou.business.trend.pojo.callback;

import java.text.SimpleDateFormat;


public class TransactionHistory {
	private Long bargain_id;
	private String house_id;
	private String house_name;
	private Long rooms;
	private Long bargain_area;
	private String building_no;
	private String bargain_date;
	private Long totalprice;
	private Long floor;
	private String superior_name;
	private String store_name;
	private String agent_name;
    private Long building_no_number;
    private Long building_no_price;
    private Long rooms_number;
    private Long rooms_price;
    private Long estate_price;
    private Long threerank;
    private Long three_salescount;
    private String phone;
	public Long getRooms() {
		return rooms;
	}
	public void setRooms(Long rooms) {
		this.rooms = rooms;
	}
	public Long getBargain_area() {
		return bargain_area==null?0:bargain_area/100;
	}
	public void setBargain_area(Long bargain_area) {
		this.bargain_area = bargain_area;
	}
	public String getBuilding_no() {
		return building_no;
	}
	public void setBuilding_no(String building_no) {
		this.building_no = building_no;
	}
	public String getBargain_date() throws Exception {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(sdf.parse(bargain_date));
	}
	public void setBargain_date(String bargain_date) {
		this.bargain_date = bargain_date;
	}
	public Long getTotalprice() {
		return totalprice==null?0:totalprice/100;
	}
	public void setTotalprice(Long totalprice) {
		this.totalprice = totalprice;
	}
	public Long getFloor() {
		return floor;
	}
	public void setFloor(Long floor) {
		this.floor = floor;
	}
	public String getSuperior_name() {
		return superior_name;
	}
	public void setSuperior_name(String superior_name) {
		this.superior_name = superior_name;
	}
	public String getStore_name() {
		return store_name;
	}
	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}
	public String getAgent_name() {
		return agent_name;
	}
	public void setAgent_name(String agent_name) {
		this.agent_name = agent_name;
	}
	public Long getBuilding_no_number() {
		return building_no_number;
	}
	public void setBuilding_no_number(Long building_no_number) {
		this.building_no_number = building_no_number;
	}
	public Long getBuilding_no_price() {
		return building_no_price;
	}
	public void setBuilding_no_price(Long building_no_price) {
		this.building_no_price = building_no_price;
	}
	public Long getRooms_number() {
		return rooms_number;
	}
	public void setRooms_number(Long rooms_number) {
		this.rooms_number = rooms_number;
	}
	public Long getRooms_price() {
		return rooms_price==null?0:rooms_price;
	}
	public void setRooms_price(Long rooms_price) {
		this.rooms_price = rooms_price;
	}
	public Long getEstate_price() {
		return estate_price==null?0:estate_price/100;
	}
	public void setEstate_price(Long estate_price) {
		this.estate_price = estate_price;
	}
	public Long getThreerank() {
		return threerank;
	}
	public void setThreerank(Long threerank) {
		this.threerank = threerank;
	}
	public Long getThree_salescount() {
		return three_salescount;
	}
	public void setThree_salescount(Long three_salescount) {
		this.three_salescount = three_salescount;
	}
	public Long getBargain_id() {
		return bargain_id;
	}
	public void setBargain_id(Long bargain_id) {
		this.bargain_id = bargain_id;
	}
	public String getHouse_name() {
		return house_name;
	}
	public void setHouse_name(String house_name) {
		this.house_name = house_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getHouse_id() {
		return house_id;
	}
	public void setHouse_id(String house_id) {
		this.house_id = house_id;
	}
    
 
}
