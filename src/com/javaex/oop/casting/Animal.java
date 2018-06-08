package com.javaex.oop.casting;

public class Animal {
	protected String name; //접근자 유의
	
	//생성자
	public Animal(String name) { //기본생성자는 없는상태
		this.name = name;
		
	}
	
	public void eat() {
		System.out.println(name + " is eating");
	}
	
	public void walk() {
		System.out.println(name + " is walking");
	}
	

}
