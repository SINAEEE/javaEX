package com.javaex.basic.var;

public class constantEx {
	
	static final double PI = 3.14159;
	static final int SPEED_LIMIT = 110;
	
	public static void main(String[] args) {
	
		System.out.println(PI);
		System.out.println(SPEED_LIMIT);
		
		//상수 변경 시도
		//SPEED_LIMIT = 120; 
		//이미 앞에서 final로 선언되었기때문에 에러 -> final 변경불가
		
		
	}

}
