package com.javaex.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		//백터의 선언
		Vector<Integer> v = new Vector<>();
		System.out.println("Size : " + v.size() //0 : 받은게 없기때문
							+ ", Capacity : " + v.capacity()); 
		
		
		//1부터 10까지 값을 담아봅시다
		for(int i=1; i<=10; i++) {
			//값을 넣어봅시다.
			v.addElement(i);
			//-> 객체로 박싱한것 : v.addElement(Integer.valueOf(10));
		}
		
		//값을 넣은 후, vector값 측정
		System.out.println("Size : " + v.size() 
		+ ", Capacity : " + v.capacity()); 
		
		//허용량 초과
		v.addElement(11);
		System.out.println("Size : " + v.size() 
		+ ", Capacity : " + v.capacity()); 
		//-> 용량 자동증가
		
		//중간에 값을 넣어봅시다
		v.insertElementAt(5, 7); //5라는 값을 7번인덱스에 삽입
		System.out.println(v); //벡터클래스자체를 toString으로 구현해서 
		
		//객체 조회 : 특정 인덱스의 객체 반환
		int val = v.elementAt(5); //5번째 index값
		System.out.println(val);
		
		//객체의 인덱스를 조회해 봅시다
		System.out.println("indexOf(7))" + v.indexOf(7));
		//없는 객체의 인덱스
		System.out.println("indexOf(0))" + v.indexOf(0));
		
		//객체 포함 여부 반환
		System.out.println("Contains(10):" + v.contains(10));
		
		//객체 삭제
		v.removeElement(10);
		System.out.println(v);
		
		//내용을 하나씩 불러와서 출력
		for(int i=0; i<v.size(); i++) {
			Integer item = v.elementAt(i);
			System.out.println(item);
		}
		
		//TODO : 개선해봅시다!!
		
		//버퍼를 비워봅시다.!!
//		v.clear();
		System.out.println("v=" + v);
		System.out.println("Size : " + v.size() 
		+ ", Capacity : " + v.capacity());
		
		// Generic의 활용
		Vector<? super Number> v2 = new Vector<>(); 
		//super가 number인 무언가를 벡터클래스안쪽에 타입값으로주입
		v2.addElement(Integer.valueOf(10));
		v2.addElement(Float.valueOf(3.14159f));
//		v2.addElement(new String("Java")); //String은 Number를 상속하지 않았기때문에.
		System.out.println(v2);
		
		
		//Enumaration를 이용해서 항목을 차례대로 꺼낼 수 있다. //vector안쪽 항목을 하나씩 끄집어냄
		Enumeration<Integer> e = v.elements(); //vector의 항목을 가져다 쓰는것
		
		//어디가 끝인지 알수없기때문에, while
		System.out.println();
		System.out.println("===========Enumeration============");
		
		while(e.hasMoreElements()) { //enumeration이 요소를 더 가지고 있는지
			Integer item = e.nextElement(); //이 부분에서 실제 객체를 반환받음
			System.out.println(item);
		}
		
		
	}

}





