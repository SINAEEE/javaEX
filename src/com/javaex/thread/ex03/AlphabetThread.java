package com.javaex.thread.ex03;

public class AlphabetThread implements Runnable { 

	@Override //thread클래스의 run()메소드 오버라이딩
	public void run() {	
		
		for(char ch ='A'; ch <='Z'; ch++) {
		System.out.println(ch);
		
		//출력 속도 지연
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
//		super.run();
	}
	
	

}
