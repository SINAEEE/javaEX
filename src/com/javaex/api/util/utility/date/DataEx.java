package com.javaex.api.util.utility.date;

import java.text.DateFormat;
import java.util.Date;

public class DataEx {
	public static void main(String[] args) {
		//날짜를 얻어옴
		Date now = new Date();
		String nowStr = now.toString();
		
		System.out.println(nowStr);
		System.out.println(now.toLocaleString()); //deprecated된 메소드
		
		//형식에 맞게 출력
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df); 
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df.format(now));
		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(df.format(now));
		df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(df.format(now));
		
		
	}

}
