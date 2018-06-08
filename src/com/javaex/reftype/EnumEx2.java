package com.javaex.reftype;

public class EnumEx2 {

	public static void main(String[] args) {
		Week today = Week.SATURDAY;
		String act;
		
		switch(today) {
		case SUNDAY:
			act = "휴식";
			break;
		case MONDAY:
		case THUESDAY:
		case WEDNESDAY:
		case THURSDAY:
			act = "공부";
			break;
		case FRIDAY:
			act = "불금";
			break;
		case SATURDAY:
			act = "주말";
			break;
		default:
			act = "아무날아님";
			break;	
			
		}
		System.out.println(act);

	}

}
