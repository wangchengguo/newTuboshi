package com.liyou.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * 时间工具类
 * @author 刘超
 * @date   2015-10-9
 */
public class DateHelper {

	public static String effectiveNotifyDate = null ;
	
	/**
	 * 根据小时计算当前时间增加或者减少多少小时后的时间
	 * @param hours		增加或者减少的时间 (正数为增加, 负数为减少)
	 * @return			格式化后的时间
	 */
	public static String getHoursCalc( Integer hours ){
		//时间的格式 - 已数据库的为标准
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss") ;
		Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());//date 换成已经已知的当前date
        cal.add(Calendar.HOUR_OF_DAY, hours);
		return sdf.format(cal.getTime());
	}
	
	
	
	/**
	 * 获得当前年月减掉多少月后的月初值
	 * @param hours		增加或者减少的时间 (正数为增加, 负数为减少)
	 * @return			格式化后的时间
	 */
	public static String getMonthBegin( Integer month ){
		//时间的格式 - 已数据库的为标准
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM") ;
		Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());//date 换成已经已知的当前date
        cal.add(Calendar.MONTH, month);
		return sdf.format(cal.getTime()) + "-01";
	}
	
	/**
	 * 获得当前年月减掉多少月后的月初值
	 * @param hours		增加或者减少的时间 (正数为增加, 负数为减少)
	 * @return			格式化后的时间
	 */
	public static String getMonthEnd( Integer month ){
		//时间的格式 - 已数据库的为标准
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM") ;
		Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());//date 换成已经已知的当前date
        cal.add(Calendar.MONTH, month);
		return sdf.format(cal.getTime()) + "-31";
	}
	
	/**
	 * 获取 num 个月前的 日期( 含 年-月-日 ) 格式  yyyy-MM-dd
	 * @param num
	 * @return
	 */
	public static String getHistoryDate(Integer num) { 
		//时间的格式 - 已数据库的为标准
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd") ;
				
	    Calendar calendar = Calendar.getInstance(Locale.CHINA);
	    calendar.setTime(new Date());
	    
    	//月数减 num 月
    	calendar.add(Calendar.MONTH,-num);
	    return sdf.format(calendar.getTime());
	}
	
	/**
	 * 获取 num 个月前的 日期( 只含年-月 ) 格式  yyyy-MM
	 * @param num
	 * @return
	 */
	public static String getHistoryDate2(Integer num) { 
		//时间的格式 - 已数据库的为标准
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM") ;
				
	    Calendar calendar = Calendar.getInstance(Locale.CHINA);
	    calendar.setTime(new Date());
	    
    	//月数减 num 月
    	calendar.add(Calendar.MONTH,-num);
	    return sdf.format(calendar.getTime());
	}
	
	/**
	 * 获取 num 个月前的 年月map集合
	 * @param date
	 * @param num
	 * @return
	 */
	public static List<Map<String, Integer>> getHistoryYearMonthList(Date date,Integer num) { 
	    Calendar calendar = Calendar.getInstance(Locale.CHINA);
	    calendar.setTime(date);
	    List<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();
	     
	    for (int i = 1; i <= num; i++) {
	    	Map<String, Integer> map = new HashMap<String, Integer>() ;
	    	//月数减一，即上月
	    	calendar.add(Calendar.MONTH,-1);
	    	map.put("YEAR", calendar.get(Calendar.YEAR)) ;
    		map.put("MONTH", calendar.get(Calendar.MONTH)+1) ;
    		list.add(map);
		}
	    return list;
	}
	
	/**
	 * 获取 num 个月前的 年月
	 * @param date
	 * @param num
	 * @return
	 */
	public static Map<String, Integer> getHistoryYearMonth(Date date,Integer num) { 
	    Calendar calendar = Calendar.getInstance(Locale.CHINA);
	    calendar.setTime(date);
	    Map<String, Integer> map = new HashMap<String, Integer>();
	     
    	//月数减 num 月
    	calendar.add(Calendar.MONTH,-num);
    	map.put("YEAR", calendar.get(Calendar.YEAR)) ;
		map.put("MONTH", calendar.get(Calendar.MONTH)+1) ;
	    return map;
	}
	
	/**
	 * 如果当前时间 是 某月上半月 则返回上个月的日期<br>
	 * 如果当全时间 是 某月下半月 则返回当月的日期
	 * @return
	 */
	public static Map<String, Integer> getHalfYearMonth() {
		Calendar calendar = Calendar.getInstance(Locale.CHINA);
	    calendar.setTime(new Date());
	    Map<String, Integer> map = new HashMap<String, Integer>();
	    //上半月返回 上个月的日期. 
	    if( calendar.get(Calendar.DAY_OF_MONTH) < 15 ){
	    	calendar.add( Calendar.MONTH , -1 );
	    }
	    map.put("YEAR", calendar.get(Calendar.YEAR)) ;
		map.put("MONTH", calendar.get(Calendar.MONTH)+1) ;
		
	    return map ;
	}
	
	/**
	 * 判断现在是否是前半个月
	 * @return boolean
	 */
	public static boolean isBeforeHalfMonth(){
		boolean result = false ;
		Calendar calendar = Calendar.getInstance(Locale.CHINA);
	    calendar.setTime(new Date());
	    //上半月 则返回true
	    if( calendar.get(Calendar.DAY_OF_MONTH) <= 15 ){
	    	result = true ;
	    }
		return result ;
	}
	
	/**
	 * 判断现在是否是前半个月
	 * @return boolean
	 */
	public static boolean isBeforeSevenDate(){
		boolean result = false ;
		Calendar calendar = Calendar.getInstance(Locale.CHINA);
	    calendar.setTime(new Date());
	    //上半月 则返回true
	    if( calendar.get(Calendar.DAY_OF_MONTH) <= 7 ){
	    	result = true ;
	    }
		return result ;
	}
	
	/**
	 * 获取 num 个月前的时间
	 * @param date	当前时间
	 * @param num	
	 * @return
	 */
	public static String getAgoDate( Date date, Integer num ){
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM") ;
		
		Calendar calendar = Calendar.getInstance(Locale.CHINA);
	    calendar.setTime(date);
	    calendar.add(Calendar.MONTH,-num);
	    
	    return sdf.format(calendar.getTime()) ;
	}
	
	/**
	 * 比较两个日期相差多少个月份. 
	 * @param start
	 * @param end
	 * @return
	 */
	public static int getMonth(Date start, Date end) {
		if (start.after(end)) {
			Date t = start;
			start = end;
			end = t;
		}
		Calendar startCalendar = Calendar.getInstance();
		startCalendar.setTime(start);
		Calendar endCalendar = Calendar.getInstance();
		endCalendar.setTime(end);
		Calendar temp = Calendar.getInstance();
		temp.setTime(end);
		temp.add(Calendar.DATE, 1);

		int year = endCalendar.get(Calendar.YEAR)
				- startCalendar.get(Calendar.YEAR);
		int month = endCalendar.get(Calendar.MONTH)
				- startCalendar.get(Calendar.MONTH);

		if ((startCalendar.get(Calendar.DATE) == 1)
				&& (temp.get(Calendar.DATE) == 1)) {
			return year * 12 + month + 1;
		} else if ((startCalendar.get(Calendar.DATE) != 1)
				&& (temp.get(Calendar.DATE) == 1)) {
			return year * 12 + month;
		} else if ((startCalendar.get(Calendar.DATE) == 1)
				&& (temp.get(Calendar.DATE) != 1)) {
			return year * 12 + month;
		} else {
			return (year * 12 + month - 1) < 0 ? 0 : (year * 12 + month);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(getMonthBegin(3));
	}
}
