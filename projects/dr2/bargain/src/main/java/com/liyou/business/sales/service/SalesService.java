package com.liyou.business.sales.service;



import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liyou.business.sales.dao.SalesMapper;
import com.liyou.business.sales.pojo.HotHousePlateSchool;
import com.liyou.business.sales.pojo.HouseSalesRatio;
import com.liyou.business.sales.pojo.Sales;
import com.liyou.business.sales.pojo.houseQuotedPrice;
import com.liyou.business.sales.pojo.param.HousePercentage;
import com.liyou.business.sales.pojo.param.HousePriceDetailParam;
import com.liyou.business.sales.pojo.param.PeriodObjVo;
import com.liyou.business.sales.pojo.param.PeriodStatisticVo;
import com.liyou.business.sales.pojo.param.SalesParam;
import com.liyou.business.trend.dao.BargainHistoryMapper;
import com.liyou.business.trend.dao.HouseInfoMapper;
import com.liyou.business.trend.pojo.BargainHistory;
import com.liyou.business.trend.pojo.HouseInfo;
import com.liyou.business.trend.pojo.callback.TransactionHistory;
import com.liyou.business.trend.pojo.param.PeriodVo;
import com.liyou.commons.pojo.OResultVO;
import com.liyou.util.CityEnum;
import com.liyou.util.DateHelper;
import com.liyou.util.LiyouVerifyUtil;
import com.liyou.util.Tools;
@Service("houseService")
public class SalesService implements ISalesService{
	private final Logger logger = Logger.getLogger(SalesService.class);
	@Autowired
	private SalesMapper salesMapper;
	
	@Autowired
	private HouseInfoMapper houseInfoDao;
	
	@Autowired
	private BargainHistoryMapper bargainHistoryDao;
	
	@Override
	public String getSales(SalesParam param){
		String baseName=CityEnum.valueOf(param.getCityId()).getBaseName();
		param.setBaseName(baseName);
		Sales sales=salesMapper.getSales(param);
		if(sales==null)
		{
			return "0";
		}
		String startDate=null,endDate=null;
		List<String> list=null;
		if(sales.getIf_first()!=null&&sales.getIf_first()!=0)
		{
			if(sales.getIf_first()==1)
			{
				list=LiyouVerifyUtil.getCurMonth();
				startDate=list.get(0);
				endDate=list.get(1);
			}
			if(sales.getIf_first()==2)
			{
				list=LiyouVerifyUtil.getStartEndDate();
				startDate=list.get(0);
				endDate=list.get(1);
			}
		}
		param.setStartDate(startDate);
		param.setEndDate(endDate);
		Sales Lprice=salesMapper.getHistoryPrice(param);
		param.setSort(1);
		Sales Hprice=salesMapper.getHistoryPrice(param);
		param.setSort(2);
		Sales BLprice=salesMapper.getbaginHistoryPrice(param);
		param.setSort(1);
		Sales BHprice=salesMapper.getbaginHistoryPrice(param);
		
		Sales highprice=null;
		Sales lowprice=null;
		if(Hprice!=null&&BHprice!=null)
		{
			highprice=Hprice.getTotalprice()>BHprice.getTotalprice()?Hprice:BHprice;
		}
		if(BHprice!=null)
		{
			highprice=BHprice;
		}
		if(Hprice!=null)
		{
			highprice=Hprice;
		}
		if(Lprice!=null&&BLprice!=null)
		{
			lowprice=Lprice.getTotalprice()<BLprice.getTotalprice()?Lprice:BLprice;
		}
		if(Lprice!=null)
		{
			lowprice=Lprice;
		}
		if(BLprice!=null)
		{
			lowprice=BLprice;
		}
		JSONObject jsonObj=new JSONObject();
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("rate",sales.getRate());
		jsonObject.put("salesCount", sales.getSales_count());
		JSONObject object=new JSONObject();
		object.put("from",sales.getBottom_price());
		object.put("to", sales.getTop_price()==null?sales.getBottom_price()+"万以上":sales.getTop_price());
		jsonObject.put("pricePeriod",object);
		jsonObj.put("salesRate",jsonObject);
		JSONObject hprice=new JSONObject();
		if(highprice!=null)
		{
			hprice.put("roomType",highprice.getRoomtype());
			hprice.put("building", highprice.getBuilding());
			hprice.put("sinPrice", highprice.getSinprice()/100);
			hprice.put("area", new BigDecimal(Double.valueOf(highprice.getBargain_area())).divide(new BigDecimal(100)));
			hprice.put("floor", highprice.getFloor());
			
				try {
					hprice.put("bargainDate", Tools.getDates(highprice.getBargaindate()));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		jsonObj.put("highestPrice",hprice);
		JSONObject lprice=new JSONObject();
		if(lowprice!=null)
		{
			lprice.put("roomType", lowprice.getRoomtype());
			lprice.put("building", lowprice.getBuilding());
			lprice.put("sinPrice", lowprice.getSinprice()/100);
			lprice.put("area", lowprice.getBargain_area()/100);
			lprice.put("floor", lowprice.getFloor());
			try {
				lprice.put("bargainDate", Tools.getDates(lowprice.getBargaindate()));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		jsonObj.put("lowestPrice",lprice);
 
		return jsonObj.toString();
		
	}
	@Override
	public String getSinPriceSales(SalesParam param) {
		String baseName=CityEnum.valueOf(param.getCityId()).getBaseName();
		param.setBaseName(baseName);
		Sales sales=salesMapper.getSalesSinPrice(param);
		if(sales==null)
		{
			return "0";
		}
		String startDate=null,endDate=null;
		List<String> list=null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if(sales.getIf_first()!=null&&sales.getIf_first()!=0)
		{
			if(sales.getIf_first()==1)
			{
				list=LiyouVerifyUtil.getCurMonth();
				startDate=list.get(0);
				endDate=list.get(1);
			}
			if(sales.getIf_first()==2)
			{
				list=LiyouVerifyUtil.getStartEndDate();
				startDate=list.get(0);
				endDate=list.get(1);
			}
		}
		param.setStartDate(startDate);
		param.setEndDate(endDate);
		Sales Lprice=salesMapper.getHistorySinPricePrice(param);
		param.setSort(1);
		Sales Hprice=salesMapper.getHistorySinPricePrice(param);
		param.setSort(2);
		Sales BLprice=salesMapper.getbaginHistorySinPricePrice(param);
		param.setSort(1);
		Sales BHprice=salesMapper.getbaginHistorySinPricePrice(param);
		Sales highprice=null;
		Sales lowprice=null;
		if(Hprice!=null&&BHprice!=null)
		{
			highprice=Hprice.getSinprice()>BHprice.getSinprice()?Hprice:BHprice;
		}
		if(BHprice!=null)
		{
			highprice=BHprice;
		}
		if(Hprice!=null)
		{
			highprice=Hprice;
		}
		if(Lprice!=null&&BLprice!=null)
		{
			lowprice=Lprice.getSinprice()<BLprice.getSinprice()?Lprice:BLprice;
		}
		if(Lprice!=null)
		{
			lowprice=Lprice;
		}
		if(BLprice!=null)
		{
			lowprice=BLprice;
		}
		
		JSONObject jsonObj=new JSONObject();
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("rate",sales.getRate());
		jsonObject.put("salesCount", sales.getSales_count());
		JSONObject object=new JSONObject();
		object.put("from",sales.getL_price()/100);
		object.put("to", sales.getH_price()/100);
		jsonObject.put("pricePeriod",object);
		jsonObj.put("salesRate",jsonObject);
		JSONObject hprice=new JSONObject();
		if(highprice!=null)
		{
			hprice.put("roomType",highprice.getRoomtype());
			hprice.put("building", highprice.getBuilding());
			hprice.put("sinPrice", highprice.getSinprice()/100);
			hprice.put("area", new BigDecimal(Double.valueOf(highprice.getBargain_area())).divide(new BigDecimal(100)));
			hprice.put("floor", highprice.getFloor());
			try {
				hprice.put("bargainDate", Tools.getDates(highprice.getBargaindate()));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		jsonObj.put("highestPrice",hprice);
		JSONObject lprice=new JSONObject();
		if(lowprice!=null)
		{
			lprice.put("roomType", lowprice.getRoomtype());
			lprice.put("building", lowprice.getBuilding());
			lprice.put("sinPrice", lowprice.getSinprice()/100);
			lprice.put("area", lowprice.getBargain_area()/100);
			lprice.put("floor", lowprice.getFloor());
			try {
				lprice.put("bargainDate", Tools.getDates(lowprice.getBargaindate()));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		jsonObj.put("lowestPrice",lprice);
		return jsonObj.toString();
		}
	@Override
	public String getPriceDetail(HousePriceDetailParam detailParam) {
		String baseName=CityEnum.valueOf(detailParam.getCityId()).getBaseName();
		detailParam.setBaseName(baseName);
		List<houseQuotedPrice> quotedPrice=salesMapper.getPriceDetail(detailParam);
		Integer start=detailParam.getStart()==null?0:detailParam.getStart();
		Integer count=detailParam.getCount()==null?0:detailParam.getCount();
		JSONObject object=new JSONObject();
		object.put("totalCount",quotedPrice.size());
		object.put("start",detailParam.getStart());
		object.put("next",start+count);
		JSONArray jsonArray=new JSONArray();
		for (int i = 0; i < quotedPrice.size(); i++) {
			houseQuotedPrice  houseQuotedPrice=quotedPrice.get(i);
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("quotedPrice",houseQuotedPrice.getQuoted_total_price()/100);
			jsonObject.put("rooms", houseQuotedPrice.getRooms());
			jsonObject.put("roomType", houseQuotedPrice.getUdc_name());
			jsonObject.put("floor", houseQuotedPrice.getFloor());
			jsonObject.put("floorDisplay", houseQuotedPrice.getFloor_display());
			jsonObject.put("agentId", houseQuotedPrice.getAgent_id());
			jsonObject.put("agentName", houseQuotedPrice.getAgent_name());
			jsonObject.put("area", houseQuotedPrice.getArea()/100);
			jsonArray.add(jsonObject);
		}
		object.put("list",jsonArray);
		return object.toString();
	}
	@Override
	public String getPercentage(HousePercentage housePercentage) {
		String baseName=CityEnum.valueOf(housePercentage.getCityId()).getBaseName();
		housePercentage.setBaseName(baseName);
		List<HouseSalesRatio> list=salesMapper.getHousePercentage(housePercentage);
		Long sum=0l;
		for (HouseSalesRatio houseSalesRatio : list) {
			sum+=houseSalesRatio.getSalesCount();
		}
		for (HouseSalesRatio houseSalesRatio : list) {
			houseSalesRatio.setRate(new BigDecimal((double)houseSalesRatio.getSalesCount()/(double)sum*100).setScale(2,BigDecimal.ROUND_UP).toString());
		}
		JSONArray array=JSONArray.fromObject(list);
		return array.toString();
	}
	
	@Override
	public OResultVO getPeriodinfo(HousePercentage housePercentage)throws Exception {
		OResultVO result = new OResultVO(true, 0, "");
		Integer houseId = housePercentage.getHouseId();
		if(houseId==null||housePercentage.getCityId()==null){
			return result.setVaule(false, 406, "请求不被接受，参数不正确(参数格式不正确，缺少参数)");
		}
		if( !LiyouVerifyUtil.checkCityId(housePercentage.getCityId()) ){
			return result.setVaule(false, 404, "没有找到对应的资源，可能是cityId，houseId不存在");
		}
		//获取分数据库名
		String baseName=CityEnum.valueOf(housePercentage.getCityId()).getBaseName();
		housePercentage.setBaseName(baseName);
		//查询小区类型 一手房，二手房
		HouseInfo house = houseInfoDao.findById(baseName, houseId);
		if(house==null){
			return result.setVaule(false, 404, "没有找到对应的资源，可能是houseId不存在");
		}
		//获取当前三个月日期段
		String beginDate1=null,endDate1=null;
		List<String> list=LiyouVerifyUtil.getStartEndDate();
		beginDate1=list.get(0);
		endDate1=list.get(1);
		List<PeriodVo> periodList = bargainHistoryDao.getTotalpriceRangeConfig(baseName, housePercentage.getCityId());
		if(periodList==null||periodList.size()==0){
			return result.setVaule(false, 404, "没有找到对应的资源，没有配置时间段");
		}
		//获取当前三个月日期段历史记录
		List<BargainHistory> list1 = bargainHistoryDao.getBargainHisByHouseId(baseName, houseId, beginDate1, endDate1,housePercentage.getRooms());
		//获取前三个月日期段历史记录
		List<BargainHistory> list2 = bargainHistoryDao.getBargainHisByHouseId(baseName, houseId, beginDate1, endDate1,housePercentage.getRooms());
		//分组当前三个月的历史记录按照房型Rooms
		Map<Integer,List<BargainHistory>> mapGroupRoom1 = groupHistoryByRooms(list1);
		//分组前三个月的历史记录按照房型Rooms
		Map<Integer,List<BargainHistory>> mapGroupRoom2 = groupHistoryByRooms(list2);
	
		//分组mapGroupRoom 根据时间段
		Map<Integer,List<PeriodObjVo>> mapGroupPeriod1 = groupHistoryByPeriod(mapGroupRoom1,periodList);
		//前三个月 历史记录
		Map<Integer,List<PeriodObjVo>> mapGroupPeriod2 = groupHistoryByPeriod(mapGroupRoom2,periodList);
		//计算 与前三个月销售相比的增长量
		List<PeriodStatisticVo> resultList = new ArrayList<PeriodStatisticVo>();
		for(Map.Entry<Integer,List<PeriodObjVo>> entry : mapGroupPeriod1.entrySet()){
			Integer rooms = entry.getKey();
			//每个房型的历史记录
			for (PeriodObjVo periodObjVo : entry.getValue()) {
				PeriodObjVo f_period = getSalesRiseFromPeriod(mapGroupPeriod2.get(rooms),periodObjVo.getPeriod());
				if(f_period!=null){
					periodObjVo.setSalesRise(periodObjVo.getSalesCount()-f_period.getSalesCount());
				}
			}
			PeriodStatisticVo statistVo = new PeriodStatisticVo();
			statistVo.setRooms(rooms);
			Collections.sort(entry.getValue());//排序
			statistVo.setPeriodList(entry.getValue());
			resultList.add(statistVo);
		}
		return result.setVaule(true, 0, resultList);
	}
	
	private PeriodObjVo getSalesRiseFromPeriod(List<PeriodObjVo> list,PeriodVo period){
		if(list==null)return null;
		for (PeriodObjVo periodObjVo : list) {
			if(period.equals(periodObjVo.getPeriod()))return periodObjVo;
		}
		return null;
	}
	
	private Map<Integer,List<PeriodObjVo>> groupHistoryByPeriod(Map<Integer,List<BargainHistory>> mapGroupRoom,List<PeriodVo> periodList){
		Map<Integer,List<PeriodObjVo>> mapGroupPeriod1 = new TreeMap<Integer,List<PeriodObjVo>>();
		for(Map.Entry<Integer, List<BargainHistory>> entry : mapGroupRoom.entrySet())    
		{    
			List<PeriodObjVo> periodList1 = new ArrayList<PeriodObjVo>();
			Integer rooms = entry.getKey();
			//每个房型的历史记录
			List<BargainHistory> histList = entry.getValue();
			
			for (PeriodVo periodVo : periodList) {
				PeriodObjVo periodObjVo = new PeriodObjVo();
				//获取当前时间段对象对应的成交量
				Integer statisticCount = statisticPeriod(periodVo,histList);
				if(statisticCount==0)continue;//过滤掉成交量等于0
				periodObjVo.setPeriod(periodVo);
				periodObjVo.setSalesCount(statisticCount);//成交量
				periodObjVo.setSalesRise(statisticCount);
				periodList1.add(periodObjVo);
			}
			mapGroupPeriod1.put(rooms, periodList1);
		}
		return mapGroupPeriod1;
	}
	
	private Map<Integer,List<BargainHistory>> groupHistoryByRooms(List<BargainHistory> list){
		Map<Integer,List<BargainHistory>> mapGroupRoom = new TreeMap<Integer,List<BargainHistory>>();
		for (BargainHistory bargainHistory : list) {
			Integer rooms = bargainHistory.getRooms();
			if(rooms == null)continue;
			if(rooms>5)rooms=6;//大于5的都统计成6
			if(mapGroupRoom.get(rooms)==null){
				List<BargainHistory> histList = new ArrayList<BargainHistory>();
				histList.add(bargainHistory);
				mapGroupRoom.put(rooms, histList);
			}else{
				mapGroupRoom.get(rooms).add(bargainHistory);
			}
		}
		
		return mapGroupRoom;
	}
	
	//统计某个时间段销量 periodVo时间段对象
	private Integer statisticPeriod(PeriodVo periodVo,List<BargainHistory> histList){
		Integer count = 0;
		for (BargainHistory history : histList) {
			if(history.getTotalprice()==null)continue;
			Long totalPrice = history.getTotalprice()/100;
			Integer from = periodVo.getFrom();
			Integer to = periodVo.getTo();
				if(to==null){
					if(from<=totalPrice)count = count+1;
				}else{
					if(from<=totalPrice&&totalPrice<=to)count = count+1;
				}
		}
		return count;
	}
	
	/**
	 * 根据一手房还是二手房 , 获取开始日期
	 * @param isFirst	是否一手房
	 * @param isThree	是否取后推的三个月做起始日期 true = 是 , false = 否
	 */
	private String getBeginDate( String isFirst , boolean isThree ){
		String beginDate = null ;
		do{
			int add = 0 ;
			if(isThree){
				add = 3;
			}
			//一手房时间获取
			if( "1".equals(isFirst) ){
				beginDate = DateHelper.getHistoryDate(3 + add) ;
				break ;
			}
			//二手房前半个月时间获取
			if( DateHelper.isBeforeHalfMonth() ){
				beginDate = DateHelper.getMonthBegin(-(4 + add)) ;
				break;
			}
			//二手房后半个月时间获取
			beginDate = DateHelper.getMonthBegin(-(3 + add)) ;
		}while(false);
		
		return beginDate ; 
	}
	
	/**
	 * 根据一手房还是二手房 , 获取结束日期
	 * @param isFirst	是否一手房
	 * @param isThree	是否取后推的三个月做起始日期 true = 是 , false = 否
	 */
	private String getEndDate( String isFirst , boolean isThree){
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
				break;
			}
			//二手房后半个月时间获取
			endDate = DateHelper.getMonthEnd(-(1 + add)) ;
		}while(false);
		
		return endDate ;
	}

	@Override
	public String getHotHousePlateSchool(Integer cityId, String type,Integer needCount) {
		String baseName=CityEnum.valueOf(cityId).getBaseName();
		List<HotHousePlateSchool> housePlateSchools=salesMapper.getHotHousePlateSchool(baseName, type,needCount);
		if(housePlateSchools.size()==0)
		{
			return "0";
		}
		JSONArray array=JSONArray.fromObject(housePlateSchools);
		return array.toString();
	}

	
	@Override
	public OResultVO getHouseSalecountByMonth(Integer cityId, Integer isFirst, Integer needCount) {
		try {
			//获取分数据库名
			String baseName=CityEnum.valueOf(cityId).getBaseName();
			if(needCount==null)needCount=10;
			List<Map<String, Object>> list = salesMapper.getHouseSalecountByMonth(baseName, isFirst, needCount);
			return new OResultVO(true, 200, list);
		} catch (Exception e) {
			logger.error(e);
			return new OResultVO(false, 500, "服务器错误");
		}
	}
	
	@Override
	public OResultVO getSchoolSalecountByMonth(Integer cityId, Integer needCount) {
		try {
			//获取分数据库名
			String baseName=CityEnum.valueOf(cityId).getBaseName();
			if(needCount==null)needCount=10;
			//当前日期减31天
			SimpleDateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
			Date beginDate = new Date();
			Calendar date = Calendar.getInstance();
			date.setTime(beginDate);
			date.set(Calendar.DATE, date.get(Calendar.DATE) - 31);
			List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
			list = salesMapper.getSchoolSalecountByMonth(baseName, dft.format(date.getTime()), needCount);
			return new OResultVO(true, 200, list);
		} catch (Exception e) {
			logger.error(e);
			return new OResultVO(false, 500, "服务器错误");
		}
	}
	@Override
	public String getSalesMost(SalesParam param) {
		String baseName=CityEnum.valueOf(param.getCityId()).getBaseName();
		param.setBaseName(baseName);
		Sales sales=salesMapper.getSales(param);
		if(sales==null)
		{
			return "0";
		}
		String startDate=null,endDate=null;
		List<String> list=null;
		if(sales.getIf_first()!=null&&sales.getIf_first()!=0)
		{
			if(sales.getIf_first()==1)
			{
				list=LiyouVerifyUtil.getCurMonth();
				startDate=list.get(0);
				endDate=list.get(1);
			}
			if(sales.getIf_first()==2)
			{
				list=LiyouVerifyUtil.getStartEndDate();
				startDate=list.get(0);
				endDate=list.get(1);
			}
		}
		param.setStartDate(startDate);
		param.setEndDate(endDate);
		Sales Lprice=salesMapper.getHistoryPrice(param);
		param.setSort(1);
		Sales Hprice=salesMapper.getHistoryPrice(param);
		param.setSort(2);
		Sales BLprice=salesMapper.getbaginHistoryPrice(param);
		param.setSort(1);
		Sales BHprice=salesMapper.getbaginHistoryPrice(param);
		
		Sales highprice=null;
		Sales lowprice=null;
		if(Hprice!=null&&BHprice!=null)
		{
			highprice=Hprice.getTotalprice()>BHprice.getTotalprice()?Hprice:BHprice;
		}
		if(BHprice!=null)
		{
			highprice=BHprice;
		}
		if(Hprice!=null)
		{
			highprice=Hprice;
		}
		if(Lprice!=null&&BLprice!=null)
		{
			lowprice=Lprice.getTotalprice()<BLprice.getTotalprice()?Lprice:BLprice;
		}
		if(Lprice!=null)
		{
			lowprice=Lprice;
		}
		if(BLprice!=null)
		{
			lowprice=BLprice;
		}
		JSONObject jsonObj=new JSONObject();
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("rate",sales.getRate());
		jsonObject.put("salesCount", sales.getSales_count());
		JSONObject object=new JSONObject();
		object.put("from",sales.getBottom_price());
		object.put("to", sales.getTop_price()==null?0:sales.getTop_price());
		jsonObject.put("pricePeriod",object);
		jsonObj.put("salesRate",jsonObject);
		JSONObject hprice=new JSONObject();
		if(highprice!=null)
		{
			hprice.put("roomType",highprice.getRoomtype());
			hprice.put("building", highprice.getBuilding());
			hprice.put("sinPrice", highprice.getSinprice()/100);
			hprice.put("area", highprice.getBargain_area()/100);
			hprice.put("floor", highprice.getFloor());
			
				try {
					hprice.put("bargainDate", Tools.getDates(highprice.getBargaindate()));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		jsonObj.put("highestPrice",hprice);
		JSONObject lprice=new JSONObject();
		if(lowprice!=null)
		{
			lprice.put("roomType", lowprice.getRoomtype());
			lprice.put("building", lowprice.getBuilding());
			lprice.put("sinPrice", lowprice.getSinprice()/100);
			lprice.put("area", lowprice.getBargain_area()/100);
			lprice.put("floor", lowprice.getFloor());
			try {
				lprice.put("bargainDate", Tools.getDates(lowprice.getBargaindate()));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		jsonObj.put("lowestPrice",lprice);
		return jsonObj.toString();
	}
	@Override
	public String getTransactionHistory(Integer cityId, Long bargain_id,Integer source) {
		String baseName=CityEnum.valueOf(cityId).getBaseName();
		List<TransactionHistory> list=bargainHistoryDao.getTransactionHistory(baseName, bargain_id,source);
		if(list.size()==0)
		{
			return "0";
		}
		return JSONArray.fromObject(list).toString();
	}
}
