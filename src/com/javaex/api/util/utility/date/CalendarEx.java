package com.javaex.api.util.utility.date;

import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
		
		//캘린더 불러오기
		Calendar now = Calendar.getInstance();
		Calendar custom = Calendar.getInstance();
		custom.set(1972, 5, 24); //배열의 인덱스가 0부터 시작하는것처럼 월의값은 1월이 0이다.
		//유의할 점 : 월은 0부터 시작한다. 즉, 6월 24일 의미
		
		//캘린더에서 년월일을 받아와 보자
		int year = now.get(Calendar.YEAR); //년
		int month = now.get(Calendar.MONTH); //월
		int date = now.get(Calendar.DATE); //일
		
		//출력
		System.out.printf("오늘은 %d년 %d월 %d일 입니다\n", year,month,date);
		month = now.get(Calendar.MONTH) + 1; //월은 0부터 시작하기 때문
		System.out.printf("오늘은 %d년 %d월 %d일 입니다\n", year,month,date);
		
		//10년뒤로 날짜 여행
		Calendar future = Calendar.getInstance();
		future.add(Calendar.YEAR, 10); //현재 년도값에 10을 더함
		System.out.printf("future : %d년 %d월 %d일\n",
				future.get(Calendar.YEAR),
				future.get(Calendar.MONTH)+1,
				future.get(Calendar.DATE));
		
		//이 날은 무슨 요일일까
		int dow = future.get(Calendar.DAY_OF_WEEK);
		System.out.println(dow); //무슨요일인지 확인해봤더니 코드값 3번
		
		// 바로 위문장을 확인해보았더니 (가독성을 위해 enum이나 상수값을 사용하여 코드를 다루는것) 코드값 3번은 화요일
		String dowStr;
		
		switch(dow) {
		case Calendar.SUNDAY:
			dowStr = "일요일";
			break;
		case Calendar.MONDAY:
			dowStr = "월요일";
			break;
		case Calendar.TUESDAY: 
			dowStr = "화요일";
			break;
		case Calendar.WEDNESDAY:
			dowStr = "수요일";
			break;
		case Calendar.THURSDAY:
			dowStr = "목요일";
			break;
		case Calendar.FRIDAY:
			dowStr = "금요일";
			break;
		case Calendar.SATURDAY:
			dowStr = "토요일";
			break;
		default:
			dowStr = "?";
		}
		System.out.println(dowStr);
	}

}






