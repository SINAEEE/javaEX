package com.javaex.basic.operators;

public class BitOperEx {
	public static void main(String[] args) {
		// 비트 연산 
		// 하드웨어 제어, 이미지 프로세싱
		// 미세한 단위 데이터 제어에 사용
		
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		int result = b1 & b2; //비트 연산 자체가 정수형으로 변환하여 실행
		// -> bit and 연산
		System.out.println(Integer.toBinaryString(result)); //2진수로 확인해보자
		//toBinaryString : 2진수로 출력가능
		
		result = b1 | b2;
		System.out.println(Integer.toBinaryString(result));
		
		result = b1 ^ b2; // exclusive or 연산 (XOR)
		System.out.println(Integer.toBinaryString(result));
		
		result = ~b1; //bit not 연산
		System.out.println(Integer.toBinaryString(result));
		
		
		
	}

}