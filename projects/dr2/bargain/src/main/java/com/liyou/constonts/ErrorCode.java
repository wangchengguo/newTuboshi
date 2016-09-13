package com.liyou.constonts;

/**
 * 错误返回码 常量配置类
 * @author 刘超
 * @date   2016-03-10
 */
public class ErrorCode {

	/**
	 * 用户不存在
	 */
	public static final int NO_USER = 1 ;
	
	/**
	 * 用户密码错误
	 */
	public static final int PASSWORD_ERR = 2 ;
	
	/**
	 * 验证码错误
	 */
	public static final int VERIFICATION_CODE_ERR = 3 ;
	
	/**
	 * 无效的授权token
	 */
	public static final int INVALID_TOKEN = 4 ;
	
	/**
	 * token 授权超时
	 */
	public static final int TOKEN_OVERTIME = 5 ;
	
	/**
	 * 用户未登录
	 */
	public static final int NO_LOGIN = 6 ;
	
	/**
	 * 参数错误
	 */
	public static final int PARAM_ERR = 7 ;
	
	/**
	 * 第三方帐号已绑定用户( 该用户已绑定某个第三方帐号 )
	 */
	public static final int THIRDPARTY_BIND = 8 ;
	
	/**
	 * 绑定用户token出错, ( 无效的token )
	 */
	public static final int BIND_TOKEN_ERR = 9 ;
	
	public static final int STATUS = 500;
}
