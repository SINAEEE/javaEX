package com.javaex.basic.console;

public class ConsoleOutputEx {

	public static void main(String[] args) {
		//System.out.print : 개행 X
		//Sustem.out.println : 개행 O
		//System.out.printf : 포맷 출력
		
		System.out.print("Hello ");
		System.out.println("Java");
		
		String str1 = "Hello";
		String str2 = "Java";
		
		System.out.println(str1 + " " + str2);

		//escape 문자
		System.out.println("Hello\nJava"); //강제 개행
		System.out.println("Hello\tJava"); // 탭문자
		System.out.println("Hello, \"java\""); //따옴표 출력
		System.out.println("\\ 역슬래시"); // 역슬래시 출력
		
		String dir = "D:\\javastudy\\eclipse";
	}

}
