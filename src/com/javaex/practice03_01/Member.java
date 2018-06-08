package com.javaex.practice03_01;

public class Member {
	
	private String id;
	private String name;
	private int point;
	
	/*
	public Member(String id, String name, int point){
		this.id = id;
		this.name = name;
		this.point = point;
		
	}
	*/
	
	
	//ID
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	//이름
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	//POINT
	public  void setPoint(int point) {
		this.point = point;
	}
	
	public int getPoint() {
		return point;
	}
	
	
	
	
	
	
	
	
	
	
	
}
