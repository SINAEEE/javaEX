package com.javaex.oop.casting;

public class Dog extends Animal{ //Animal을 상속받은 Dog 클래스
	
	public Dog(String name) {
		super(name);
	}
	
	public void  bark() {
		System.out.println(name + " : 멍멍!");
	}

}
