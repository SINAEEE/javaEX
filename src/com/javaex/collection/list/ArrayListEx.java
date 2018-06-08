package com.javaex.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
//		List<String> l = new ArrayList<String>();
		List<String> l = new LinkedList<>(); 
		//링크드리스트와 어레이리스트는 처리방법은 다르지만 사용방법은 같다
		
		//객체추가
		l.add("Java");
		l.add("C");
		l.add("C++");
		l.add("Python");
		System.out.println(l);
		
		//객체의 삽입
		l.add(2, "C#");
		System.out.println(l);
		
		//List는 중복을 허용
		l.add("Java");
		System.out.println(l);
		System.out.println("총 객체 수 : " + l.size());
		
		System.out.println();
		//객체의 삭제
		l.remove(2);
		System.out.println(l);
		l.remove("Python");
		System.out.println(l);
		
		//Iterator의 이용
		System.out.println();
		System.out.println("====Iterator====");
		Iterator<String> it = l.iterator();
		while(it.hasNext()) {
			String item = it.next();
			System.out.println(item);
		}
		
		
		//비워봅시다.
		l.clear();
		System.out.println(l);
		
	}

}
