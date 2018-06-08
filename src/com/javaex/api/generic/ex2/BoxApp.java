package com.javaex.api.generic.ex2;

public class BoxApp {

	public static void main(String[] args) {
		
		//Box 하나 만들고 int 값을 설정
		//Box intBox = new Box(); 
		Box<Integer> intBox = new Box<Integer>(); //Box의 타입을 지정해줌 (Box에서 명시되지않는타입<T>을)
		intBox.setContent(123);
//		intBox.setContent("Java"); 
		//-> 컴파일체크 : IntegerBox이기때문에 String형 못들어감 ->안정성에 큰역할
		
		//값을 꺼내와 봅시다
		int retVal = intBox.getContent(); //외부에서 Integer박스 사용한다고 지정해주었기때문에 캐스팅 불필요
		//int retVal = (int)intBox.getContent();
		System.out.println(retVal);
		
		Box<String> strBox = new Box<String>();
		strBox.setContent("JAVA");
		
		//String strVal = (String)strBox.getContent();
		String strVal = strBox.getContent();
		
		System.out.println(strVal);
		
		//만약 캐스팅을 잘못했다면?
//		strVal = (String)intBox.getContent(); // 실행오류남 : ClassCastExeption오류 -> 컴파일러가 잡아줌
		//-> 컴파일 타입에서 제거 : 안정성 확보
	
	}

}
