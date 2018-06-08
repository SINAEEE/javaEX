package com.javaex.oop.staticmember;

public class StaticEx { 
	
	public static int refCount; //클래스 변수
	//메모리영역에서 이변수를 공유할수있는가
	public static String classVar; //클래스 변수
	public String instanceVar; //인스턴스 변수
	
	//static block으로 클래스 변수 초기화
	static {
		refCount=0;
		classVar = "Static Member";
		System.out.println("Static Block");
		//instanceVar = "Instance Var"; 
		//-> 접근불가, 메모리 블록이 다름, static 영역에서는 static만 접근 가능
	}
	
	//생성자
	public StaticEx() {
		refCount++;
		System.out.println("refCount: " + refCount);
		System.out.println("Instance Created");
	}
	
	protected void finalize() throws Throwable {
		refCount--;
		super.finalize();
		System.out.println("Finalize Called");
	}
	

}
