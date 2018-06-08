package com.javaex.practice03_06;

import java.util.Scanner;

public class FriendApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//String[] name = new String[] {};
		String[] name = new String[3];
		String[] number = new String[3];
		String[] school = new String[3];
		
		System.out.println("친구를 3명 등록해주세요  : ");
		//name[0] = sc.nextLine();
		//System.out.println(name[0]);
		
		for(int i=0; i<4; i++) {
			name[i] = sc.next();
			number[i] = sc.next();
			school[i] = sc.next();
			//System.out.println(name[i]+" "+number[i]+" "+ school[i]);
			
		}
		
		/*for (int i=0; i<4; i++) {
			System.out.println(name[i]+" "+number[i]+" "+ school[i]);
		}*/

	}

}
