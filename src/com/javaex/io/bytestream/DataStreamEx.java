package com.javaex.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {

	static String dirName = "D:\\javastudy\\files\\files\\";
	static String filename = dirName + "primitives.txt";
	//static String filename = dirName + "primitives.dat";
	
	public static void main(String[] args){
		
			//스트림을 열어봅시다.
			try {
				OutputStream fos = new FileOutputStream(filename);
				DataOutputStream dos = new DataOutputStream(fos); 
				//fos객체가 가리키고 있는파일에 내용쓰기
				
				dos.writeUTF("홍길동");
				dos.writeBoolean(true);
				dos.writeInt(25);
				dos.writeFloat(80.9f);
				
				dos.writeUTF("김신애");
				dos.writeBoolean(false);
				dos.writeInt(25);
				dos.writeFloat(99.9f);
				
				dos.close();
				
				InputStream fis = new FileInputStream(filename);
				DataInputStream dis = new DataInputStream (fis);
				
				for(int i=0; i<2; i++) {
					//주의 : 출력한 순서에 맞게 읽어와야함
					String s = dis.readUTF();
					boolean b = dis.readBoolean();
					int val = dis.readInt();
					float f = dis.readFloat();
					
					System.out.printf("%s:%s:%d:%f\n",s,b,val,f);
				}
				dis.close();
				
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
		
	
	
	}

}
