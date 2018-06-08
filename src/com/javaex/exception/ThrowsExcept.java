package com.javaex.exception;

import java.io.IOException;

public class ThrowsExcept { //강제예외처리 / runtime예외처리
	public void executeException() throws IOException {
		System.out.println("강제 예외 발생");
		throw new IOException("강제 예외");
		//IOException은 컴파일러가 꼭 체크해야하는 Exception
	}
	
	public void executeRuntimeException() {
		System.out.println("런타임 오류");
		throw new RuntimeException("RunTime Exception");
	}
	
	public double divide(int num1, int num2) {
		if(num2 == 0) {
			throw new ArithmeticException(); //바깥쪽에 처리를 위임하는것
			//System.out.println("0으로 나눌 수 없습니다.);
			//return 0; //값을 꼭 돌려줘야함**********
		}
		return num1 / num2;
	}
}
