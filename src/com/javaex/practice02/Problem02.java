package com.javaex.practice02;

import java.util.Scanner;

public class Problem02 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int[] num = new int[5];
		int result = 0;
		
		for(int i=0; i<num.length; i++) {
			System.out.println("5개의 숫자를 입력하세요 : ");
			num[i] = s.nextInt();
			result = result + num[i];
		}
		
		System.out.printf("평균은 %d입니다\n",result/5);
		
		
	}

}
