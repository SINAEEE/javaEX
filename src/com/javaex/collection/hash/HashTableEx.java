package com.javaex.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

class ClassRoom {
	// 필드
	private String subject;
	private String roomName;
	
	// 생성자
	public ClassRoom(String subject) {
		this.subject = subject;
	}
	
	public ClassRoom(String subject, String roomName) {
		this(subject);
		this.roomName = roomName;
	
	}

	@Override
	public int hashCode() {
		return subject.hashCode();
//		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ClassRoom) {
			return obj.hashCode() == this.hashCode();
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		String output = "Class(subject = " + subject
				+ ", room=" + roomName + ")";
		return output;
	}
	
	
}


public class HashTableEx {
	public static void main(String[] args) {
		
		Map<String,ClassRoom> map = new Hashtable<>();
		
		//맵에 데이터 넣기
		map.put("101", new ClassRoom("Java","R101"));
		map.put("201", new ClassRoom("C", "R201"));
		map.put("301", new ClassRoom("Python", "R301"));
		map.put("401", new ClassRoom("Linux", "R401"));
		
		System.out.println(map); //순서는 없음
		
		//맵에서 데이터를 가져와 봅시다. get()메서드
		System.out.println(map.get("301")); //301키 값을 가지고 map들어있는 데이터를 가져옴
		
		
		// 맵의 데이터를 변경해 봅시다.
		map.put("201", new ClassRoom("C#", "R201"));
		System.out.println(map.get("201"));
		System.out.println(map);
		
		
		//키가 있는지 확인
		System.out.println(map.containsKey("301"));
		System.out.println(map.containsKey("501"));
		
		
		//subject가 java인 ClassRoom을 받아와 보자
//		System.out.println(map.containsValue("Java"));//value값으로 문자열이 아닌 객체를 만들어서 넣었기때문에 걸리지 않음
		System.out.println(map.containsValue(new ClassRoom("Java"))); 
		// -> ClassRoom에서 1차로 hashcode 검사 (문자형의 해쉬코드 비교함)
		// -> 2차로 equal검사 : 통과됨 
		//내부에 있는 값을 통해 비교 후, 통과된 값 출력
		
		
		//Iterator
		System.out.println();
		System.out.println("====Iterator=====");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			ClassRoom room = map.get(it.next());
			System.out.println(room);
		}
		
		
		//맵을 비워봅시다.
		map.clear();
		System.out.println(map);
		
		
		
	}

}











