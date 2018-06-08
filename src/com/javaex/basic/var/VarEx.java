package com.javaex.basic.var;

public class VarEx {
	
	public static void main(String[] args) {
		// 변수 식별자 부여
		// 문자, 숫자, $, _
		// 숫자로 시작하면 안됨
		
		// 변수명 관례 (기본적으로 소문자, 단어+단어면 뒷단어 첫글자는 대문자)
		
		int myAge; //선언
		myAge = 47; // 초기화
		//int myAge = 47; //선언 할당 동시에
		
		// Type 선언된 변수는 다른 타입으로 사용 불가
		//myAge = "57"; //위에 이미 선언되었기때문에, 이렇게 하면 안됨
		
		System.out.println(myAge);
		
		//한번에 여러 변수 선언
		int v1 = 10, v2 = 20, v3 = 30;
		
		// 여러 변수에 동시에 같은 값을 할당할때
		v1 = v2 = v3 = 40;
		
	}

}
