package com.javaex.reftype;

public class EnumEx {

	public static void main(String[] args) {
		Week today = Week.THURSDAY; //enum키워드,변수명 키워드.속성
		
		System.out.printf("Today is %s(%d)%n",
				today.name(),
				today.ordinal());
		
		//문자열을 사용하여 열거 객체 반환
		Week obj = Week.valueOf("FRIDAY");
		System.out.println(obj.name() + " " + obj.ordinal());
		
	}

}