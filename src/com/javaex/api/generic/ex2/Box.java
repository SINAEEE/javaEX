package com.javaex.api.generic.ex2;

//모든 객체를 담을 수 있는 Box 하나 설계 : Generic 이용
//내부에서 사용할 아직 명시되지 않은 타입 <T>
public class Box <T> {
	
	//Object content;
	T content;
	
//	public Object getContent() {  //값출력
	public T getContent() {  //값출력
		return content;
	}
	
	//public void setContent(Object content) { //값설정
	public void setContent(T content) {
		this.content = content;
	}

}
