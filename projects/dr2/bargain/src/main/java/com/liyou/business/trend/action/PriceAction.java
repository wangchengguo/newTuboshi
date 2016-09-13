package com.liyou.business.trend.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.liyou.business.trend.pojo.callback.Rise;
import com.liyou.business.trend.service.TrendService;
import com.liyou.util.ResultCode;

/**
 * 价格趋势 
 * @author 刘超
 * @date   2016-04-08
 */
@RestController
@RequestMapping(value = "/bargain")
public class PriceAction {

	@Autowired
	private TrendService trendService ;
	
	/**
	 * 获取小区的价格趋势 - 价格增长率
	 * @return
	 */
	@RequestMapping(value = "/trend/price" ,method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> priceRise( HttpServletRequest request, HttpServletResponse response ){
		
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
				
				Rise rise = trendService.getLatelyHousePriceRise(houseId, cityId, month) ;
				
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
	 * 获取小区的房价预测 - 预测信息
	 * @return
	 */
	@RequestMapping(value = "/trend/priceforecast" ,method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> priceForecast( HttpServletRequest request, HttpServletResponse response ){
		
		ResponseEntity<?> entity = null ;
		do {
			try {
				String city_id = request.getParameter("cityId") ;
				String house_id = request.getParameter("houseId") ;
				if( !StringUtils.isNoneBlank(city_id) || !StringUtils.isNoneBlank(house_id) ){
					entity = new ResponseEntity<>(ResultCode.errorParam() ,HttpStatus.NOT_FOUND) ;
					break ;
				}
				
				Integer cityId = Integer.valueOf(city_id) ;
				Integer houseId = Integer.valueOf(house_id) ;
				
				Map<String, Object> rise = trendService.getHousePriceForecast(cityId, houseId) ;
				
				entity = new ResponseEntity<>(rise ,HttpStatus.OK) ;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				entity = new ResponseEntity<>(ResultCode.error(3, e.getMessage()) ,HttpStatus.NOT_FOUND) ;
			}
		} while (false);
		
		return entity ;
	}
	
}
