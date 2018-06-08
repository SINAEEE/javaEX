package com.javaex.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamEx {
	
	static String dirName = "D:\\javastudy\\files\\files\\";
	static String source = dirName + "img.jpg";
	static String target = dirName + "img_buffered_copy.jpg";
	
	public static void main(String[] args) {
		
		//File 스트림을 열어봅시다.
		try {
			InputStream fis = new FileInputStream(source);
			OutputStream fos = new FileOutputStream(target);
			
			//전송효율향상을 위해 BufferedStream을 사용
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			//파일복사
			//int data=0;과 비교해보자
			byte[] data = new byte[1024]; 
			//매개값으로 주어진 바이트 배열의 길이만큼 바이트를 읽고 배열에 저장
			//실제 읽은 바이트 수가 배열의 길이보다 짧은 경우, 읽은 수 만큼 리턴
			//1024바이트씩 복사하는 것 -> 지정된 버퍼의 크기만큼 한꺼번에 많은 데이터를 가져온다.
			int size=0;
			
			while((size = bis.read(data)) != -1) {
				//입력스트립으로부터 1바이트를 읽고 4바이트 int 타입으로 리턴
				//더이상 입력스트림으로부터 바이트를 읽을 수 없다면 -1을 반환
				bos.write(data);
				System.out.println(size + "바이트 복사했습니다."); //현황확인
			}
			
			bis.close();
			bos.close();
			
			System.out.println("파일을 복사했습니다.");
			
		}catch(FileNotFoundException e) {
			
		}catch(IOException e){
			
	}
		

}
}