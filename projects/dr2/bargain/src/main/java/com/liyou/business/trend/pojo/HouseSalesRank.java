package com.liyou.business.trend.pojo;

import java.io.Serializable;
import java.util.Date;

import com.liyou.commons.pojo.AbstractEntity;

public class HouseSalesRank extends AbstractEntity implements Serializable {
    private Integer houseId;

    private String valyear;

    private Short valmonth;

    private Integer districtId;

    private Integer plateId;

    private Integer curSalescount;

    private Integer threeSalescount;

    private Integer currank;

    private Integer threerank;

    private Integer currankPercent;

    private Integer threerankPercent;

    private Integer currankPlate;

    private Integer threerankPlate;

    private Integer currankPercentPlate;

    private Integer threerankPercentPlate;

    private Integer sameageRank;

    private Integer sameageThreerank;

    private Integer sameageCurrankPercent;

    private Integer sameageThreerankPercent;

    private Date calctime;

    private static final long serialVersionUID = 1L;

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getValyear() {
        return valyear;
    }

    public void setValyear(String valyear) {
        this.valyear = valyear == null ? null : valyear.trim();
    }

    public Short getValmonth() {
        return valmonth;
    }

    public void setValmonth(Short valmonth) {
        this.valmonth = valmonth;
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

    public Integer getCurSalescount() {
        return curSalescount;
    }

    public void setCurSalescount(Integer curSalescount) {
        this.curSalescount = curSalescount;
    }

    public Integer getThreeSalescount() {
        return threeSalescount;
    }

    public void setThreeSalescount(Integer threeSalescount) {
        this.threeSalescount = threeSalescount;
    }

    public Integer getCurrank() {
        return currank;
    }

    public void setCurrank(Integer currank) {
        this.currank = currank;
    }

    public Integer getThreerank() {
        return threerank;
    }

    public void setThreerank(Integer threerank) {
        this.threerank = threerank;
    }

    public Integer getCurrankPercent() {
        return currankPercent;
    }

    public void setCurrankPercent(Integer currankPercent) {
        this.currankPercent = currankPercent;
    }

    public Integer getThreerankPercent() {
        return threerankPercent;
    }

    public void setThreerankPercent(Integer threerankPercent) {
        this.threerankPercent = threerankPercent;
    }

    public Integer getCurrankPlate() {
        return currankPlate;
    }

    public void setCurrankPlate(Integer currankPlate) {
        this.currankPlate = currankPlate;
    }

    public Integer getThreerankPlate() {
        return threerankPlate;
    }

    public void setThreerankPlate(Integer threerankPlate) {
        this.threerankPlate = threerankPlate;
    }

    public Integer getCurrankPercentPlate() {
        return currankPercentPlate;
    }

    public void setCurrankPercentPlate(Integer currankPercentPlate) {
        this.currankPercentPlate = currankPercentPlate;
    }

    public Integer getThreerankPercentPlate() {
        return threerankPercentPlate;
    }

    public void setThreerankPercentPlate(Integer threerankPercentPlate) {
        this.threerankPercentPlate = threerankPercentPlate;
    }

    public Integer getSameageRank() {
        return sameageRank;
    }

    public void setSameageRank(Integer sameageRank) {
        this.sameageRank = sameageRank;
    }

    public Integer getSameageThreerank() {
        return sameageThreerank;
    }

    public void setSameageThreerank(Integer sameageThreerank) {
        this.sameageThreerank = sameageThreerank;
    }

    public Integer getSameageCurrankPercent() {
        return sameageCurrankPercent;
    }

    public void setSameageCurrankPercent(Integer sameageCurrankPercent) {
        this.sameageCurrankPercent = sameageCurrankPercent;
    }

    public Integer getSameageThreerankPercent() {
        return sameageThreerankPercent;
    }

    public void setSameageThreerankPercent(Integer sameageThreerankPercent) {
        this.sameageThreerankPercent = sameageThreerankPercent;
    }

    public Date getCalctime() {
        return calctime;
    }

    public void setCalctime(Date calctime) {
        this.calctime = calctime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", houseId=").append(houseId);
        sb.append(", valyear=").append(valyear);
        sb.append(", valmonth=").append(valmonth);
        sb.append(", districtId=").append(districtId);
        sb.append(", plateId=").append(plateId);
        sb.append(", curSalescount=").append(curSalescount);
        sb.append(", threeSalescount=").append(threeSalescount);
        sb.append(", currank=").append(currank);
        sb.append(", threerank=").append(threerank);
        sb.append(", currankPercent=").append(currankPercent);
        sb.append(", threerankPercent=").append(threerankPercent);
        sb.append(", currankPlate=").append(currankPlate);
        sb.append(", threerankPlate=").append(threerankPlate);
        sb.append(", currankPercentPlate=").append(currankPercentPlate);
        sb.append(", threerankPercentPlate=").append(threerankPercentPlate);
        sb.append(", sameageRank=").append(sameageRank);
        sb.append(", sameageThreerank=").append(sameageThreerank);
        sb.append(", sameageCurrankPercent=").append(sameageCurrankPercent);
        sb.append(", sameageThreerankPercent=").append(sameageThreerankPercent);
        sb.append(", calctime=").append(calctime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}