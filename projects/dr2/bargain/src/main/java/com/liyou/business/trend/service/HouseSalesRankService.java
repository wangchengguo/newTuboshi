package com.liyou.business.trend.service;

import com.liyou.business.trend.pojo.HouseSalesRank;
import com.liyou.business.trend.pojo.HouseSalesRankCriteria;
import com.liyou.commons.service.BaseService;

/**
 * 获取小区销量排名 - 逻辑处理层
 * @author 刘超
 * @date   2016-04-10
 */
public interface HouseSalesRankService extends BaseService<HouseSalesRank, HouseSalesRankCriteria> {
	
	/**
	 * 获取小区某个月的三个月内销量
	 * @param houseSalesRank
	 * @return
	 */
	public Integer getHouseMonthSalesCount(HouseSalesRank houseSalesRank) ;
}
