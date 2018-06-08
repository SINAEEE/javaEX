package com.javaex.reftype;

public class StringFormatEx {

	public static void main(String[] args) {
		
		// %s, %d, %n 
		String fruit = "Apple";
		int total = 10;
		int eat = 3;
		
		System.out.println(total + "개의 " + fruit + "중에 " + eat
				+ "개를 먹었다"); // -> format
		System.out.printf("%d개의 %s중에 %s개를 먹었다\n", total, fruit, eat
				);
		System.out.println("");
		
		// %f
		float pi = 3.14159f;
		System.out.println("파이값은 : " + pi);
		System.out.printf("파이값은 : %f \n", pi);
		System.out.printf("파이값은 : %.3f ", pi); //.3 : 소수점 뒤 세자리까지
		
		// 포맷 형식은 String에서도 사용 가능
		//String str = String.format("%d개의 %s중에 %s개를 먹었다\.%n",total,fruit,eat);
		//System.out.println(str);

	}

}
