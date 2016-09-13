package com.liyou.business.trend.service;

import com.liyou.business.trend.pojo.BargainHistory;
import com.liyou.business.trend.pojo.BargainHistoryCriteria;
import com.liyou.commons.service.BaseService;

/**
 * 成交历史服务层
 * @author 刘超
 * @date   2016-04-08
 */
public interface BargainHistoryService extends BaseService<BargainHistory, BargainHistoryCriteria> {

	/**
	 * 获取某个时间段内小区的总销量
	 * @param baseName
	 * @param houseId
	 * @param beginDate
	 * @param endDate
	 * @return
	 */
	Integer getHouseTimesSalesCount( String baseName , Integer houseId ,
			 String beginDate , String endDate ) ;
	
}
