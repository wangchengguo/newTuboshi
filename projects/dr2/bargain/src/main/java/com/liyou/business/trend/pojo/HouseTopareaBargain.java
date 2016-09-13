package com.liyou.business.trend.pojo;

import java.io.Serializable;
import java.util.Date;

import com.liyou.commons.pojo.AbstractEntity;

/**
 * 头部价格表实体映射类
 * @author 刘超
 * @date   2016-04-08
 */
public class HouseTopareaBargain extends AbstractEntity implements Serializable {
	private Integer houseId;

    private Integer firstHand;
    
    private Long bargainid;

    private String address;

    private String building;

    private String room;

    private Long bargainArea;

    private Integer roomtype;

    private Integer rooms;

    private Integer floor;

    private Long sinprice;

    private Long totalprice;

    private Date bargaindate;

    private String agentName;

    private String agentShortname;

    private Integer ifcalc;

    private Boolean source;

    private static final long serialVersionUID = 1L;

    public Integer getHouseId() {
		return houseId;
	}

	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}

	public Integer getFirstHand() {
		return firstHand;
	}

	public void setFirstHand(Integer firstHand) {
		this.firstHand = firstHand;
	}

	public Long getBargainid() {
        return bargainid;
    }

    public void setBargainid(Long bargainid) {
        this.bargainid = bargainid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building == null ? null : building.trim();
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room == null ? null : room.trim();
    }

    public Long getBargainArea() {
        return bargainArea;
    }

    public void setBargainArea(Long bargainArea) {
        this.bargainArea = bargainArea;
    }

    public Integer getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(Integer roomtype) {
        this.roomtype = roomtype;
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

    public Long getSinprice() {
        return sinprice;
    }

    public void setSinprice(Long sinprice) {
        this.sinprice = sinprice;
    }

    public Long getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Long totalprice) {
        this.totalprice = totalprice;
    }

    public Date getBargaindate() {
        return bargaindate;
    }

    public void setBargaindate(Date bargaindate) {
        this.bargaindate = bargaindate;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    public String getAgentShortname() {
        return agentShortname;
    }

    public void setAgentShortname(String agentShortname) {
        this.agentShortname = agentShortname == null ? null : agentShortname.trim();
    }

    public Integer getIfcalc() {
        return ifcalc;
    }

    public void setIfcalc(Integer ifcalc) {
        this.ifcalc = ifcalc;
    }

    public Boolean getSource() {
        return source;
    }

    public void setSource(Boolean source) {
        this.source = source;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", houseId=").append(houseId);
        sb.append(", firstHand=").append(firstHand);
        sb.append(", bargainid=").append(bargainid);
        sb.append(", address=").append(address);
        sb.append(", building=").append(building);
        sb.append(", room=").append(room);
        sb.append(", bargainArea=").append(bargainArea);
        sb.append(", roomtype=").append(roomtype);
        sb.append(", rooms=").append(rooms);
        sb.append(", floor=").append(floor);
        sb.append(", sinprice=").append(sinprice);
        sb.append(", totalprice=").append(totalprice);
        sb.append(", bargaindate=").append(bargaindate);
        sb.append(", agentName=").append(agentName);
        sb.append(", agentShortname=").append(agentShortname);
        sb.append(", ifcalc=").append(ifcalc);
        sb.append(", source=").append(source);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}