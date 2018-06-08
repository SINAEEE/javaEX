package com.javaex.conditional;

public class MiniLotto {

	public static void main(String[] args) {
		
		//for문 버전
		for (int i=0; i<6; i++) {
			System.out.print((int)(Math.random()*45)+1); //0.0이상  1.0미만 값
			System.out.println("");
		}
		
		System.out.println();
		
		// while 버전
		int index = 0;
		while (index < 6) {
			System.out.print((int)(Math.random()*45)+1);
			System.out.println("");
			index++;
		}
		System.out.println();
	
	}

}
