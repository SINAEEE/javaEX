package com.javaex.oop.goods.v3;

public class Goods {
//class Goods //->default 접근제한자로 만들어짐
	
	//필드 선언
	private String name; //-> 접근제한자 private로 바꿈
	private int price; //-> 해당 값을 참조하는 다른 클래스에서 오류발생함
	//-> 클래스를 정의할때 필드는 private로 하여 객체 내부의 정보를 보호하고(정보은닉)
	//-> 필드에 대한 setter와 getter를 두어 객체의 값을 변경하고 참조하는것이 좋다.
	
	//생성자
	//기본생성자
	public Goods() { //
		
	}
	
	//생성자2
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		
	}
	
	
	////외부 접근을 위한 getter, setter////
	
	//Getters : 외부에서 읽기
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	//Setters : 외부에서 쓰기
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
