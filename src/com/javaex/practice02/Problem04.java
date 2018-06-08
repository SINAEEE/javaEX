package com.javaex.practice02;

public class Problem04 {
	
	public static void main(String[] args) {
		
		int[] a = new int[6];
		
		for(int i=0; i<6; i++) {
			a[i] = (int)(Math.random()*45)+1;
			System.out.printf("%d\n",a[i]);
			
		}
		
		/*
		for(int i=0; i<a.length; i++) {
			a[i] = i+1;
			System.out.println(a[i]);
		}
		*/
		
		
		
	}
	

}
