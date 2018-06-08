package com.javaex.api.wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		// 기본 : 만들기
		Integer i = new Integer(10);
		Character c = new Character('c');
		//jdk9에서 new wrapper는 deprecated
		//deptrecated : 폐지예정이라는뜻
		
		Float f = Float.valueOf(3.14159f);
		Boolean b = Boolean.valueOf(true);
		
		//문자열로 넣어도 됩니다. 문자열을 Interger형으로 넣어서 Boxing한다
		Integer i1 = Integer.valueOf("10");
		Double d1 = Double.valueOf("3.14159");
		Boolean b1 = Boolean.valueOf("false");
		// 주의 : 문자열의 형태가 해당 기본형의 형태를 갖춰야함
		
		//자동 박싱(Auto Boxing)
		Integer i2 = 10; // == Integer i2 = Integer.valueof(10); //두문장이 같은의미
		
		// parse 계열 메서드 : 문자열을 이용, 해당 타입으로 변환, 다른형태로 출력
		System.out.println(Integer.parseInt("-123")); //문자열 -> 정수로 변환
		System.out.println(Integer.parseInt("10",16)); //16진수 -> 문자열을 정수로 변환
		System.out.println(Integer.toBinaryString(28)); // 2진수 문자열로 변환
		System.out.println(Integer.toHexString(28)); //16진수 문자열로 변환
		
		//형변환
		System.out.println(i2.doubleValue()); //정수를 double형으로 변환
		System.out.println(i2.floatValue()); //float형으로 변환 (다른형의 wrapper 클래스로 변환하는것)
		System.out.println(i2.intValue());
		
		//포장된 값의 비교
		Integer i3 = Integer.valueOf(2018);
		Integer i4 = Integer.valueOf(2018);
		System.out.println(i3 == i4); //false : 객체화 되었기때문에 다른 주소를 갖고있으므로 값이 갖지 않다
		
		//언박싱 비교
		System.out.println(i3.intValue() == i4.intValue()); //true
		
		//언박싱 비교2
		System.out.println(i3.equals(i4)); // true : 주소가 아닌 값을 비교하기때문에
		
		
		


	}

}
