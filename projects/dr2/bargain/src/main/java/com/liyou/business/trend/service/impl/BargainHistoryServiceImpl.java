package com.liyou.business.trend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liyou.business.trend.dao.BargainHistoryMapper;
import com.liyou.business.trend.pojo.BargainHistory;
import com.liyou.business.trend.pojo.BargainHistoryCriteria;
import com.liyou.business.trend.service.BargainHistoryService;
import com.liyou.commons.dao.BaseDao;
import com.liyou.commons.service.BaseServiceImpl;

/**
 * 成交历史 数据处理服务层实现
 * @author 刘超
 * @date   2016-04-08
 */
@Service
public class BargainHistoryServiceImpl extends BaseServiceImpl<BargainHistory, BargainHistoryCriteria>
		implements BargainHistoryService {

	@Autowired
	private BargainHistoryMapper bargainHistoryDao ;
	
	@Override
	public Integer getHouseTimesSalesCount(String baseName, Integer houseId,
			String beginDate, String endDate) {
		// TODO Auto-generated method stub
		return bargainHistoryDao.getHouseTimesSalesCount(baseName, houseId, beginDate, endDate);
	}
	
	@Override
	protected BaseDao<BargainHistory, BargainHistoryCriteria, String> getDao() {
		// TODO Auto-generated method stub
		return bargainHistoryDao;
	}

}
