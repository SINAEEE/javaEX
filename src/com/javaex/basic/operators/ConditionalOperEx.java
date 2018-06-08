package com.javaex.basic.operators;

public class ConditionalOperEx {
	public static void main(String[] args) {
		//3항 연산자 (Conditional Operator)
		
		int a, b;
		a= 10; 
		b=30;
		
		boolean result;
		
		result = (a % 2 == 0) ? true : false;
		System.out.println(a + "은 짝수 : " + result);
		
		String message;
		int score = 60;
		
		message = (score >= 80) ? "Good" : 
			(score < 50) ? "Fail" : "Pass";
		//3항연산자를 길게 사용하면 가독성이 떨어짐 if문같은 중첩문을 사용하자
		
		System.out.println("Score : " + score + ", result : " + message);
		
		
	}

}
