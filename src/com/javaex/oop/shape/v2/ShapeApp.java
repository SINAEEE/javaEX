package com.javaex.oop.shape.v2;

public class ShapeApp {
	public static void main(String[] args) {
		//Shape s = new Shape(); //에러발생
		
		Rectangle r= new Rectangle(10,20,100,50);
		r.draw();
		
		Circle c = new Circle(10,10,30);
		c.draw();
		
		Point p = new Point(100,100);
		p.draw();
		
		Drawable obj = r; 
		
		if(obj instanceof Drawable) {
			obj.draw();
		}
		
		printObject(obj);
		
		
	}
	
	public static void printObject(Drawable obj) {
		//Drawable ojb 매개변수는 인터페이스 Drawable을 상속받으니
		obj.draw(); //obj.draw()는 실행가능하다
	}

	
}
