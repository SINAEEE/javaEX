package com.javaex.oop.staticmember;

public class Singleton { //동일한데이터 동일한 메소드 호출및출력
	
	private static Singleton instance = new Singleton();
	
	private Singleton(){
		//new 호출 불가
	}
	
	public static Singleton getInstance() {
		return instance;
	}
	

}
