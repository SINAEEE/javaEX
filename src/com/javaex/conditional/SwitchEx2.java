package com.javaex.conditional;

public class SwitchEx2 {
	public static void main(String[] args) {
		char grade = 'E';
		String message;
		
		switch (grade) {
		case 'A':
			message = "Excelent";
			break;
		case 'B':
			message = "Good";
			break;
		case 'C':
			message = "So so";
			break;
		case 'D':
			message = "Pass";
			break;
		case 'E':
			message = "Failed";
			break;
		default:
			message = "올바른값을 입력해주세요.";
			
				
		}
		
		System.out.println(message);
		
	}

}
