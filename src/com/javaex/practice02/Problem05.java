package com.javaex.practice02;

public class Problem05 {
	public static void main(String[] args) {
		
		int scoreboard[][]= {
				{80,75,90,95,78},
				{92,88,89,92,70},
				{78,80,85,86,63},
				{83,84,89,87,75},
				{89,83,93,94,78}
		};
		
		int sum=0;
		int num=0;
		int avg=0;
		
		for(int i=0; i<scoreboard.length; i++) {
			for(int j=0; j<scoreboard.length; j++) {
				if(scoreboard[i][j] >= 85) {
					num = num + 1;
					sum = sum + scoreboard[i][j]; 
				}
			}
		}
		
		avg = sum/num;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		
	}

}
