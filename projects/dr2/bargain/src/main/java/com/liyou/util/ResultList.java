package com.liyou.util;

import java.util.List;


public class ResultList<T> {

	private final List<T> list ;
	
	private final Integer totalCount ;
	
	private ResultList( int count, List<T> list ){
		this.list = list ;
		this.totalCount = count ;
	}
	
	public static <T> ResultList<T> success(int count, List<T> list){
		return new ResultList<T>(count, list) ;
	}

	public List<T> getList() {
		return list;
	}

	public Integer getTotalCount() {
		return totalCount;
	}
	
}
