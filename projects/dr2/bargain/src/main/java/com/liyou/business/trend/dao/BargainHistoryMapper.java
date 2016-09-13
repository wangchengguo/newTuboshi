package com.liyou.business.trend.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.liyou.business.trend.pojo.BargainHistory;
import com.liyou.business.trend.pojo.BargainHistoryCriteria;
import com.liyou.business.trend.pojo.callback.TransactionHistory;
import com.liyou.business.trend.pojo.param.PeriodVo;
import com.liyou.commons.dao.BaseDao;

/**
 * 成交历史 - 数据持久层
 * @author 刘超
 * @date   2016-04-08
 */
public interface BargainHistoryMapper  extends BaseDao<BargainHistory, BargainHistoryCriteria , String > {

	/**
	 * 获取某个时间段内小区的总销量
	 * @param baseName
	 * @param houseId
	 * @param beginDate
	 * @param endDate
	 * @return
	 */
	Integer getHouseTimesSalesCount( @Param("baseName") String baseName , @Param("houseId")Integer houseId ,
			@Param("beginDate")String beginDate , @Param("endDate")String endDate ) ;
	
	List<BargainHistory> getBargainHisByHouseId( @Param("baseName") String baseName, @Param("houseId")Integer houseId,
			@Param("beginDate")String beginDate , @Param("endDate")String endDate,@Param("rooms")String[] rooms);
	
	List<PeriodVo> getTotalpriceRangeConfig(@Param("baseName") String baseName, @Param("cityId") Integer cityId);
	
	List<TransactionHistory> getTransactionHistory(@Param("baseName") String baseName,@Param("bargain_id") Long bargain_id,@Param("source") Integer source);
	
}