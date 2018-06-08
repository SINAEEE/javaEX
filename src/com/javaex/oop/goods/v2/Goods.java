package com.javaex.oop.goods.v2;

public class Goods {
//class Goods //->default 접근제한자로 만들어짐
	
	//필드 선언
	private String name; //-> 접근제한자 private로 바꿈
	private int price; //-> 해당 값을 참조하는 다른 클래스에서 오류발생함
	
	
	////외부 접근을 위한 getter, setter////
	
	//Getters
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	//Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("상풍명 : " + name);
		System.out.println("가격 : " + price);
	}
	
}
