package com.javaex.quiz02;

public class Quiz02_5 {
	public static void main(String [] args) {
		
		int num1 = 13579;
		int num2 = 13579;
		
		boolean result1 = (++num1 + 1) == (num2++ + 1) ? true : false;
		System.out.println(result1);
		String result2 = (++num1 + 1) == (num2++ + 1) ? "같음" : "다름";
		System.out.println(result2);
	}

}
