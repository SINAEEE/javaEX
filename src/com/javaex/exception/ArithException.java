package com.javaex.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithException {
	public static void main(String[] args) {
		//스캐너로 정수 입력
		//100을 정수로 나눔
		
		double result =0;
		int num;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		
		// num = scanner.nextInt();
		// result = 100/num;
		
		try {
			num=scanner.nextInt();
			result = 100/num;
		}catch(InputMismatchException e){
			System.out.println("정수로 해주세요");
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없어요");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finally");
		}
		
		System.out.println(result);
		scanner.close();
	}
}