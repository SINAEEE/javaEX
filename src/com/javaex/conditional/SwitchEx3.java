package com.javaex.conditional;

public class SwitchEx3 {

	public static void main(String[] args) {
		//후에 이 코드를 enum 으로 다시 생성 예정
		String day = "FRIDAY";
		String act;
		
		switch (day) {
		case "SUNDAY":
			act = "휴식";
			break;
		case "MONDAY":
		case "TUESDAY":
		case "WEDNESDAY":
		case "THURSDAY":
			act = "공부";	
			break;
		case "FRIDAY":
			act = "불금";
			break;
		default:
			act = "할이없오";
			break;
				
		}
		
		System.out.println(act);

	}

}
