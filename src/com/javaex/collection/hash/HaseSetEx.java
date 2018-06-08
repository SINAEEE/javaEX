package com.javaex.collection.hash;

import java.util.HashSet;

public class HaseSetEx {
	public static void main(String[] args) {
		
		//선언
		HashSet<String> hs = new HashSet<>();
		
		//객체 추가
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		hs.add("Java");
		
		System.out.println(hs); //set이기 때문에 순서가 중요X, 맞지도X, 중복된데이터는 한번만 기입됨
		System.out.println("hs size : " + hs.size());
		
		//지정한 객체를 포함하고 있는가? : contain()
		System.out.println(hs.contains("C++"));
		System.out.println(hs.contains("Linux"));
		
		//객체 삭제
		hs.remove("C++");
		System.out.println(hs);
		
		hs.remove("C++"); //없는것을 삭제해도 특별한 에러나지X
		
		
		
	}

}
