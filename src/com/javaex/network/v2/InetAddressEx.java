package com.javaex.network.v2;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		
		try {
			//내 IP 주소 확인
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("IP ADdress : " + local.getHostAddress());
			
			//www.google.com 의 서버IP를 받아와 봅시다.
			String hostName = "www.naver.com";
			//InetAddress[] adrs = InetAddress.getAllByName("www.google.com");
			InetAddress[] adrs = InetAddress.getAllByName(hostName);
			for(InetAddress remote:adrs) {
//				System.out.println("www.google.com IP Address : " + 
				System.out.println(hostName + " IP Address : " + 
									remote.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		

	}

}
