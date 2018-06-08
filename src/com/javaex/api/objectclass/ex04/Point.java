package com.javaex.api.objectclass.ex04;

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
	{
		if(obj instanceof Point)
		{
			Point other = (Point)obj;
			return x == other.x && y == other.y;
		}
		return super.equals(obj);
	}
	
	public Point getClone()
	{
		Point clone = null;
		
		try 
		{
			clone = (Point)clone();
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
