package com.javaex.io.bytestream;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayStreamEx {

	public static void main(String[] args) {
		
		//input source
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		//output target
		byte[] outSrc = null;
		
		//input source 확인
		System.out.println(Arrays.toString(inSrc));
		
		//input stream과 output stream을 열어보겠습니다.
		try {
			//input stream 열기
			InputStream bis = new ByteArrayInputStream(inSrc);
			OutputStream bos = new ByteArrayOutputStream();
			int data = 0; // input stream으로부터 넘어오는 데이터 저장
			
			while((data = bis.read()) != -1) { //더이상 읽어올 데이터가 없을때까지
				System.out.println("Read Data : " + data);
				bos.write(data);
			}
			
			outSrc = ((ByteArrayOutputStream)bos).toByteArray();
			System.out.println(Arrays.toString(outSrc));
			
			bos.close();
			bis.close();
		}catch(IOException e) {
			//IO 오류는 이곳에서 처리
		}catch(Exception e) {
			//위에서 처리되지 않은 많은 예외는 이곳에서 처리
		}
		
	}

	
}
