package com.liyou.business.trend.service;

import com.liyou.business.trend.pojo.HouseQuotedPrice;
import com.liyou.business.trend.pojo.HouseQuotedPriceCriteria;
import com.liyou.commons.service.BaseService;
import com.liyou.exception.BargainException;

/**
 * 小区报价表：house_quoted_price     逻辑处理层
 * @author 刘超
 * @date   2016-04-08
 */
public interface HouseQuotedPriceService extends BaseService<HouseQuotedPrice, HouseQuotedPriceCriteria> {

	/**
	 * 获取某个小区最近一个月内的平均成交总价.
	 * @param baseName
	 * @param houseId
	 * @return
	 */
	Long getHouseAvgQuote( Integer cityId , Integer houseId ) throws BargainException ;
	
}
