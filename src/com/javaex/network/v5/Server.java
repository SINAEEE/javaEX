package com.javaex.network.v5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		//서버 소켓을 생성
		ServerSocket serverSocket = null;
		
		try {
			//바인드 
			serverSocket = new ServerSocket();
			InetSocketAddress local = new InetSocketAddress("127.0.0.1",10000);
			
			//지정해준 소켓어드레스를 사용하여 bind시도
			serverSocket.bind(local);
			
			//시작 메시지를 출력
			System.out.println("<서버시작>");
			System.out.println("[연결을 기다립니다.]");
			
			//연결을 기다려봅니다. : 대기 상태
			while(true) {
				Socket socket = serverSocket.accept();
				Thread thread = new ServerThread(socket);
				thread.start();
			}
			
		
			//후처리
//			System.out.println("===========");
//			System.out.println("<서버 종료>");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				serverSocket.close(); //이 부분도 예외처리가 필요하다.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
