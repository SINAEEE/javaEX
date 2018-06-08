package com.javaex.api.objectclass_prac;

public class Rectangle {
	
	private int width;
	private int height;
	
	public Rectangle(int x, int y) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width*height;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle other = (Rectangle)obj;
			return getArea() == other.width * other.height;
		}
		return super.equals(obj);
	}
	
	

}
