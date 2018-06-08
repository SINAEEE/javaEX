package com.javaex.api.objectclass.ex03;

public class Point implements Cloneable
{
	private int x = 0;
	private int y = 0;
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString()
	{
		return "Point(" + x + ", " + y + ")";
	}

	@Override
	public boolean equals(Object obj) 
	//object클래스에 있는 equals 메서드를 오버라이딩하여 사용하는것
	//그래서 매개변수를 받을때 처음형이 Ojbect형이다. 
	//Object형매개변수를 사용할수 없으니, 매개변수를 Point형으로 다운캐스팅하여 사용해야한다.
	{
		if(obj instanceof Point)
		{
			Point other = (Point)obj;  //다운캐스팅
			return x == other.x && y == other.y;
			//현재 Point클래스의 x값과 y값이 넘어온 매개변수의 x,y값과 같으면 true
		}
		return super.equals(obj);
		
	}
	
	
	
	public Point getClone()
	{
		Point clone = null;
		
		try 
		{
			clone = (Point)clone(); //똑같은 클래스를 안에 객체까지 복사하는것
			//clone()을 이용하여 Point클래스를 객체까지 똑같이 복사하여 clone변수에 넣는것!
			//clone() : 기본적으로 메모리 복사
			//clone메서드 오버라이딩하여 내부의 참조객체까지 복제
			//clone()을 사용하려면, object클래스에 정의되어있는 protected Object clone()메서드를 
			//public으로 재정의하여 사용해야함
			//재정의하지않으면, 기본적으로 object의 clone()메서드를 호출은 하지만,다른 클래스에서 이를 사용할수없다.
			//protected형이기 때문
			
			
		} 
		catch (CloneNotSupportedException e) 
		{
			e.printStackTrace();
		}
		
		return clone;
	}
	
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	

}
