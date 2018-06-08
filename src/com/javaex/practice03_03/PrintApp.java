package com.javaex.practice03_03;

public class PrintApp {
	
	public static void main(String[] args) {
		
		Print p = new Print();
		//boolean a = (5<6);
		
		boolean a = (5<6);
		p.setPrint(10, a, 5.7, "홍길동");
		
		p.Print();
			
		
		
	}

}
