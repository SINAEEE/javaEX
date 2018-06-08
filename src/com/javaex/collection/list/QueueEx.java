package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		//queue는 인터페이스라 실제로 객체화할수없기때문에 실질적으로 링크드리스트를 만들어서 링크드리스트 내부의 메소드 몇개를 사용하는것
		
		//데이터를 제공해봅시다.
		for(int i=0; i<10; i++) {
			queue.offer(i);
		}		
		System.out.println(queue); 
		

		System.out.println(queue.poll()); //제일먼저 입력된 값 인출
		System.out.println(queue);
		
		System.out.println(queue.peek()); //값을 참조는 하되, 삭제는 안함
		//top이 가리키는 데이터를 읽는 작업을 peek이라고 함 (top : 가장최근에입력된데이터)
		System.out.println(queue);
		
		//poll을 할때는 empty로 체크해주세요
		while(!queue.isEmpty()){ //queue가 empty가 아닌 경우
			System.out.println(queue.poll());
		}
	}

}
