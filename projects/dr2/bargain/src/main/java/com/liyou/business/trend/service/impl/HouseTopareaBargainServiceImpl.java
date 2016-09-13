package com.liyou.business.trend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liyou.business.trend.dao.HouseTopareaBargainMapper;
import com.liyou.business.trend.pojo.HouseTopareaBargain;
import com.liyou.business.trend.pojo.HouseTopareaBargainCriteria;
import com.liyou.business.trend.service.HouseTopareaBargainService;
import com.liyou.commons.dao.BaseDao;
import com.liyou.commons.service.BaseServiceImpl;
import com.liyou.exception.BargainException;
import com.liyou.util.CityEnum;
import com.liyou.util.LiyouVerifyUtil;

/**
 * 头部价格处理  - 逻辑处理实现
 * @author 刘超
 * @date   2016-04-08
 */
@Service
public class HouseTopareaBargainServiceImpl extends BaseServiceImpl<HouseTopareaBargain, HouseTopareaBargainCriteria>
		implements HouseTopareaBargainService{

	@Autowired
	private HouseTopareaBargainMapper houseTopareaBargainDao ;
	
	@Override
	public Long getHouseMaxTotalprice(Integer cityId, Integer houseId) throws BargainException {
		
		if( !LiyouVerifyUtil.checkCityId(cityId) ){
			throw new BargainException("无此城市");
		}
		
		String baseName = CityEnum.valueOf(cityId).getBaseName() ;
		
		return houseTopareaBargainDao.getHouseMaxTotalprice(baseName, houseId);
	}

	@Override
	protected BaseDao<HouseTopareaBargain, HouseTopareaBargainCriteria, String> getDao() {
		// TODO Auto-generated method stub
		return houseTopareaBargainDao;
	}

}
