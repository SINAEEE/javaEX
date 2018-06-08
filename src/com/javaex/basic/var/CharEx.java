package com.javaex.basic.var;

public class CharEx {
	
	public static void main(String[] args) {
		
		char ch1 = 'A'; //문자 선언
		char ch2 = '한';
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		System.out.println(ch1 + ch2); 
		//문자가 연결되어출력X, 해당 코드값합산하여 결과값 도출됨
		//내부적으로 int형으로 변환하여 수치 계산이 됨
		
		String str = "A한"; //문자열 변수 선언
		System.out.println(str);
		
		
	}

}
