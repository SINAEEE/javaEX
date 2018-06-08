package com.javaex.collection.hash;

import java.util.HashSet;

class SimpleNum{
	int num;
	
	public SimpleNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return String.valueOf(num);
	}

	
	//HashCode, equals 오버라이딩

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof SimpleNum) {
			SimpleNum other = (SimpleNum)obj;
			return num == other.num;
		}
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
//		return num;
//		return super.hashCode();
//		return num % 2;
		return num % 10;
}
	
	
}


public class HashSetEx2 {
	public static void main(String[] args) {
		HashSet<SimpleNum> hs = new HashSet<>();
		
		SimpleNum s1 = new SimpleNum(10); //new로 선언된 순간, object값의 해쉬코드를 따라 각 해쉬코드값이 달라짐
		SimpleNum s2 = new SimpleNum(20);
		SimpleNum s3 = new SimpleNum(20);
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println(hs); //10,20,20,(중복허용안함에도불구하고)
		//-> SimpleNum객체 두개를 다른 객체로 판단했기 때문에 , hashcode 확인해보자
		System.out.println(s2.equals(s3));
		//1.해쉬코드값비교 2. equal로 비교
		
	}

}
