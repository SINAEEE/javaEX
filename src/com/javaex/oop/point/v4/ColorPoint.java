package com.javaex.oop.point.v4;

public class ColorPoint extends Point{
	private String color;
	
	//생성자
	public ColorPoint() {
		super();
	}
	
	public ColorPoint(String color) {
		super();
		this.color = color;
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	
	//getter / setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override //지금만들어진 메소드는 오버라이드됬다고 컴파일러에게 알려줌
	public void draw() { //오버라이딩
		System.out.printf("색깔 점[color=%s,x=%d, y=%d]를 그렸습니다",
				color, getX(),getY());
		System.out.printf("색깔 점[color=%s,x=%d, y=%d]를 그렸습니다",
				color, x,y);
	}

}
