package com.liyou.business.trend.pojo;

import java.io.Serializable;
import java.util.Date;

import com.liyou.commons.pojo.AbstractEntity;

public class HouseInfo extends AbstractEntity implements Serializable {
    private Integer houseId;

    private String houseName;

    private String nickName;

    private String certiName;

    private String houseAddress;

    private Boolean ifmultiAddress;

    private String housePic;

    private String houseDes;

    private String zipCode;

    private String salesAgentTel;

    private Long openprice;

    private Date opentime;

    private Integer houseActive;

    private Integer periodId;

    private Integer districtId;

    private Integer plateId;

    private Integer loopId;

    private Date jgTime;

    private Integer developerId;

    private Integer landArea;

    private Integer buildArea;

    private Integer totalHouse;

    private Integer greenRate;

    private Double volumeRate;

    private Integer rentRate;

    private Integer parkingSpace;

    private Double wyPrice;

    private String houseNamePy;

    private Double lng;

    private Double lat;

    private String geohash;

    private String geohashAround;

    private Integer deviation;

    private Double reliability;

    private String isFirst;

    private Integer addTime;

    private Integer editTime;

    private Integer cityPlanId;

    private Integer cityId;

    private String wyTel;

    private Boolean isPool;

    private Boolean isGym;

    private Boolean isSchool;

    private Boolean isSubway;

    private String houseUrl;

    private String outlinkUrl;

    private String advantage;

    private Byte stars;

    private String wyCompany;

    private Date createDate;

    private Date modifyDate;

    private static final long serialVersionUID = 1L;

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName == null ? null : houseName.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getCertiName() {
        return certiName;
    }

    public void setCertiName(String certiName) {
        this.certiName = certiName == null ? null : certiName.trim();
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress == null ? null : houseAddress.trim();
    }

    public Boolean getIfmultiAddress() {
        return ifmultiAddress;
    }

    public void setIfmultiAddress(Boolean ifmultiAddress) {
        this.ifmultiAddress = ifmultiAddress;
    }

    public String getHousePic() {
        return housePic;
    }

    public void setHousePic(String housePic) {
        this.housePic = housePic == null ? null : housePic.trim();
    }

    public String getHouseDes() {
        return houseDes;
    }

    public void setHouseDes(String houseDes) {
        this.houseDes = houseDes == null ? null : houseDes.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    public String getSalesAgentTel() {
        return salesAgentTel;
    }

    public void setSalesAgentTel(String salesAgentTel) {
        this.salesAgentTel = salesAgentTel == null ? null : salesAgentTel.trim();
    }

    public Long getOpenprice() {
        return openprice;
    }

    public void setOpenprice(Long openprice) {
        this.openprice = openprice;
    }

    public Date getOpentime() {
        return opentime;
    }

    public void setOpentime(Date opentime) {
        this.opentime = opentime;
    }

    public Integer getHouseActive() {
        return houseActive;
    }

    public void setHouseActive(Integer houseActive) {
        this.houseActive = houseActive;
    }

    public Integer getPeriodId() {
        return periodId;
    }

    public void setPeriodId(Integer periodId) {
        this.periodId = periodId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getPlateId() {
        return plateId;
    }

    public void setPlateId(Integer plateId) {
        this.plateId = plateId;
    }

    public Integer getLoopId() {
        return loopId;
    }

    public void setLoopId(Integer loopId) {
        this.loopId = loopId;
    }

    public Date getJgTime() {
        return jgTime;
    }

    public void setJgTime(Date jgTime) {
        this.jgTime = jgTime;
    }

    public Integer getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(Integer developerId) {
        this.developerId = developerId;
    }

    public Integer getLandArea() {
        return landArea;
    }

    public void setLandArea(Integer landArea) {
        this.landArea = landArea;
    }

    public Integer getBuildArea() {
        return buildArea;
    }

    public void setBuildArea(Integer buildArea) {
        this.buildArea = buildArea;
    }

    public Integer getTotalHouse() {
        return totalHouse;
    }

    public void setTotalHouse(Integer totalHouse) {
        this.totalHouse = totalHouse;
    }

    public Integer getGreenRate() {
        return greenRate;
    }

    public void setGreenRate(Integer greenRate) {
        this.greenRate = greenRate;
    }

    public Double getVolumeRate() {
        return volumeRate;
    }

    public void setVolumeRate(Double volumeRate) {
        this.volumeRate = volumeRate;
    }

    public Integer getRentRate() {
        return rentRate;
    }

    public void setRentRate(Integer rentRate) {
        this.rentRate = rentRate;
    }

    public Integer getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(Integer parkingSpace) {
        this.parkingSpace = parkingSpace;
    }

    public Double getWyPrice() {
        return wyPrice;
    }

    public void setWyPrice(Double wyPrice) {
        this.wyPrice = wyPrice;
    }

    public String getHouseNamePy() {
        return houseNamePy;
    }

    public void setHouseNamePy(String houseNamePy) {
        this.houseNamePy = houseNamePy == null ? null : houseNamePy.trim();
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public String getGeohash() {
        return geohash;
    }

    public void setGeohash(String geohash) {
        this.geohash = geohash == null ? null : geohash.trim();
    }

    public String getGeohashAround() {
        return geohashAround;
    }

    public void setGeohashAround(String geohashAround) {
        this.geohashAround = geohashAround == null ? null : geohashAround.trim();
    }

    public Integer getDeviation() {
        return deviation;
    }

    public void setDeviation(Integer deviation) {
        this.deviation = deviation;
    }

    public Double getReliability() {
        return reliability;
    }

    public void setReliability(Double reliability) {
        this.reliability = reliability;
    }

    public String getIsFirst() {
        return isFirst;
    }

    public void setIsFirst(String isFirst) {
        this.isFirst = isFirst == null ? null : isFirst.trim();
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

    public Integer getCityPlanId() {
        return cityPlanId;
    }

    public void setCityPlanId(Integer cityPlanId) {
        this.cityPlanId = cityPlanId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getWyTel() {
        return wyTel;
    }

    public void setWyTel(String wyTel) {
        this.wyTel = wyTel == null ? null : wyTel.trim();
    }

    public Boolean getIsPool() {
        return isPool;
    }

    public void setIsPool(Boolean isPool) {
        this.isPool = isPool;
    }

    public Boolean getIsGym() {
        return isGym;
    }

    public void setIsGym(Boolean isGym) {
        this.isGym = isGym;
    }

    public Boolean getIsSchool() {
        return isSchool;
    }

    public void setIsSchool(Boolean isSchool) {
        this.isSchool = isSchool;
    }

    public Boolean getIsSubway() {
        return isSubway;
    }

    public void setIsSubway(Boolean isSubway) {
        this.isSubway = isSubway;
    }

    public String getHouseUrl() {
        return houseUrl;
    }

    public void setHouseUrl(String houseUrl) {
        this.houseUrl = houseUrl == null ? null : houseUrl.trim();
    }

    public String getOutlinkUrl() {
        return outlinkUrl;
    }

    public void setOutlinkUrl(String outlinkUrl) {
        this.outlinkUrl = outlinkUrl == null ? null : outlinkUrl.trim();
    }

    public String getAdvantage() {
        return advantage;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage == null ? null : advantage.trim();
    }

    public Byte getStars() {
        return stars;
    }

    public void setStars(Byte stars) {
        this.stars = stars;
    }

    public String getWyCompany() {
        return wyCompany;
    }

    public void setWyCompany(String wyCompany) {
        this.wyCompany = wyCompany == null ? null : wyCompany.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", houseId=").append(houseId);
        sb.append(", houseName=").append(houseName);
        sb.append(", nickName=").append(nickName);
        sb.append(", certiName=").append(certiName);
        sb.append(", houseAddress=").append(houseAddress);
        sb.append(", ifmultiAddress=").append(ifmultiAddress);
        sb.append(", housePic=").append(housePic);
        sb.append(", houseDes=").append(houseDes);
        sb.append(", zipCode=").append(zipCode);
        sb.append(", salesAgentTel=").append(salesAgentTel);
        sb.append(", openprice=").append(openprice);
        sb.append(", opentime=").append(opentime);
        sb.append(", houseActive=").append(houseActive);
        sb.append(", periodId=").append(periodId);
        sb.append(", districtId=").append(districtId);
        sb.append(", plateId=").append(plateId);
        sb.append(", loopId=").append(loopId);
        sb.append(", jgTime=").append(jgTime);
        sb.append(", developerId=").append(developerId);
        sb.append(", landArea=").append(landArea);
        sb.append(", buildArea=").append(buildArea);
        sb.append(", totalHouse=").append(totalHouse);
        sb.append(", greenRate=").append(greenRate);
        sb.append(", volumeRate=").append(volumeRate);
        sb.append(", rentRate=").append(rentRate);
        sb.append(", parkingSpace=").append(parkingSpace);
        sb.append(", wyPrice=").append(wyPrice);
        sb.append(", houseNamePy=").append(houseNamePy);
        sb.append(", lng=").append(lng);
        sb.append(", lat=").append(lat);
        sb.append(", geohash=").append(geohash);
        sb.append(", geohashAround=").append(geohashAround);
        sb.append(", deviation=").append(deviation);
        sb.append(", reliability=").append(reliability);
        sb.append(", isFirst=").append(isFirst);
        sb.append(", addTime=").append(addTime);
        sb.append(", editTime=").append(editTime);
        sb.append(", cityPlanId=").append(cityPlanId);
        sb.append(", cityId=").append(cityId);
        sb.append(", wyTel=").append(wyTel);
        sb.append(", isPool=").append(isPool);
        sb.append(", isGym=").append(isGym);
        sb.append(", isSchool=").append(isSchool);
        sb.append(", isSubway=").append(isSubway);
        sb.append(", houseUrl=").append(houseUrl);
        sb.append(", outlinkUrl=").append(outlinkUrl);
        sb.append(", advantage=").append(advantage);
        sb.append(", stars=").append(stars);
        sb.append(", wyCompany=").append(wyCompany);
        sb.append(", createDate=").append(createDate);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}