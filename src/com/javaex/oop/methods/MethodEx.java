package com.javaex.oop.methods;

public class MethodEx {

	public static void main(String[] args) {
		
		printMessage(); //매개변수, 리턴없는 메서드
		
		double squared = square(3.5);
		System.out.println(squared);
		
		System.out.printf("4+5 = ", + getSum(4,5));

		printDivide(4,0);
	}
	
	public static void printDivide(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("0으로 나눌 수 없어요");
			return; 
		}
		System.out.println(num1/num2);
	}

	//매개변수는 개수 제한이 없음
	public static double getSum(double num1, double num2) {
		return num1+num2;
	}

	//반환값이 없는 메소드
	public static void printMessage() {
		//static에서는 일반 인스턴스메소드를 호출할수없음
		//리턴값이 없을 경우 : void
		
		System.out.println("Message");
		
	}
	
	//리턴값과 매개변수가 있는 메소드
	public static double square(double num) {
		
		return num * num; //return값이 없으면 에러
	}

}
