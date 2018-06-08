package com.javaex.api.objectclass.ex01;

public class LangClassTest {

	public static void main(String[] args) {
		
		Point p = new Point(10,10);
		Point p2 = new Point(10,10);
		
		System.out.println(p==p2); //다른메모리 공간을 점유하고 있기 때문에
		System.out.println(p.equals(p2)); 
		//java가 포인트를 보고 어떻게 해야할지 어떻게 비교하는지 알려줘야함
		
		String s1 = new String("Java");
		String s2 = new String("Java");
		
		System.out.println("");
		System.out.println(s1==s2);
		System.out.println(s1.endsWith(s2));
		

	}
	

}
