package com.javaex.quiz.quiz01;

public class Quiz01_4 {
	public static void main(String[] args) {
		
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
		byte b2 = (byte)i;
		char ch2 = (char)b; //unsigned,signed 주의
		short s = (short)ch; //signed,unsigned
		float f = l;
		int i2 = ch;

	}

}
