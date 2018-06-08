package com.javaex.io.bytestream;

import java.io.File;
import java.io.IOException;

public class FileClassEx{
	
	static String dirName = "D:\\javastudy\\files\\files\\";
	
	public static void main(String[] args) {
		
		//파일객체
		File root = new File(dirName);
		
		//파일이 실제 존재하는지 확인
		System.out.println(dirName + " : " + root.exists());
		
		//파일의 정보를 출력
		printInfo(root);
		
		//디렉토리 안쪽의 파일을 만들어봅시다.
		File file = new File(dirName + "myfile.txt");
		//->메모리 상에 파일정보를 담은 객체를 생성한것, 실제 파일을 만들지 X
		if(!file.exists()) {
			try {
				file.createNewFile();
				//실제 파일을 만드는 구문
			}catch(IOException e) {//컴파일 대비 : IO에러가 날 가능성이 있기 때문에 try-catch문으로 작성
				System.out.println("파일을 만들지 못했습니다.");
			}
		}
		
		printInfo(root);
		
		file.delete();
		printInfo(root);
		
	}
	
	
	static void printInfo(File f) {
		System.out.println("=====================");
		
		//이 파일 객체가 디렉토리인지 확인해봅시다.
		if(f.isDirectory()) {
			System.out.println("Directory : " + f.getName());
			File[] files = f.listFiles();
			
			//파일 리스트 출력
			for(File file:files) {
				System.out.print(file.isDirectory() ? "d " : "f ");
				System.out.println(file.getName());
			}
		}else {//디렉토리가 아닙니다.
			System.out.println("File" + f.getName());
		}
		System.out.println("=======================");
	}
	
}