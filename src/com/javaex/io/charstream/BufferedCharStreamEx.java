package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStreamEx {

	static String dirName = "D:\\javastudy\\files\\files\\";
	static String source = dirName + "last-leaf.txt";
	static String target = dirName + "last-leaf-filtered.txt";
	
	public static void main(String[] args) {
		
		try {
			
			Reader fr = new FileReader(source);
			Writer fw = new FileWriter(target);
			
			//보조스트림을 열겠습니다.
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String line = "";
			while((line = br.readLine()) != null) {
				if(line.toLowerCase().contains("leaf") ||
						line.toLowerCase().contains("leaves")) {
					//leaf, leaves 들어있는 라인만 출력
					bw.write(line);
					bw.write("\r\n");
				}
			}
			
			br.close();
			bw.close();
			
			System.out.println("필터링완료");
			
		}catch(FileNotFoundException e) {
			
		}catch(IOException e) {
			
		}

		
	}

}
