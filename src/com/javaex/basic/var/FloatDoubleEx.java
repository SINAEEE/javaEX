package com.javaex.basic.var;

public class FloatDoubleEx {
	
	public static void main(String[] args) {
		float floatVar = 3.14159f;
		double doubleVar = 3.14159;
		
		//정밀도 체크
		floatVar = 0.1234567890123456789f;
		doubleVar = 0.1234567890123456789;
		
		System.out.println("float : " + floatVar); //결과값이 반올림됨
		System.out.println("double : " + doubleVar);
		
		//e 사용한 표현
		int intVar = 3000000;
		doubleVar = 3E6;
		floatVar = 3E6f;
		
		System.out.println("");
		System.out.println("int : " + intVar);
		System.out.println("double : " + doubleVar);
		System.out.println("float : " + floatVar);
		
		//부동소수점 계산 유의점
		System.out.println("");
		System.out.println(0.1 * 3); 
		
	}

}
