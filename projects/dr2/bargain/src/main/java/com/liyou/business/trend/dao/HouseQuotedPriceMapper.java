package com.liyou.business.trend.dao;

import org.apache.ibatis.annotations.Param;

import com.liyou.business.trend.pojo.HouseQuotedPrice;
import com.liyou.business.trend.pojo.HouseQuotedPriceCriteria;
import com.liyou.commons.dao.BaseDao;

/**
 * 小区报价表 - 数据交互持久层
 * @author 刘超
 * @date   2016-04-08
 */
public interface HouseQuotedPriceMapper extends BaseDao<HouseQuotedPrice, HouseQuotedPriceCriteria, String> {
	
	/**
	 * 获取某个小区最近一个月内的平均成交总价.
	 * @param baseName
	 * @param houseId
	 * @param beginDate
	 * @param endDate
	 * @return
	 */
	Long getHouseAvgQuote( @Param("baseName") String baseName , @Param("houseId") Integer houseId ,
			@Param("beginDate") String beginDate , @Param("endDate") String endDate ) ;
	
}