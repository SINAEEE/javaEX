package com.javaex.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamEx {
	
	static String dirName = "D:\\javastudy\\files\\files\\";
	static String source = dirName + "img.jpg";
	static String target = dirName + "img_copy.jpg";
	
public static void main(String[] args){		
	
		try {
		InputStream is = new FileInputStream (source);
		//InputStream은 실제 존재하는 경로를 받아옴
		OutputStream os = new FileOutputStream(target);
		
		int data = 0; //data는 우선 integer형으로 넘어옴
		
		
		while((data = is.read()) != -1){ //더이상 넘어올값이 없을떄 -1이 넘어옴
			os.write(data);
		}
		os.close();
		is.close();
		
		System.out.println("파일을 복사했습니다.");
		
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없어요");
		}catch(IOException e) {
			System.out.println("IOException");
		}

		
	}

}