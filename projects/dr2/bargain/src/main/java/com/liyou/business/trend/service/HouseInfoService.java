package com.liyou.business.trend.service;

import com.liyou.business.trend.pojo.HouseInfo;
import com.liyou.business.trend.pojo.HouseInfoCriteria;
import com.liyou.commons.service.BaseService;
import com.liyou.exception.BargainException;

/**
 * 小区
 * @author 超
 *
 */
public interface HouseInfoService extends BaseService<HouseInfo, HouseInfoCriteria> {

	/**
	 * 根据小区的Id获取小区详细信息
	 * @param cityId
	 * @param houseId
	 * @return
	 */
	HouseInfo findById ( Integer cityId , Integer houseId ) throws BargainException ;
	
	/**
	 * 根据小区的Id获取小区详细信息
	 * @param cityId
	 * @param houseId
	 * @return
	 */
	HouseInfo getHouseById (Integer cityId, Integer houseId);
	
}
