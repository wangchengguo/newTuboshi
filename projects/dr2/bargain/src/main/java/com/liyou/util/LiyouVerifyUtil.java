package com.liyou.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * 礼友科技 - 验证工具类<br>
 * 生成数字验证码, 字母混合验证码<br>
 * 正则校验手机号码
 * @author 刘超
 * @date   2016-01-05
 */
public class LiyouVerifyUtil {

	/**
	 * 生成四位随机验证码 - 数字
	 * @return
	 */
	public static String getRandomNumCode( Integer length ){
		
		if( length == null ){
			length = 4 ;
		}
		
		String str = "0,1,2,3,4,5,6,7,8,9";  
        String str2[] = str.split(",");//将字符串以,分割  
        
        StringBuilder code = new StringBuilder() ;
        
        Integer arrLength = str2.length ;
        for ( int i = 0 ; i < length ; i++ ) {
        	code.append( str2[((int)Math.floor( Math.random() * arrLength ))] );
		}
        
        return code.toString() ;
	}
	
	/**
	 * 生成四位随机验证码 - 大写数字混合
	 * @return
	 */
	public static String getRandomCode( Integer length ){
		
		if( length == null ){
			length = 4 ;
		}
		
		String str = "0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";  
        String str2[] = str.split(",");//将字符串以,分割  
        
        StringBuilder code = new StringBuilder() ;
        
        Integer arrLength = str2.length ;
        for ( int i = 0 ; i < length ; i++ ) {
        	code.append( str2[((int)Math.floor( Math.random() * arrLength ))] );
		}
        
        return code.toString() ;
	}
	
	public static List<String> getStartEndDate() {
		SimpleDateFormat shortSdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance(Locale.CHINA);
		List<String> list = new ArrayList<String>();
		if (calendar.get(Calendar.DAY_OF_MONTH) <=15) {
			calendar.add(Calendar.MONTH,-2);
			int day=calendar.getActualMaximum(Calendar.DATE);
			calendar.set(Calendar.DAY_OF_MONTH,day);
			list.add(shortSdf.format(calendar.getTime()));
			calendar.add(Calendar.MONTH,-2);
			calendar.set(Calendar.DAY_OF_MONTH, 1);
			list.add(shortSdf.format(calendar.getTime()));
		} 
		else
		{
			calendar.add(Calendar.MONTH,-1);
			int day=calendar.getActualMaximum(Calendar.DATE);
			calendar.set(Calendar.DAY_OF_MONTH,day);
			list.add(shortSdf.format(calendar.getTime()));
			// int day=calendar.getActualMaximum(Calendar.DATE); 得到这个月的最大天
			//calendar.set(Calendar.DAY_OF_MONTH,day);
			calendar.add(Calendar.MONTH,-2);
			calendar.set(Calendar.DAY_OF_MONTH, 1);
			list.add(shortSdf.format(calendar.getTime()));
		}
		Collections.sort(list);
		return list;
	}
	
	public static String sumDate(int day)
	{
		SimpleDateFormat shortSdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance(Locale.CHINA);
		calendar.add(Calendar.DATE,-day);// 减天数
		return shortSdf.format(calendar.getTime());
	}
	
	public static List<String> getCurMonth() {
		SimpleDateFormat shortSdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance(Locale.CHINA);
		List<String> list = new ArrayList<String>();
		list.add(shortSdf.format(calendar.getTime()));
		calendar.add(Calendar.MONTH,-3);// 月数减二，即上月
		list.add(shortSdf.format(calendar.getTime()));
		Collections.sort(list);
		return list;
	}
	
	
	
	/** 
     * 手机号验证 
     *  
     * @param  mobile 
     * @return 验证通过返回true 
     */  
    public static boolean isMobile(String mobile) {   
        Pattern p = null;  
        Matcher m = null;  
        boolean b = false;   
        p = Pattern.compile("^[1][3,4,5,6,7,8][0-9]{9}$"); // 验证手机号  
        m = p.matcher(mobile);  
        b = m.matches();   
        return b;  
    }
    
    /**
     * 校验城市编码是否正确
     * @param cityId
     * @return
     */
    public static boolean checkCityId( Integer cityId ){
    	
    	boolean result = false ;
    	
    	switch (cityId) {
		case 604:
			result = true ;
			break;
		case 605:
			result = true ;
			break;
		case 606:
			result = true ;
			break;
		case 607:
			result = true ;
			break;
		case 626:
			result = true ;
			break;
		default:
			break;
		}
    	
    	return result ;
    }
    
    public static void main(String[] args) {
		System.out.println(getCurMonth());
	}
	
}
