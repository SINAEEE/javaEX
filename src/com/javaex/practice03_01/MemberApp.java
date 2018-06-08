package com.javaex.practice03_01;

public class MemberApp {
	
	public static void main(String[] args) {
	
		Member m1 = new Member();
		
		m1.setId("mem1");
		m1.setName("김신애");
		m1.setPoint(80);
		
		System.out.printf("ID : %s, Name : %s, Point : %d\n",
				m1.getId(),m1.getName(),m1.getPoint());
	}

}
