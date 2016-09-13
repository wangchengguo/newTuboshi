package com.liyou.business.sales.dao;





import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.liyou.business.sales.pojo.HotHousePlateSchool;
import com.liyou.business.sales.pojo.HouseSalesRatio;
import com.liyou.business.sales.pojo.Sales;
import com.liyou.business.sales.pojo.houseQuotedPrice;
import com.liyou.business.sales.pojo.param.HousePercentage;
import com.liyou.business.sales.pojo.param.HousePriceDetailParam;
import com.liyou.business.sales.pojo.param.SalesParam;

public interface SalesMapper {
	
	/**
	 * 获取总价表数据
	 * @param param
	 * @return
	 */
	Sales getSales(SalesParam param);
    
	/**
	 * 获取总价fetch_bargain_history表最高最低
	 * @param param
	 * @return
	 */
	Sales getHistoryPrice(SalesParam param);
	/**
	 * 获取总价bargain_history表最高最低
	 * @param param
	 * @return
	 */
	Sales getbaginHistoryPrice(SalesParam param);
	/**
	 * 获取单价表数据
	 * @param param
	 * @return
	 */
	Sales getSalesSinPrice(SalesParam param);
	/**
	 * 获取单价fetch_bargain_history表最高最低
	 * @param param
	 * @return
	 */
	Sales getHistorySinPricePrice(SalesParam param);	
	/**
	 * 获取单价bargain_history表最高最低
	 * @param param
	 * @return
	 */
	Sales getbaginHistorySinPricePrice(SalesParam param);
	
	/**
	 * 获取小区的报价明细信息。
	 * @param detailParam
	 * @return
	 */
	List<houseQuotedPrice> getPriceDetail(HousePriceDetailParam detailParam); 
	
	
	
	List<HouseSalesRatio>  getHousePercentage(HousePercentage percentage);

	
	
	List<HotHousePlateSchool> getHotHousePlateSchool(@Param("baseName") String baseName,@Param("type") String type,@Param("needCount") Integer needCount);

	
	/**
	 * 查询销售量最多的小区，选择10条
	 * @return
	 */
	List<Map<String,Object>> getHouseSalecountByMonth(@Param("baseName") String baseName, @Param("isFirst") Integer isFirst, @Param("needCount") Integer needCount);
	
	/**
	 * 查询销售量最多的学校，选择10条
	 * @return
	 */
	List<Map<String,Object>> getSchoolSalecountByMonth(@Param("baseName") String baseName, @Param("bargaindate") String bargaindate, @Param("needCount") Integer needCount);

}
