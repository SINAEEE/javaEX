package com.javaex.practice04_02;

public class SmartPhone extends MusicPhone{

	public void execute(String str) {
		
		if("앱".equals(str)) {
			playApp();
		}else {
			super.execute(str);
		}
	}
	
	protected void playApp() {
		System.out.println("앱실행");
	}

}