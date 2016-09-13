package com.liyou.business.trend.service;

import com.liyou.business.trend.pojo.HouseTopareaBargain;
import com.liyou.business.trend.pojo.HouseTopareaBargainCriteria;
import com.liyou.commons.service.BaseService;
import com.liyou.exception.BargainException;

/**
 * 头部价格表：house_toparea_bargain			逻辑处理层
 * @author 刘超
 * @date   2016-04-08
 */
public interface HouseTopareaBargainService extends BaseService<HouseTopareaBargain, HouseTopareaBargainCriteria> {

	/**
	 * 获取小区的最高的头部价格 - 成交总价
	 * @param cityId
	 * @param houseId
	 * @return
	 */
	Long getHouseMaxTotalprice( Integer cityId , Integer houseId ) throws BargainException;
	
}
