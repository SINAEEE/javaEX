package com.javaex.reftype;

public class StringEx {

	public static void main(String[] args) {
		//문자형 선언
		String str; // 선언
		str = "Java"; // Literal
		String str2="Java"; // Literal
		String str3 = new String ("Java");
		
		// 세변수는 같은 값을 가지고 있음
		System.out.println(str == str2); 
		// -> true  
		System.out.println(str2 == str3);
		// -> false : 사실상 다른 주소 참조
		
		//값을 비교
		System.out.println(str.equals(str3));
		// -> 주소는 다르지만 값은 같음
		
		
		

	}

}
