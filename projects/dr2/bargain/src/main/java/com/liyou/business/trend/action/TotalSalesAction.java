package com.liyou.business.trend.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.liyou.business.trend.pojo.callback.Rise;
import com.liyou.business.trend.service.TrendService;
import com.liyou.commons.pojo.OResultVO;
import com.liyou.util.ResultCode;

/**
 * 小区的销售数量的增长率
 * @author 刘超
 * @date   2016-04-08
 */
@RestController
@RequestMapping(value = "/bargain")
public class TotalSalesAction {
	private final Logger logger = Logger.getLogger(TotalSalesAction.class);
	@Autowired
	private TrendService trendService ;
	
	/**
	 * 获取小区的销售数量趋势 - 销售量增长率
	 * @return
	 */
	@RequestMapping(value = "/trend/sales" ,method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> countRise( HttpServletRequest request, HttpServletResponse response ){

		ResponseEntity<?> entity = null ;
		do {
			try {
				
				String city_id = request.getParameter("cityId") ;
				String months = request.getParameter("months") ;
				String house_id = request.getParameter("houseId") ;
				if( !StringUtils.isNoneBlank(city_id) || !StringUtils.isNoneBlank(house_id) ){
					entity = new ResponseEntity<>(ResultCode.errorParam() ,HttpStatus.NOT_FOUND) ;
					break ;
				}
				
				Integer cityId = Integer.valueOf(city_id) ;
				Integer houseId = Integer.valueOf(house_id) ;
				Integer month = !StringUtils.isNoneBlank(months) ? 1 : Integer.valueOf(months) ;
				
				Rise rise = trendService.getHouseGrowthRate(houseId, cityId, month) ;
				
				entity = new ResponseEntity<>(rise ,HttpStatus.OK) ;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				entity = new ResponseEntity<>(ResultCode.error(3, e.getMessage()) ,HttpStatus.NOT_FOUND) ;
			}
		} while (false);
		
		return entity ;
	}
	
	/**
	 * 获取小区的价格、销售量趋势以及房价的预测
	 * @return
	 */
	@RequestMapping(value = "/trend/all" ,method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> houseTrend(@RequestParam(required=true, value="cityId") Integer cityId,
			@RequestParam(required=true, value="houseId") Integer houseId,
			HttpServletRequest request, HttpServletResponse response){
		try {
			OResultVO reuslt = trendService.getHouseTrend(cityId, houseId);
			if(reuslt.getSuccess()){
				return new ResponseEntity<>(reuslt.getContext(), HttpStatus.OK);
			}else{
				return new ResponseEntity<>(ResultCode.error(reuslt.getReCode(), reuslt.getContext().toString()), HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			logger.error("接口【/trend/all】", e);
			return new ResponseEntity<>(ResultCode.error(500, "服务器错误") ,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
