package com.javaex.basic.console;

import java.util.Scanner;
public class ConsoleInputEx {
	public static void main(String[] args) {
		
		//java.util.Scanner scanner;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = scanner.nextInt();
		//System.out.print("이름 : ");
		String name = scanner.next();
	
		System.out.println("Welcom, " + name);
		System.out.println("age : " + age);

		scanner.close();
		
	}

}
