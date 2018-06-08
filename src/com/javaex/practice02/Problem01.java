package com.javaex.practice02;

public class Problem01 {
	public static void main (String[] args) {
	
		int[] data = {1,3,5,7,9,11,15,19,18,20,30,33,31};
		
		int num1=0;
		int num2=0;
		
		for(int i=0; i<data.length; i++) {
			//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 13
			//at com.javaex.practice02.Problem01.main(Problem01.java:12)
			if(data[i]%3 == 0) {
				num1 = num1 + 1;
				num2 = num2 + data[i];
			}
	
		}
		
		System.out.printf("3의 배수의 갯수 : %d\n",num1);
		System.out.printf("3의 배수의의 합 : %d",num2);
		
}
		
		
		
		/*
		int[] data = {1,2,3,6,7,9};
		
		
		int num = 0;
		for(int i=0; i<data.length; i++) {
			if(data[i]%3 == 0) {
			num = num + 1;
			}
		}
		
		System.out.printf("%d",num);
		*/		
		
}


