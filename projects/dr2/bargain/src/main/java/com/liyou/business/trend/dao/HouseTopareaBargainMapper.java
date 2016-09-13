package com.liyou.business.trend.dao;

import org.apache.ibatis.annotations.Param;

import com.liyou.business.trend.pojo.HouseTopareaBargain;
import com.liyou.business.trend.pojo.HouseTopareaBargainCriteria;
import com.liyou.commons.dao.BaseDao;

/**
 * 头部价格 数据持久层
 * @author 刘超
 * @date   2016-04-08
 */
public interface HouseTopareaBargainMapper extends BaseDao<HouseTopareaBargain, HouseTopareaBargainCriteria, String>{
	
	/**
	 * 获取小区的最高的头部价格 - 成交总价
	 * @param baseName
	 * @param houseId
	 * @return
	 */
	Long getHouseMaxTotalprice( @Param("baseName") String baseName , @Param("houseId") Integer houseId ) ;
	
}