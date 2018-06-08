package com.javaex.exception;

import java.io.IOException;

public class ThrowExceptApp {

	public static void main(String[] args) {
		ThrowsExcept except = new ThrowsExcept();
		try {
		except.executeException();
		except.executeRuntimeException();
		} catch (RuntimeException e){
			System.out.println("Message : " + e.getMessage());
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
		System.out.println(except.divide(100, 0)); //안쪽에서 말고 이곳에서  Exception처리가능
		}catch(ArithmeticException e){ //안쪽에서 하면 안에서 무슨일이 벌어졌는지 모르기때문에
			System.out.println("0으로 나눌수없습니다!");
		}
	}

}
