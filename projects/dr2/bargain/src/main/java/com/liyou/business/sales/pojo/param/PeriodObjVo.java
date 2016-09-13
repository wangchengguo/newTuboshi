package com.liyou.business.sales.pojo.param;

import java.io.Serializable;

import com.liyou.business.trend.pojo.param.PeriodVo;

public class PeriodObjVo implements Serializable, Comparable<PeriodObjVo> {

	private static final long serialVersionUID = 1258417313937788540L;
	
	private Integer salesCount;
	
	private Integer salesRise;
	
	private PeriodVo period;

	public Integer getSalesCount() {
		return salesCount;
	}

	public void setSalesCount(Integer salesCount) {
		this.salesCount = salesCount;
	}

	public Integer getSalesRise() {
		return salesRise;
	}

	public void setSalesRise(Integer salesRise) {
		this.salesRise = salesRise;
	}

	public PeriodVo getPeriod() {
		return period;
	}

	public void setPeriod(PeriodVo period) {
		this.period = period;
	}

	@Override
	public int compareTo(PeriodObjVo o) {
		return o.salesCount-this.salesCount;
	}

	
	
	
}
