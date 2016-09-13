package com.liyou.business.trend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liyou.business.trend.dao.HouseInfoMapper;
import com.liyou.business.trend.pojo.HouseInfo;
import com.liyou.business.trend.pojo.HouseInfoCriteria;
import com.liyou.business.trend.service.HouseInfoService;
import com.liyou.commons.dao.BaseDao;
import com.liyou.commons.service.BaseServiceImpl;
import com.liyou.exception.BargainException;
import com.liyou.util.CityEnum;

@Service
public class HouseInfoServiceImpl extends BaseServiceImpl<HouseInfo, HouseInfoCriteria> 
		implements HouseInfoService {
	
	@Autowired
	private HouseInfoMapper houseInfoDao ;

	@Override
	public HouseInfo findById(Integer cityId, Integer houseId) throws BargainException {
		String baseName = CityEnum.valueOf(cityId).getBaseName() ;
		
		HouseInfo houseInfo = houseInfoDao.findById(baseName, houseId) ;
		
		if( houseInfo == null || houseInfo.getHouseId() == null ){
			throw new BargainException("无此小区 : " + houseId) ;
		}
		
		return houseInfo ;
	}
	
	@Override
	public HouseInfo getHouseById(Integer cityId, Integer houseId){
		String baseName = CityEnum.valueOf(cityId).getBaseName() ;
		HouseInfo houseInfo = houseInfoDao.findById(baseName, houseId) ;
		return houseInfo ;
	}
	
	@Override
	protected BaseDao<HouseInfo, HouseInfoCriteria, String> getDao() {
		// TODO Auto-generated method stub
		return houseInfoDao;
	}

}
