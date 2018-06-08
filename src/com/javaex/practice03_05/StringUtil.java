package com.javaex.practice03_05;

import java.util.Scanner;

public class StringUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s1 = new String[3]; 
		s1[0] = "Superman";
		s1[1] = "Batman";
		s1[2] = "Spiderman";
		
		for(int i=0; i<s1.length; i++) {
			s1[3] += s1[i];
			System.out.print(s1[i]);
		}
		
		
		

	}

}
