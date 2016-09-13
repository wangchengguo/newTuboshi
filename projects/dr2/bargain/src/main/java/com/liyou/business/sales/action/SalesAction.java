package com.liyou.business.sales.action;





import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.liyou.business.sales.pojo.param.HousePercentage;
import com.liyou.business.sales.pojo.param.HousePriceDetailParam;
import com.liyou.business.sales.pojo.param.SalesParam;
import com.liyou.business.sales.service.ISalesService;
import com.liyou.commons.pojo.OResultVO;
import com.liyou.constonts.ErrorCode;
import com.liyou.util.ResultCode;

@RestController
public class SalesAction {
	
	@Autowired
	private ISalesService salesService;
	
	Logger logger = Logger.getLogger(SalesAction.class);
	
	/**
	 * 按房型的总价查询房屋的近三个月销售情况
	 * @param queryPriceType
	 * @param salesParam
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/bargain/history/samerooms/{queryPriceType}" ,method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> getHouseRooms(@PathVariable("queryPriceType") String queryPriceType,@ModelAttribute("salesParam") SalesParam salesParam, 
			HttpServletRequest request, HttpServletResponse response){
		
		ResultCode code = null ;
		
		String sales =null ;
		
		// 校验前端参数
		do{
			if(salesParam == null){
				code = ResultCode.errorParam() ;
				break ;
			}
			salesParam.setComparetype(1);
			try {
				if(queryPriceType.equals("totalprice"))
				{
					sales= salesService.getSales(salesParam);
					if(sales.equals("0"))
					{
						code =ResultCode.error(ErrorCode.PARAM_ERR,"没有找到指定的房型");
					}
				}
				else if(queryPriceType.equals("sinprice"))
				{
					sales= salesService.getSinPriceSales(salesParam);
					if(sales.equals("0"))
					{
						code =ResultCode.error(ErrorCode.PARAM_ERR,"没有找到指定的房型");
					}
				}
			} catch (Exception e) {
				e.printStackTrace() ;
				code = ResultCode.error(ErrorCode.PARAM_ERR, e.getMessage()) ;
			}
		}while(false) ;
		
		if( code == null ){
			return new ResponseEntity<>(sales,HttpStatus.OK);
		}else{
			return new ResponseEntity<>( code, HttpStatus.NOT_FOUND);
		}
	}
	
	/**
	 * 按楼栋查询房屋的近三个月销售情况
	 * @param queryPriceType
	 * @param salesParam
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/bargain/history/samebuilding/{queryPriceType}" ,method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> getHousebuilding(@PathVariable("queryPriceType") String queryPriceType,@ModelAttribute("salesParam") SalesParam salesParam, 
			HttpServletRequest request, HttpServletResponse response){
		
		ResultCode code = null ;
		
		String sales =null ;
		
		// 校验前端参数
		do{
			if(salesParam == null){
				code = ResultCode.errorParam() ;
				break ;
			}
			salesParam.setComparetype(2);
			try {
				if(queryPriceType.equals("totalprice"))
				{
					sales= salesService.getSales(salesParam);
					if(sales.equals("0"))
					{
						code =ResultCode.error(ErrorCode.PARAM_ERR,"没有找到指定的房型");
					}
				}
				else if(queryPriceType.equals("sinprice"))
				{
					sales= salesService.getSinPriceSales(salesParam);
					if(sales.equals("0"))
					{
						code =ResultCode.error(ErrorCode.PARAM_ERR,"没有找到指定的房型");
					}
				}
			} catch (Exception e) {
				e.printStackTrace() ;
				code = ResultCode.error(ErrorCode.PARAM_ERR, e.getMessage()) ;
			}
		}while(false) ;
		
		if( code == null ){
			return new ResponseEntity<>(sales,HttpStatus.OK);
		}else{
			return new ResponseEntity<>( code, HttpStatus.NOT_FOUND);
		}
	}
	/**
	 * 获取小区的报价明细信息。
	 * @param houseId
	 * @param houParam
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/bargain/quoted/{houseId}/detail" ,method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> getPriceDetail(@PathVariable("houseId") Integer houseId,@ModelAttribute("houParam") HousePriceDetailParam houParam, 
			HttpServletRequest request, HttpServletResponse response){
		
		ResultCode code = null ;
		
		String sales =null ;
		houParam.setHouseId(houseId);
		// 校验前端参数
		do{
			if(houParam.getHouseId()== null||houParam.getCityId()==null){
				code = ResultCode.errorParam() ;
				break ;
			}
			try {
					sales= salesService.getPriceDetail(houParam);
					if(sales.equals("0"))
					{
						code =ResultCode.error(ErrorCode.PARAM_ERR,"没有找到指定的房型");
					}
			} catch (Exception e) {
				e.printStackTrace() ;
				code = ResultCode.error(ErrorCode.PARAM_ERR, e.getMessage()) ;
			}
		}while(false) ;
		
		if( code == null ){
			return new ResponseEntity<>(sales,HttpStatus.OK);
		}else{
			return new ResponseEntity<>( code, HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value = " /bargain/history/house/{queryPriceType}" ,method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> getHouseSales(@PathVariable("queryPriceType") String queryPriceType,@ModelAttribute("salesParam") SalesParam salesParam, 
			HttpServletRequest request, HttpServletResponse response){
		
		ResultCode code = null ;
		
		String sales =null ;
		Logger logger =Logger.getLogger(SalesAction.class);
		// 校验前端参数
		do{
			if(salesParam == null){
				logger.info("参数错误");
				code = ResultCode.errorParam();
				break ;
			}
			salesParam.setComparetype(0);
			try {
				if(queryPriceType.equals("totalprice"))
				{
					logger.info(queryPriceType);
					sales=salesService.getSales(salesParam);
					logger.info("总价结果集"+sales);
					if(sales.equals("0"))
					{
						code =ResultCode.error(ErrorCode.PARAM_ERR,"没有找到指定的房型");
					}
					
				}
				else if(queryPriceType.equals("sinprice"))
				{
					logger.info(queryPriceType);
					sales=salesService.getSinPriceSales(salesParam);
					logger.info("单价结果集"+sales);
					if(sales.equals("0"))
					{
						code =ResultCode.error(ErrorCode.PARAM_ERR,"没有找到指定的房型");
					}
				}
			} catch (Exception e) {
				logger.info("代码错误");
				e.printStackTrace();
				code = ResultCode.error(ErrorCode.PARAM_ERR, e.getMessage()) ;
			}
		}while(false) ;
		
		if( code == null ){
			logger.info("成功"+sales);
			return new ResponseEntity<>(sales,HttpStatus.OK);
		}else{
			logger.info("失败"+sales);
			return new ResponseEntity<>(code,HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value = " /bargain/history/housemost/{queryPriceType}" ,method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> getHouseSalesMost(@PathVariable("queryPriceType") String queryPriceType,@ModelAttribute("salesParam") SalesParam salesParam, 
			HttpServletRequest request, HttpServletResponse response){
		
		ResultCode code = null ;
		
		String sales =null ;
		Logger logger =Logger.getLogger(SalesAction.class);
		// 校验前端参数
		do{
			if(salesParam == null){
				logger.info("参数错误");
				code = ResultCode.errorParam();
				break ;
			}
			salesParam.setComparetype(0);
			try {
				if(queryPriceType.equals("totalprice"))
				{
					logger.info(queryPriceType);
					sales=salesService.getSalesMost(salesParam);
					if(sales.equals("0"))
					{
						code =ResultCode.error(ErrorCode.PARAM_ERR,"没有找到指定的房型");
					}
					
				}
				else if(queryPriceType.equals("sinprice"))
				{
					logger.info(queryPriceType);
					sales=salesService.getSinPriceSales(salesParam);
					if(sales.equals("0"))
					{
						code =ResultCode.error(ErrorCode.PARAM_ERR,"没有找到指定的房型");
					}
				}
			} catch (Exception e) {
				logger.info("代码错误");
				e.printStackTrace();
				code = ResultCode.error(ErrorCode.PARAM_ERR, e.getMessage()) ;
			}
		}while(false) ;
		
		if( code == null ){
			logger.info("成功"+sales);
			return new ResponseEntity<>(sales,HttpStatus.OK);
		}else{
			logger.info("失败"+sales);
			return new ResponseEntity<>(code,HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value = "/bargain/history/sales/rooms/percentage" ,method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> getHouseSalesPercentage(@ModelAttribute("housePercentage") HousePercentage housePercentage, 
			HttpServletRequest request, HttpServletResponse response){
		
		ResultCode code = null ;
		
		String sales =null ;
		Logger logger =Logger.getLogger(SalesAction.class);
		// 校验前端参数
		do{
			if(housePercentage.getCityId()== null||housePercentage.getHouseId()==null){
				logger.info("参数错误");
				code = ResultCode.errorParam();
				break ;
			}
			try {
				sales=salesService.getPercentage(housePercentage);
			} catch (Exception e) {
				logger.info("代码错误");
				e.printStackTrace();
				code = ResultCode.error(ErrorCode.PARAM_ERR, e.getMessage()) ;
			}
		}while(false) ;
		
		if( code == null ){
			logger.info("成功"+sales);
			return new ResponseEntity<>(sales,HttpStatus.OK);
		}else{
			logger.info("失败"+sales);
			return new ResponseEntity<>(code,HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value = "/bargain/history/sales/rooms/periodinfo" ,method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> getHouseSalesPeriodinfo(@ModelAttribute("housePercentage") HousePercentage housePercentage, 
			HttpServletRequest request, HttpServletResponse response){
		try {
			OResultVO resultvo = salesService.getPeriodinfo(housePercentage);
			if(resultvo.getSuccess()){
				return new ResponseEntity<>(resultvo.getContext(), HttpStatus.OK);
			}else{
				if(resultvo.getReCode()==404){
					return new ResponseEntity<>(ResultCode.error(resultvo.getReCode(), resultvo.getContext().toString()), HttpStatus.NOT_FOUND);
				}else{
					return new ResponseEntity<>(ResultCode.error(resultvo.getReCode(), resultvo.getContext().toString()), HttpStatus.NOT_ACCEPTABLE);
				}
			}
		} catch (Exception e) {
			logger.error("action方法：getHouseSalesPeriodinfo ",e);
			//e.printStackTrace();
			return new ResponseEntity<>(ResultCode.error(500, e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/bargain/history/sales/hottest/{type}" ,method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> getHousePlateSchool(@PathVariable("type") String type,@RequestParam(value="cityId") Integer cityId,@RequestParam(required = false,value="needCount") Integer needCount,
			HttpServletRequest request, HttpServletResponse response){
		
		ResponseEntity<?> responseEntity = null;
		
		String sales =null ;
		
		// 校验前端参数
		do{
			if(type==null||cityId==null){
				responseEntity = new ResponseEntity<>( ResultCode.errorParam(), HttpStatus.NOT_ACCEPTABLE);
				break ;
			}
			
			try {
				sales=salesService.getHotHousePlateSchool(cityId, type,needCount);
				if(sales.equals("0"))
				{
					responseEntity = new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
					break ;
				}
				responseEntity = new ResponseEntity<>(sales,HttpStatus.OK);
			} catch (Exception e) {
				e.printStackTrace() ;
				responseEntity = new ResponseEntity<>(ErrorCode.STATUS,HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}while(false) ;
		return responseEntity;
		
	}

	
	@RequestMapping(value = "/bargain/history/sales/most/house" ,method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> getHouseSalecountByMonth(@RequestParam(value="cityId", required=true) Integer cityId,
			@RequestParam(value="isFirst", required=true) Integer isFirst,
			@RequestParam(value="needCount", required=false) Integer needCount,
			HttpServletRequest request, HttpServletResponse response){
			OResultVO resultvo = salesService.getHouseSalecountByMonth(cityId, isFirst, needCount);
			if(resultvo.getSuccess()){
				return new ResponseEntity<>(resultvo.getContext(), HttpStatus.OK);
			}else{
				return new ResponseEntity<>(ResultCode.error(500, "服务器错误"), HttpStatus.INTERNAL_SERVER_ERROR);
			}
	}
	
	@RequestMapping(value = "/bargain/history/sales/most/school" ,method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> getSchoolSalecountByMonth(@RequestParam(value="cityId", required=true) Integer cityId,
			@RequestParam(value="needCount", required=false) Integer needCount,
			HttpServletRequest request, HttpServletResponse response){
			OResultVO resultvo = salesService.getSchoolSalecountByMonth(cityId, needCount);
			if(resultvo.getSuccess()){
				return new ResponseEntity<>(resultvo.getContext(), HttpStatus.OK);
			}else{
				return new ResponseEntity<>(ResultCode.error(500, "服务器错误"), HttpStatus.INTERNAL_SERVER_ERROR);
			}
	}
	
	@RequestMapping(value = "/bargain/{bargain_id}" ,method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> getBargainDetailed(@PathVariable("bargain_id") Long bargain_id,@RequestParam(value="cityId",required=true) Integer cityId,@RequestParam(value="source",required=true) Integer source,
			HttpServletRequest request, HttpServletResponse response){
		
		ResponseEntity<?> responseEntity = null;
		
		String sales =null ;
		
		// 校验前端参数
		do{
			if(bargain_id==null||cityId==null||source==null){
				responseEntity = new ResponseEntity<>( ResultCode.errorParam(), HttpStatus.NOT_ACCEPTABLE);
				break ;
			}
			
			try {
				sales=salesService.getTransactionHistory(cityId,bargain_id,source);
				if(sales.equals("0"))
				{
					responseEntity = new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
					break ;
				}
				responseEntity = new ResponseEntity<>(sales,HttpStatus.OK);
			} catch (Exception e) {
				e.printStackTrace() ;
				responseEntity = new ResponseEntity<>(ErrorCode.STATUS,HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}while(false) ;
		return responseEntity;
		
	}

}
