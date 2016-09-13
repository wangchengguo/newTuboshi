package com.liyou.business.trend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liyou.business.trend.dao.PlateCalcHouseRankMapper;
import com.liyou.business.trend.pojo.PlateCalcHouseRank;
import com.liyou.business.trend.pojo.PlateCalcHouseRankCriteria;
import com.liyou.business.trend.service.PlateCalcHouseRankService;
import com.liyou.commons.dao.BaseDao;
import com.liyou.commons.service.BaseServiceImpl;

@Service
public class PlateCalcHouseRankServiceImpl extends BaseServiceImpl<PlateCalcHouseRank, PlateCalcHouseRankCriteria>
		implements PlateCalcHouseRankService {

	@Autowired
	private PlateCalcHouseRankMapper plateCalcHouseRankDao ;
	
	/**
	 * 根据数据库条件. 在多条件下获取趋势集合
	 * @param plateCalcHouseRank
	 * @return
	 */
	@Override
	public List<PlateCalcHouseRank> selectByAll( PlateCalcHouseRank plateCalcHouseRank ){
		
		return plateCalcHouseRankDao.selectByAll(plateCalcHouseRank);
	}
	
	@Override
	protected BaseDao<PlateCalcHouseRank, PlateCalcHouseRankCriteria, String> getDao() {
		// TODO Auto-generated method stub
		return plateCalcHouseRankDao ;
	}
	
	

}
