package com.liyou.business.trend.pojo;

import java.io.Serializable;
import java.util.Date;

import com.liyou.commons.pojo.AbstractEntity;

public class PlateCalcHouseRank extends AbstractEntity implements Serializable {
	private Integer plateId;

    private Integer houseId;

    private Short months;

    private Short valyear;

    private Short valmonth;
    
    private Integer avprice;

    private Integer rise;

    private Date calcTime;

    private static final long serialVersionUID = 1L;

    public Integer getAvprice() {
        return avprice;
    }

    public void setAvprice(Integer avprice) {
        this.avprice = avprice;
    }

    public Integer getRise() {
        return rise;
    }

    public void setRise(Integer rise) {
        this.rise = rise;
    }

    public Date getCalcTime() {
        return calcTime;
    }

    public void setCalcTime(Date calcTime) {
        this.calcTime = calcTime;
    }

    public Integer getPlateId() {
		return plateId;
	}

	public void setPlateId(Integer plateId) {
		this.plateId = plateId;
	}

	public Integer getHouseId() {
		return houseId;
	}

	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}

	public Short getMonths() {
		return months;
	}

	public void setMonths(Short months) {
		this.months = months;
	}

	public Short getValyear() {
		return valyear;
	}

	public void setValyear(Short valyear) {
		this.valyear = valyear;
	}

	public Short getValmonth() {
		return valmonth;
	}

	public void setValmonth(Short valmonth) {
		this.valmonth = valmonth;
	}

	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", plateId=").append(plateId);
        sb.append(", houseId=").append(houseId);
        sb.append(", months=").append(months);
        sb.append(", valyear=").append(valyear);
        sb.append(", valmonth=").append(valmonth);
        sb.append(", avprice=").append(avprice);
        sb.append(", rise=").append(rise);
        sb.append(", calcTime=").append(calcTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}