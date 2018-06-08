package com.javaex.thread.ex04;

public class MainThread {

	public static void main(String[] args) {
		
		//시스템자원이 붐비지 않을때는 이전버전 코드와 별로 차이가 없다.(경쟁X)
		
		//쓰레드를 불러와 실행
//		Thread thread = new DigitThread();
		Thread thread = new Thread(new DigitThread());
		Thread thread2 = new Thread(new AlphabetThread());

		thread.setPriority(Thread.MAX_PRIORITY); //thread의 우선수위
		thread2.setPriority(Thread.MIN_PRIORITY);
		
		//쓰레드의 시작
		thread.start();
		thread2.start();
		
				
		//thread와 thread2를 메인 스레드의 흐름에 합류
		try {
			thread.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인쓰레드 종료");
		
	}

}
