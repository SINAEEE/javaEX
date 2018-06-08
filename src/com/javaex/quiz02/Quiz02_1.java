package com.javaex.quiz02;

public class Quiz02_1 {
	public static void main(String[] args) {
		int a = 3;
		int b = 6;
		int c = 'A';
		
		//boolean r2, r3, r1;
		
		// (1) A는 짝수입니까??
		//r2 = (a % 2 == 0 ) ? true : false;
		//System.out.println("a는 짝수 입니까? " + r2);
		System.out.println(a % 2 == 0);
		System.out.println("____________________________");
		
		// (2) B는 3의 배수 입니까??  
		//r3 = (b % 3 == 0 ) ? true : false;
		//System.out.println("b는 3의 배수 입니까? " + r3);
		System.out.println(b % 3 == 0);
		
		System.out.println("____________________________");
		
		//r1 = r2 && r3;
		//System.out.println(r1);
		boolean r1;
	    r1=(a%2 == 0) && (b%3 == 0) ? true : false;
	    System.out.println(r1);

		System.out.println("____________________________");
		
		int r2 = c+4;
		System.out.println(r2); 
		// char형으로 형변환하지 않았을때 int형으로 변환되어 출력
		
		int c2 = 'A';
		char r3 = (char)(c2+4);
		System.out.println(r3);
		//char로 형변환
		
		
	}

}
