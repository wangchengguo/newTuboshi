package com.liyou.business.trend.pojo;

import java.io.Serializable;
import java.util.Date;

import com.liyou.commons.pojo.AbstractEntity;

public class HouseQuotedPrice extends AbstractEntity implements Serializable {
    private Long bargainid;

    private Integer houseId;

    private String building;

    private String buildingNo;

    private Short room;

    private Short floor;

    private String address;

    private Short floors;

    private Short rooms;

    private Byte ifFirst;

    private Integer roomtype;

    private Integer area;

    private String buildtype;

    private Long quotedTotalPrice;

    private Integer quotedSinprice;

    private Date quotedDate;

    private Integer agentId;

    private Integer storeId;

    private Integer agentSuperiorId;

    private static final long serialVersionUID = 1L;

    public Long getBargainid() {
        return bargainid;
    }

    public void setBargainid(Long bargainid) {
        this.bargainid = bargainid;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building == null ? null : building.trim();
    }

    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo == null ? null : buildingNo.trim();
    }

    public Short getRoom() {
        return room;
    }

    public void setRoom(Short room) {
        this.room = room;
    }

    public Short getFloor() {
        return floor;
    }

    public void setFloor(Short floor) {
        this.floor = floor;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Short getFloors() {
        return floors;
    }

    public void setFloors(Short floors) {
        this.floors = floors;
    }

    public Short getRooms() {
        return rooms;
    }

    public void setRooms(Short rooms) {
        this.rooms = rooms;
    }

    public Byte getIfFirst() {
        return ifFirst;
    }

    public void setIfFirst(Byte ifFirst) {
        this.ifFirst = ifFirst;
    }

    public Integer getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(Integer roomtype) {
        this.roomtype = roomtype;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getBuildtype() {
        return buildtype;
    }

    public void setBuildtype(String buildtype) {
        this.buildtype = buildtype == null ? null : buildtype.trim();
    }

    public Long getQuotedTotalPrice() {
        return quotedTotalPrice;
    }

    public void setQuotedTotalPrice(Long quotedTotalPrice) {
        this.quotedTotalPrice = quotedTotalPrice;
    }

    public Integer getQuotedSinprice() {
        return quotedSinprice;
    }

    public void setQuotedSinprice(Integer quotedSinprice) {
        this.quotedSinprice = quotedSinprice;
    }

    public Date getQuotedDate() {
        return quotedDate;
    }

    public void setQuotedDate(Date quotedDate) {
        this.quotedDate = quotedDate;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getAgentSuperiorId() {
        return agentSuperiorId;
    }

    public void setAgentSuperiorId(Integer agentSuperiorId) {
        this.agentSuperiorId = agentSuperiorId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bargainid=").append(bargainid);
        sb.append(", houseId=").append(houseId);
        sb.append(", building=").append(building);
        sb.append(", buildingNo=").append(buildingNo);
        sb.append(", room=").append(room);
        sb.append(", floor=").append(floor);
        sb.append(", address=").append(address);
        sb.append(", floors=").append(floors);
        sb.append(", rooms=").append(rooms);
        sb.append(", ifFirst=").append(ifFirst);
        sb.append(", roomtype=").append(roomtype);
        sb.append(", area=").append(area);
        sb.append(", buildtype=").append(buildtype);
        sb.append(", quotedTotalPrice=").append(quotedTotalPrice);
        sb.append(", quotedSinprice=").append(quotedSinprice);
        sb.append(", quotedDate=").append(quotedDate);
        sb.append(", agentId=").append(agentId);
        sb.append(", storeId=").append(storeId);
        sb.append(", agentSuperiorId=").append(agentSuperiorId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}