package com.javaex.basic.var;

public class intLongEx {
	public static void main(String[] args) {
		
		//int 변수 선언
		int intVar1;
		int intVar2;
		
		intVar1 = 2018;
		//intVar2 = 1234567890123; //out of range
		
		System.out.println(intVar1);
		
		//long 변수 선언
		long longVar1;
		long longVar2;
		
		longVar1 = 2018;
		longVar2 = 1234567890123l;
		
		System.out.println(longVar1);
		System.out.println(longVar2);
		
		//2진수 0b, 8진수 0, 16진수 0x
		int bin;  
		int oct;
		int hex;
		
		bin = 0b1100;
		oct = 072;
		hex = 0xFF;
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		
		
	}

}
