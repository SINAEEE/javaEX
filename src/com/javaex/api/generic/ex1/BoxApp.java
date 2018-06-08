package com.javaex.api.generic.ex1;

public class BoxApp {

	public static void main(String[] args) {
		
		//Box 하나 만들고 int 값을 설정
		Box intBox = new Box();
		intBox.setContent(123);
		
		//값을 꺼내와 봅시다
		//int retVal = intBox.getContent(); //캐스팅 안하면 오류 : 오브젝트 타입을 실제 사용할 타입으로 변환 필수
		int retVal = (int)intBox.getContent();
		System.out.println(retVal);
		
		Box strBox = new Box();
		strBox.setContent("JAVA");
		
		String strVal = (String)strBox.getContent();
		System.out.println(strVal);
		
		//대부분의 케이스는 알수없는 데이터가 넘어오는 경우가 많다, 내부데이터가 아닌
		//만약 캐스팅을 잘못했다면?
		strVal = (String)intBox.getContent(); // 실행오류남 : ClassCastExeption오류
		
		
	}

}
