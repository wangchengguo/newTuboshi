package com.liyou.business.trend.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liyou.business.trend.dao.PlateCalcHouseRankMapper;
import com.liyou.business.trend.pojo.HouseInfo;
import com.liyou.business.trend.pojo.callback.Rise;
import com.liyou.commons.pojo.OResultVO;
import com.liyou.exception.BargainException;
import com.liyou.util.CityEnum;
import com.liyou.util.DateHelper;
import com.liyou.util.LiyouVerifyUtil;

/**
 * 趋势处理服务 - 纯逻辑处理
 * @author 刘超
 * @date   2016-04-08
 */
@Service
public class TrendService {

	@Autowired
	private BargainHistoryService bargainHistoryService ;
	
	@Autowired
	private PlateCalcHouseRankService plateCalcHouseRankService ;
	
	@Autowired
	private HouseInfoService houseInfoService ;
	
	@Autowired
	private HouseQuotedPriceService houseQuotedPriceService ;
	
	@Autowired
	private HouseSalesRankService houseSalesRankService ;
	
	@Autowired
	private HouseTopareaBargainService houseTopareaBargainService ;
	
	@Autowired
	private PlateCalcHouseRankMapper pchrDao;
	
	
	/**
	 * 根据小区Id 获取该小区当前月的价格趋势
	 * @param houseId	小区Id
	 * @param cityId	所属城市
	 * @param months	取多少月
	 * @return
	 */
	public Rise getLatelyHousePriceRise( Integer houseId , Integer cityId , Integer months )
			throws Exception {
		
		if( !LiyouVerifyUtil.checkCityId(cityId) ){
			throw new Exception("无此城市") ;
		}
		//校验一下小区, 抛异常则表示没找到这个小区
		houseInfoService.findById(cityId, houseId) ;
		
		Map<String, Integer> map = DateHelper.getHistoryYearMonth(new Date(), 0) ;
		/*PlateCalcHouseRank rank = new PlateCalcHouseRank() ;
		rank.setBaseName(CityEnum.valueOf(cityId).getBaseName());
		rank.setHouseId(houseId);
		rank.setMonths(months);
		rank.setValyear(Short.valueOf(map.get("YEAR").toString()));
		rank.setValmonth(Short.valueOf(map.get("MONTH").toString()));*/
		
		//List<PlateCalcHouseRank> ranks = plateCalcHouseRankService.selectByAll(rank) ;
		Map<String, Object> resultMap = pchrDao.selectPriceRateByYM(CityEnum.valueOf(cityId).getBaseName(),houseId, Integer.valueOf(map.get("MONTH").toString()), map.get("YEAR").toString(), months);
		//当前月未取到数据则取上一个月的数据 ? 暂不做
		Rise rise = new Rise();
		if( resultMap != null && resultMap.get("priceRate")!=null){
			rise.setRise((Float)resultMap.get("priceRate"));
		}
		
		return rise ;
	}
	
	/**
	 * 获取小区的销售数量的增长率
	 * @param houseId
	 * @param cityId
	 * @param months
	 * @return
	 * @throws Exception 
	 */
	public Rise getHouseGrowthRate( Integer houseId , Integer cityId , Integer months ) 
			throws Exception{
		
		if( !LiyouVerifyUtil.checkCityId(cityId) ){
			throw new Exception("无此城市") ;
		}
		
		/*HouseInfo houseinfo = houseInfoService.findById(cityId, houseId) ;
		
		String isFrist = houseinfo.getIsFirst() ;*/
		
		/*//获取计算的起始日期段
		String beginDate1 = getBeginDate(isFrist, false) ;
		String endDate1 = getEndDate(isFrist, false) ;
		
		//获取计算的结束日期段
		String beginDate2 = getBeginDate(isFrist, true) ;
		String endDate2 = getEndDate(isFrist, true) ;
		
		String baseName = CityEnum.valueOf(cityId).getBaseName() ;
		
		Integer count1 = bargainHistoryService.getHouseTimesSalesCount(baseName, houseId, beginDate1, endDate1) ;
		Integer count2 = bargainHistoryService.getHouseTimesSalesCount(baseName, houseId, beginDate2, endDate2) ;
		
		return calcRise(count1, count2) ;*/
		
		Map<String, Integer> map = DateHelper.getHistoryYearMonth(new Date(), 0) ;
		Map<String, Object> resultMap = pchrDao.selectSalesRateByYM(CityEnum.valueOf(cityId).getBaseName(),houseId, Integer.valueOf(map.get("MONTH").toString()), map.get("YEAR").toString(), months);
		//当前月未取到数据则取上一个月的数据 ? 暂不做
		Rise rise = new Rise() ;
		if( resultMap != null && resultMap.get("salesRate")!=null){
			rise.setRise((Float)resultMap.get("salesRate"));
		}
		return rise;
	}
	
	/**
	 * 根据一手房还是二手房 , 获取起始日期
	 * @param isFirst	是否一手房
	 * @param isThree	是否取后推的三个月做起始日期 true = 是 , false = 否
	 */
	private String getEndDate( String isFirst , boolean isThree ){
		String endDate = null ;
		do{
			int add = 0 ;
			if( isThree ){
				add = 3 ;
			}
			//一手房时间获取
			if( "1".equals(isFirst) ){
				endDate = DateHelper.getHistoryDate(0 + add) ;
				break ;
			}
			//二手房前半个月时间获取
			if( DateHelper.isBeforeHalfMonth() ){
				endDate = DateHelper.getMonthEnd(-(2 + add)) ;
				break ;
			}
			//二手房后半个月时间获取
			endDate = DateHelper.getMonthEnd(-(1 + add)) ;
		}while(false) ;
		
		return endDate ;
	}
	
	/**
	 * 根据一手房还是二手房 , 获取结束日期
	 * @param isFirst	是否一手房
	 * @param isThree	是否取后推的三个月做起始日期 true = 是 , false = 否
	 */
	private String getBeginDate( String isFirst , boolean isThree ){
		String beginDate = null ;
		do{
			int add = 0 ;
			if( isThree ){
				add = 3 ;
			}
			//一手房时间获取
			if( "1".equals(isFirst) ){
				beginDate = DateHelper.getHistoryDate(3 + add) ;
				break ;
			}
			//二手房前半个月时间获取
			if( DateHelper.isBeforeHalfMonth() ){
				beginDate = DateHelper.getMonthBegin(-(4 + add)) ;
				break ;
			}
			//二手房后半个月时间获取
			beginDate = DateHelper.getMonthBegin(-(3 + add)) ;
		}while(false) ;
		
		return beginDate ; 
	}
	
	/**
	 * 计算两个值的增长率<br>
	 * (当前值 - 上次值) / 上次值 = 增长率
	 * @param threeSalescount1	当前值
	 * @param threeSalescount2	上次的值
	 * @return
	 */
	private Rise calcRise(Integer count1,Integer count2){
		
		Rise rise2 = new Rise() ;
		
		do {
			
			if( count1 == null || count2 == null || count2.equals(0) ){
				rise2.setRise(0f);
				break ;
			}
			
			Double rise = (double)(count1 - count2)/(double)count2 ;
			Integer r = (int) Math.round(rise * 100) ;
			
			rise2.setRise(r*1f);
		} while (false);
		
		return rise2 ;
	}
	
	/**
	 * 获取小区的房价预测信息
	 * @param cityId
	 * @param houseId
	 * @return
	 * @throws BargainException 
	 */
	public Map<String, Object> getHousePriceForecast(Integer cityId , Integer houseId) 
			throws Exception{
		/*//校验一下小区, 抛异常则表示没找到这个小区
		houseInfoService.findById(cityId, houseId) ;
		
		Map<String, Integer> map = new HashMap<String, Integer>() ;
		
		//近一个月平均报价
		Long avgQuote = houseQuotedPriceService.getHouseAvgQuote(cityId, houseId) ;
		//头部价格最高价
		Long topTotalprice = houseTopareaBargainService.getHouseMaxTotalprice(cityId, houseId) ;
		
		Integer conclusion = 2 ;
		do{
			//有一个价格没有就按照持平处理 , 或者两个相等
			if( avgQuote == null || topTotalprice == null || 
					avgQuote == 0 || topTotalprice == 0 || 
					avgQuote.equals(topTotalprice) ){
				break ;
			}
			
			if( avgQuote > topTotalprice ){
				conclusion = 1 ;
				break ;
			}
			
			if( avgQuote < topTotalprice ){
				conclusion = 3 ;
				break ;
			}
		}while( false ) ;
		
		map.put("conclusion", conclusion) ;
		
		return map ;*/
		if( !LiyouVerifyUtil.checkCityId(cityId) ){
			throw new Exception("无此城市") ;
		}
		Map<String, Integer> map = DateHelper.getHistoryYearMonth(new Date(), 0) ;
		Map<String, Object> resultMap = pchrDao.selectTrendingResultByYM(CityEnum.valueOf(cityId).getBaseName(),houseId, Integer.valueOf(map.get("MONTH").toString()), map.get("YEAR").toString(), 3);
		
		//改之后  展示结果集
		Map<String, Object> map1 = new HashMap<String,Object>() ;
		if( resultMap != null && resultMap.get("trendResult")!=null){
			String trendResult = resultMap.get("trendResult").toString().trim();
			Integer flag = 2;//有价无市和持平=持平
			if("即将上涨".equals(trendResult)||"上涨".equals(trendResult))flag=1;
			if("准备下跌".equals(trendResult)||"下跌".equals(trendResult))flag=3;
			map1.put("conclusion", flag) ;
		}
		return map1;
	}
	
	/**
	 * 获取小区的价格、销售量趋势以及房价的预测
	 * @param cityId
	 * @param houseId
	 * @return
	 * @throws Exception
	 */
	public OResultVO getHouseTrend(Integer cityId, Integer houseId) throws Exception{
		OResultVO resultVo = new OResultVO(true, 0, "");
		if(!LiyouVerifyUtil.checkCityId(cityId) ){
			return resultVo.setVaule(false, 1, "没有找到对应的城市");
		}
		HouseInfo houseInfo = houseInfoService.getHouseById(cityId, houseId);
		if(houseInfo == null || houseInfo.getHouseId() == null){
			return resultVo.setVaule(false, 2, "没有找到对应的小区");
		}
		
		Map<String, Integer> map = DateHelper.getHistoryYearMonth(new Date(), 0) ;
		List<Map<String, Object>> resultMap = pchrDao.selectHouseTrendingByYM(CityEnum.valueOf(cityId).getBaseName(),houseId, Integer.valueOf(map.get("MONTH").toString()), map.get("YEAR").toString());
		if(resultMap==null||resultMap.size()==0)return resultVo.setVaule(false, 3, "没有找到相关的数据（可能是没有交易数据）");
		return resultVo.setVaule(true, 200, resultMap.get(0));
	}
	
}
