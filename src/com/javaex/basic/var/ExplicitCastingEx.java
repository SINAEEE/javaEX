package com.javaex.basic.var;

//명시적 형 변환 예제 (강제타입형변환)
public class ExplicitCastingEx {
	public static void main(String[] args){
		
		byte b;
		int i = 2018;
		float f = 123.456f;
		
		b = (byte)i; //int형 변수값을 byte형 변수에 대입했을때
		System.out.println("int 2018 -> byte : " + b);
		
		//i = f; //표현범위가 i가 더 넓기 때문
		i = (int)f; // float형 변수값을 int형변수에 대입했을때
		System.out.println("float 123.456f -> int : " + i);
		

	}

}
