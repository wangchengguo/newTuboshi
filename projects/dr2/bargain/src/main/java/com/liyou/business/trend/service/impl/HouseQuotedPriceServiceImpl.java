package com.liyou.business.trend.service.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liyou.business.trend.dao.HouseQuotedPriceMapper;
import com.liyou.business.trend.pojo.HouseQuotedPrice;
import com.liyou.business.trend.pojo.HouseQuotedPriceCriteria;
import com.liyou.business.trend.service.HouseQuotedPriceService;
import com.liyou.commons.dao.BaseDao;
import com.liyou.commons.service.BaseServiceImpl;
import com.liyou.exception.BargainException;
import com.liyou.util.CityEnum;
import com.liyou.util.LiyouVerifyUtil;

/**
 * 小区报价处理  - 逻辑处理实现
 * @author 刘超
 * @date   2016-04-08
 */
@Service
public class HouseQuotedPriceServiceImpl extends BaseServiceImpl<HouseQuotedPrice, HouseQuotedPriceCriteria>
		implements HouseQuotedPriceService {

	@Autowired
	private HouseQuotedPriceMapper houseQuotedPriceDao ;
	
	@Override
	public Long getHouseAvgQuote(Integer cityId, Integer houseId) throws BargainException {
		
		if( !LiyouVerifyUtil.checkCityId(cityId) ){
			throw new BargainException("无此城市") ;
		}
		
		String baseName = CityEnum.valueOf(cityId).getBaseName() ;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd") ;
		
		Date date = new Date() ;
		
		Calendar calendar = Calendar.getInstance(Locale.CHINA);
	    calendar.setTime(date);
	    //月数减一，即上月
    	calendar.add(Calendar.MONTH,-1);
    	
    	String beginDate = sdf.format(calendar.getTime()) ;
    	String endDate = sdf.format(date) ;
		
		return houseQuotedPriceDao.getHouseAvgQuote(baseName, houseId, beginDate, endDate);
	}
	
	@Override
	protected BaseDao<HouseQuotedPrice, HouseQuotedPriceCriteria, String> getDao() {
		// TODO Auto-generated method stub
		return houseQuotedPriceDao;
	}

}
