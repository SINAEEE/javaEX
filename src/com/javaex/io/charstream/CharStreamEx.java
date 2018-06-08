package com.javaex.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {

	static String dirName = "D:\\javastudy\\files\\files\\";
	static String filename = dirName + "char.txt";
	
	public static void main(String[] args) {
		
		//파일 라이터를 열겠습니다.
		try {
			Writer fwriter = new FileWriter(filename);
			fwriter.write("Bit Compute\r\n");
			fwriter.write("Java Programming\r\n");
			fwriter.write("2018.05");
			fwriter.flush();
			fwriter.close();
			
			//File Reader 열겠습니다.
			Reader freader = new FileReader(filename);
			
			int data = 0;
			while((data = freader.read()) != 1) {
				System.out.println((char)data);
			}
			System.out.println();
			freader.close();
			
			
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을수 없습니다.");
		}catch(IOException e) {
			System.out.println("IOException");
		}

	}

}
