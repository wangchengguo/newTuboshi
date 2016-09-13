package com.liyou.business.sales.service;



import com.liyou.business.sales.pojo.param.HousePercentage;
import com.liyou.business.sales.pojo.param.HousePriceDetailParam;
import com.liyou.business.sales.pojo.param.SalesParam;
import com.liyou.commons.pojo.OResultVO;

public interface ISalesService {
	
	
	
	String getSales(SalesParam param);
	
	String getSalesMost(SalesParam param);
	
	String getSinPriceSales(SalesParam param);
	
	String getPriceDetail(HousePriceDetailParam detailParam);
	
	String getPercentage(HousePercentage housePercentage);
	
	/**
	 * 获取小区三个月的销售的每种房型价格段销售信息
	 * @param housePercentage
	 * @return
	 */
	OResultVO getPeriodinfo(HousePercentage housePercentage)throws Exception;

	
	
	String getHotHousePlateSchool(Integer cityId,String type,Integer needCount);

	
	/**
	 * 查询销售量最多的小区，选择10条
	 * @param cityId
	 * @param isFirst
	 * @return
	 */
	OResultVO getHouseSalecountByMonth(Integer cityId, Integer isFirst, Integer count);
	
	/**
	 * 查询销售量最多的学校，选择10条
	 * @param cityId
	 * @param needCount
	 * @return
	 */
	OResultVO getSchoolSalecountByMonth(Integer cityId, Integer needCount);
	
	
	String  getTransactionHistory(Integer cityId,Long bargain_id,Integer source);

}
