package com.javaex.exception;

public class NullPointerExceptionEx {

	public static void main(String[] args) {
		String str = new String("Hello");
		
		str = null; //null값으로
		
		try {
		System.out.println(str.toString()); //이 메소드 실행 불가
		}catch (NullPointerException e){
			System.out.println("null값입니다.\n");
		}

	}

}
