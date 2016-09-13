package com.liyou.business.trend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liyou.business.trend.dao.HouseSalesRankMapper;
import com.liyou.business.trend.pojo.HouseSalesRank;
import com.liyou.business.trend.pojo.HouseSalesRankCriteria;
import com.liyou.business.trend.service.HouseSalesRankService;
import com.liyou.commons.dao.BaseDao;
import com.liyou.commons.service.BaseServiceImpl;

@Service
public class HouseSalesRankServiceImpl extends BaseServiceImpl<HouseSalesRank, HouseSalesRankCriteria>
		implements HouseSalesRankService{

	@Autowired
	private HouseSalesRankMapper houseSalesRankDao ;
	
	/**
	 * 获取小区某个月的三个月内销量
	 * @param houseSalesRank
	 * @return
	 */
	public Integer getHouseMonthSalesCount(HouseSalesRank houseSalesRank) {
		return houseSalesRankDao.getHouseMonthSalesCount(houseSalesRank) ;
	}
	
	@Override
	protected BaseDao<HouseSalesRank, HouseSalesRankCriteria, String> getDao() {
		// TODO Auto-generated method stub
		return houseSalesRankDao;
	}

}
