package com.liyou.business.trend.dao;


import org.apache.ibatis.annotations.Param;

import com.liyou.business.trend.pojo.HouseInfo;
import com.liyou.business.trend.pojo.HouseInfoCriteria;
import com.liyou.commons.dao.BaseDao;

/**
 * 小区信息处理
 * @author 刘超
 * @date   2016-04-10
 */
public interface HouseInfoMapper extends BaseDao<HouseInfo, HouseInfoCriteria, String> {
	
	/**
	 * 根据小区Id获取小区详细信息
	 * @param baseName
	 * @param houseId
	 * @return
	 */
	HouseInfo findById( @Param("baseName") String baseName , @Param("houseId") Integer houseId ) ;
	
}