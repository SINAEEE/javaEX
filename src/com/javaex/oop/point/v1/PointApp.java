package com.javaex.oop.point.v1;

public class PointApp {
	public static void main(String[] args) {
		
		Point p1=new Point();
		p1.setX(5);
		p1.setY(5);;
		p1.draw();
		
		Point p2=new Point();
		p2.setX(10);
		p2.setY(23);;
		p2.draw();
		
		
		
		Point x = new Point();
		x.setX(5);
		
		Point y = new Point();
		y.setY(5);
		
		
		Point x2 = new Point();
		x2.setX(10);
		
		Point y2 = new Point();
		y2.setY(23);
		
		//System.out.printf("점[x=%d, y=%d]를 그렸습니다.\n", x.getX(),y.getY());
		//System.out.printf("점[x=%d, y=%d]를 그렸습니다.", x2.getX(),y2.getY());
		
		
	}

}
