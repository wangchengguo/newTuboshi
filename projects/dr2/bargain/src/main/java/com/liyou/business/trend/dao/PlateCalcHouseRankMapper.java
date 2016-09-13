package com.liyou.business.trend.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.liyou.business.trend.pojo.PlateCalcHouseRank;
import com.liyou.business.trend.pojo.PlateCalcHouseRankCriteria;
import com.liyou.commons.dao.BaseDao;

/**
 * 街道价格趋势
 * @author 刘超
 * @date   2016-04-08
 */
public interface PlateCalcHouseRankMapper extends BaseDao<PlateCalcHouseRank, PlateCalcHouseRankCriteria , String> {

	/**
	 * 根据数据库条件. 在多条件下获取趋势集合
	 * @param plateCalcHouseRank
	 * @return
	 */
	List<PlateCalcHouseRank> selectByAll(PlateCalcHouseRank plateCalcHouseRank) ;
	
	/**
	 * 获取小区的价格趋势，近三个月的价格增长率。
	 * @return
	 */
	Map<String, Object> selectPriceRateByYM(@Param("baseName") String baseName, @Param("houseId") Integer houseId, @Param("valmonth") Integer valmonth, @Param("valyear") String valyear, @Param("priceMonth") Integer priceMonth);
	
	/**
	 * 获取小区的销售数量趋势，近三个月与上三个月对比的销售的增长率。
	 * @return
	 */
	Map<String, Object> selectSalesRateByYM(@Param("baseName") String baseName, @Param("houseId") Integer houseId, @Param("valmonth") Integer valmonth, @Param("valyear") String valyear, @Param("salesMonth") Integer salesMonth);
	
	
	/**
	 * 获取小区的房价预测
	 * @return
	 */
	Map<String, Object> selectTrendingResultByYM(@Param("baseName") String baseName, @Param("houseId") Integer houseId, @Param("valmonth") Integer valmonth, @Param("valyear") String valyear, @Param("priceMonth") Integer priceMonth);
	
	/**
	 * 获取小区的价格、销售量趋势以及房价的预测
	 * @return
	 */
	List<Map<String, Object>> selectHouseTrendingByYM(@Param("baseName") String baseName, @Param("houseId") Integer houseId, @Param("valmonth") Integer valmonth, @Param("valyear") String valyear);
}