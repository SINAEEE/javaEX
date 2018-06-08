package com.javaex.practice03_03;

public class Print {
	
	//int ,boolean, double, string
	
	private int i;
	private boolean b;
	private double d;
	private String s;
	
	public Print() {
		
	}
	
	public Print(int i, boolean b, double d, String s) {
		this.i = i;
		this.b = b;
		this.d = d;
		this.s = s;
		
	}
	
	public void setPrint(int i, boolean b, double d, String s) {
		this.i = i;
		this.b = b;
		this.d = d;
		this.s = s;
		
	}
	
	public void Print() {
		System.out.printf("%d\n%b\n%f\n%s\n",i,b,d,s);
	}
	
	
	
	

	

}
