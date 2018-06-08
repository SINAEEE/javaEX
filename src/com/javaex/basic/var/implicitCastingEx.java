package com.javaex.basic.var;

//묵시적 형변환 예제
public class implicitCastingEx {
	
	public static void main (String[] args) {
		
		byte b=25; //1바이트 정수형
		System.out.println(b);
		
		short s=b; //2바이트 정수형
		System.out.println(s);
		
		int i=s; //4바이트 정수형
		System.out.println(i);
		
		float f=i; 
		System.out.println(f);
		
		double d=f;
		System.out.println(d);

		//->이전 형보다 큰 변수타입형으로 변환이 이루어지기 때문에 자동으로 형변환 이루어짐 
		
		//char ch='A'; //unsigned이고
		//short s2 = ch; //signed 이기때문에 에러발생
		
		
	}

}
