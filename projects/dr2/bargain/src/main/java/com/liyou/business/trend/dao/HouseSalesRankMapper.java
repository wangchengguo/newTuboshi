package com.liyou.business.trend.dao;

import com.liyou.business.trend.pojo.HouseSalesRank;
import com.liyou.business.trend.pojo.HouseSalesRankCriteria;
import com.liyou.commons.dao.BaseDao;

/**
 * 小区销量排名表处理
 * @author 刘超
 * @date   2016-04-10
 */
public interface HouseSalesRankMapper extends BaseDao<HouseSalesRank, HouseSalesRankCriteria, String> {
	
	/**
	 * 获取小区某个月的三个月内销量
	 * @param houseSalesRank
	 * @return
	 */
	Integer getHouseMonthSalesCount(HouseSalesRank houseSalesRank) ;
	
}