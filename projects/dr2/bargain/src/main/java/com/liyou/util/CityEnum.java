package com.liyou.util;

/**
 * 城市枚举类
 * @author 刘超
 * @date   2016-03-02
 */
public enum CityEnum {

	MAIN(""){
		public String getBaseName(){
			return CityBaseName.getMain_baseName();
		}
	},
	
	SHANGHAI ("上海市"){
		public String getBaseName(){
			return CityBaseName.getShanghai_baseName();
		}
	}, 
	
	BEIJING ("北京市"){
		public String getBaseName(){
			return CityBaseName.getBeijing_baseName();
		}
	}, 
	
	GUANGZHOU ("广州市"){
		public String getBaseName(){
			return CityBaseName.getGuangzhou_baseName();
		}
	}, 
	
	SHENZHEN ("深圳市"){
		public String getBaseName(){
			return CityBaseName.getShenzhen_baseName();
		}
	} ,
	
	HANGZHOU ("杭州市"){
		public String getBaseName(){
			return CityBaseName.getHangzhou_baseName();
		}
	} ;
	
	private final String value;
	
	CityEnum( String value ) {
		this.value = value ;
	}
	
	public String getValue() {
        return value;
    }
	
	public abstract String getBaseName() ;
	
	//  手写的从int到enum的转换函数
	public static CityEnum valueOf( Integer value ) {    
        switch ( value ) {
	        case 604:
	            return BEIJING;
	            
	        case 605:
	            return SHANGHAI;
	            
	        case 606:
	            return GUANGZHOU;
	            
	        case 607:
	            return SHENZHEN;
	            
	        case 626:
	            return HANGZHOU;
	            
	        default:
	            return MAIN;
	            
        }
	}
	
}
