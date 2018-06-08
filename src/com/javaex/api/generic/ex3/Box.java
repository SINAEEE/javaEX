package com.javaex.api.generic.ex3;

//모든 객체를 담을 수 있는 Box 하나 설계 : Generic 이용
//템플릿이 여러개 넘어가는 경우도 가능
public class Box <K,V> {
	
	K key;
	V content;
	

	public K getkey() {
		return key;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public V getContent() {  //값출력
		return content;
	}
	
	//public void setContent(Object content) { //값설정
	public void setContent(V content) {
		this.content = content;
	}


}
