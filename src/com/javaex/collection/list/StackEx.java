package com.javaex.collection.list;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		
		//스택 선언
		Stack<Integer> stack = new Stack<>();
		
		//값을 10개  push
		for(int i=0; i<10; i++) {
			stack.push(i);
		}
		
		System.out.println(stack);
		
		// pop을 해 봅시다. : 출력위치 확인한다
		System.out.println(stack.pop());
		System.out.println(stack);
		
		//peak도 해봅시다.
		System.out.println(stack.peek());
		System.out.println(stack);
		
		/*
		while(true) { //스택에서 pop을 계속하는 무한루프 : pop할 데이터가 더이상 없으면 error남
			System.out.println(stack.pop());
		}
		 */
		
		while(!stack.empty()) { //stack이 비어있지 않은동안만! pop하자
			System.out.println(stack.pop());
		}
		
	}

}





