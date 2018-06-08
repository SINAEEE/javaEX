package com.javaex.quiz.quiz01;

public class Quiz01_3 {
	public static void main(String[] args) {
		
		System.out.println("1"+"3"); 
		//13 : 숫자아닌문자열끼리더하기
		
		System.out.println(true+"java"); //truejava
		//System.out.println(true);
		//java에서 true false는 그 자체로 저장이 가능한 데이터
		
		System.out.println('A'+'B'); //131
		// int형 값으로 변형되어 그 숫자의 합이 출력됨
		//문자는 작은따옴표에 묶어 저장, 실제는 유니코드값 저장
		
		System.out.println('1'+2); //51 : 1의코드값+숫자2
		
		System.out.println('J'+"ava"); //Java

		//System.out.println(false+null);
		//null값은 값이 없다라는 뜻 ->연산이 되지않음
		
	}

}
