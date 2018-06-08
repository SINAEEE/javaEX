package com.javaex.oop.casting;

public class Cat extends Animal{
	//->class name "Cat"에 왜 애러가 날까 (클래스가 빈공간일떄)
	//->Animal에 생성자가 있기때문 
	//->java 컴파일러가 현재 super();를 하고 있어서 에러가 나는것임
	
	public Cat(String name) { //생성자
		super(name);
	}
	
	public void meow() {
		System.out.println(name + ":야옹");
	}

}
