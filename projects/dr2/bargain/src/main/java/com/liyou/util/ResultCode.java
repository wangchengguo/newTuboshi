package com.liyou.util;

import com.liyou.constonts.ErrorCode;

public class ResultCode {

	/**
	 * 内部详细错误码
	 */
	private int errCode ;
	
	/**
	 * 错误描述
	 */
	private String errDesc ;

	public ResultCode(){
		
	}
	
	public ResultCode( int errCode , String errDesc ){
		this.errCode = errCode ;
		this.errDesc = errDesc ;
	}
	
	public static ResultCode error( int errCode , String errDesc ){
		return new ResultCode(errCode, errDesc) ;
	}
	
	public static ResultCode errorParam(){
		return new ResultCode(ErrorCode.PARAM_ERR, "参数有误") ;
	}
	
	public int getErrCode() {
		return errCode;
	}

	public String getErrDesc() {
		return errDesc;
	}

}
