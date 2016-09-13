package com.liyou.business.trend.pojo;

import java.io.Serializable;
import java.util.Date;

import com.liyou.commons.pojo.AbstractEntity;

public class BargainHistory extends AbstractEntity
			implements Serializable {
    private Long bargainid;

    private Integer houseId;

    private String address;

    private String building;

    private String buildingNo;

    private Integer rooms;

    private String room;

    private Integer roomtype;

    private Long bargainArea;

    private Integer propertyAttr;

    private String propertyName;

    private Integer floor;

    private Long avprice;

    private Long sinprice;

    private Long totalprice;

    private Date bargaindate;

    private String presaleName;

    private String agentName;

    private String agentShortname;

    private Integer firstHand;

    private Boolean ifcalc;

    private Integer addTime;

    private Integer editTime;

    private String houseType;

    private String roomTypeName;

    private Integer storeId;

    private Integer priceTag;

    private Integer agentSuperiorId;

    private Long verifySinprice;

    private Long verifyTotalprice;

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

    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo == null ? null : buildingNo.trim();
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room == null ? null : room.trim();
    }

    public Integer getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(Integer roomtype) {
        this.roomtype = roomtype;
    }

    public Long getBargainArea() {
        return bargainArea;
    }

    public void setBargainArea(Long bargainArea) {
        this.bargainArea = bargainArea;
    }

    public Integer getPropertyAttr() {
        return propertyAttr;
    }

    public void setPropertyAttr(Integer propertyAttr) {
        this.propertyAttr = propertyAttr;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName == null ? null : propertyName.trim();
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Long getAvprice() {
        return avprice;
    }

    public void setAvprice(Long avprice) {
        this.avprice = avprice;
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

    public String getPresaleName() {
        return presaleName;
    }

    public void setPresaleName(String presaleName) {
        this.presaleName = presaleName == null ? null : presaleName.trim();
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

    public Integer getFirstHand() {
        return firstHand;
    }

    public void setFirstHand(Integer firstHand) {
        this.firstHand = firstHand;
    }

    public Boolean getIfcalc() {
        return ifcalc;
    }

    public void setIfcalc(Boolean ifcalc) {
        this.ifcalc = ifcalc;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public Integer getEditTime() {
        return editTime;
    }

    public void setEditTime(Integer editTime) {
        this.editTime = editTime;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType == null ? null : houseType.trim();
    }

    public String getRoomTypeName() {
        return roomTypeName;
    }

    public void setRoomTypeName(String roomTypeName) {
        this.roomTypeName = roomTypeName == null ? null : roomTypeName.trim();
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getPriceTag() {
        return priceTag;
    }

    public void setPriceTag(Integer priceTag) {
        this.priceTag = priceTag;
    }

    public Integer getAgentSuperiorId() {
        return agentSuperiorId;
    }

    public void setAgentSuperiorId(Integer agentSuperiorId) {
        this.agentSuperiorId = agentSuperiorId;
    }

    public Long getVerifySinprice() {
        return verifySinprice;
    }

    public void setVerifySinprice(Long verifySinprice) {
        this.verifySinprice = verifySinprice;
    }

    public Long getVerifyTotalprice() {
        return verifyTotalprice;
    }

    public void setVerifyTotalprice(Long verifyTotalprice) {
        this.verifyTotalprice = verifyTotalprice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bargainid=").append(bargainid);
        sb.append(", houseId=").append(houseId);
        sb.append(", address=").append(address);
        sb.append(", building=").append(building);
        sb.append(", buildingNo=").append(buildingNo);
        sb.append(", rooms=").append(rooms);
        sb.append(", room=").append(room);
        sb.append(", roomtype=").append(roomtype);
        sb.append(", bargainArea=").append(bargainArea);
        sb.append(", propertyAttr=").append(propertyAttr);
        sb.append(", propertyName=").append(propertyName);
        sb.append(", floor=").append(floor);
        sb.append(", avprice=").append(avprice);
        sb.append(", sinprice=").append(sinprice);
        sb.append(", totalprice=").append(totalprice);
        sb.append(", bargaindate=").append(bargaindate);
        sb.append(", presaleName=").append(presaleName);
        sb.append(", agentName=").append(agentName);
        sb.append(", agentShortname=").append(agentShortname);
        sb.append(", firstHand=").append(firstHand);
        sb.append(", ifcalc=").append(ifcalc);
        sb.append(", addTime=").append(addTime);
        sb.append(", editTime=").append(editTime);
        sb.append(", houseType=").append(houseType);
        sb.append(", roomTypeName=").append(roomTypeName);
        sb.append(", storeId=").append(storeId);
        sb.append(", priceTag=").append(priceTag);
        sb.append(", agentSuperiorId=").append(agentSuperiorId);
        sb.append(", verifySinprice=").append(verifySinprice);
        sb.append(", verifyTotalprice=").append(verifyTotalprice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}