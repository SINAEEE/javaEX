
package com.javaex.api.generic.ex3;

public class BoxApp {

	public static void main(String[] args) {
		
		//Box 하나 만들고 int 값을 설정
		//Box intBox = new Box(); 
		Box<String, Integer> intBox = new Box<>(); //Box의 타입을 지정해줌 (Box에서 명시되지않는타입<T>을)
		intBox.setKey("Integer");
		intBox.setContent(123);
//		intBox.setContent("Java"); 
		//-> 컴파일체크 : IntegerBox이기때문에 String형 못들어감 ->안정성에 큰역할
		
		//값을 꺼내와 봅시다
		int retVal = intBox.getContent(); //외부에서 Integer박스 사용한다고 지정해주었기때문에 캐스팅 불필요
		System.out.println(intBox.getkey());
		System.out.println(retVal);
		
		Box<String,String> strBox = new Box<>();
		strBox.setContent("String");
		strBox.setContent("JAVA");
		
		String strVal = (String)strBox.getContent();
		System.out.println(strBox.getkey());
		System.out.println(strVal);
		
	
	}

}
