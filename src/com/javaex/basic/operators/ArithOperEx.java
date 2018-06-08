package com.javaex.basic.operators;

public class ArithOperEx {
	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		
		//부호 연산자 : +, -
		System.out.println(-a);
		System.out.println(-1 * a);
		System.out.println("-----------");
		
		//사칙연산 
		a = 7;
		System.out.println(a + b); //덧셈
		System.out.println(a - b); //뺄셈
		System.out.println(a * b); //곱셈
		System.out.println(a / b); //나눗셈
		System.out.println(a % b); //나머지
		System.out.println("-----------");
		
		//정수와 정수의 나눗셈은 정수
		System.out.println((float)a / (float)b);
		System.out.println((float)a / b); //암묵적으로 float로 변환됨
		System.out.println("-----------");
		
		//증감연산자 ++, --
		//++와  a++를 혼동하지 말자
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);
		System.out.println("-----------");
		
		System.out.println(b);
		System.out.println(b++);
		System.out.println(b);
		System.out.println("-----------");
		
		//나눗셈 보충
		//System.out.println(4/0); //에러주의
		System.out.println(4.0 / 0);
		System.out.println(7 % 4);
		System.out.println(7.2 % 2.0);
		
		//Infinite의 체크
		System.out.println(Double.isInfinite(4.0 / 0));
		//NaN(not a number) //wrapper 객체
		System.out.println(Double.isNaN(4.0/0));
		
	}

}
