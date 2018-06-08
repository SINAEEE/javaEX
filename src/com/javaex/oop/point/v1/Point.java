package com.javaex.oop.point.v1;

public class Point {
	
	//v1.
	//필드
	
	private int x; //필드는 private로 하여 객체 내부의 정보를 보호(정보은닉)
	private int y;
	
	//getter : 외부에서 읽기
	public int getX(){
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	//settrs : 외부에서 쓰기
	public void setX(int x) {
		this.x = x; //this. 자기자신의 속성
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.printf("점[x=%d y=%d]를 그렸습니다.\n",x,y);
	}
	
}