package com.liyou.business.trend.service;

import java.util.List;

import com.liyou.business.trend.pojo.PlateCalcHouseRank;
import com.liyou.business.trend.pojo.PlateCalcHouseRankCriteria;
import com.liyou.commons.service.BaseService;

/**
 * plate 销量处理
 * @author 刘超
 * @date   2016-04-08
 */
public interface PlateCalcHouseRankService extends
		BaseService<PlateCalcHouseRank, PlateCalcHouseRankCriteria>{

	/**
	 * 根据数据库条件. 在多条件下获取趋势集合
	 * @param plateCalcHouseRank
	 * @return
	 */
	List<PlateCalcHouseRank> selectByAll( PlateCalcHouseRank plateCalcHouseRank ) ;
	
}
