package com.javaex.conditional;

public class breakEx {

	public static void main(String[] args) {

		int num=1;
		
		while(true) {
			if(num % 6 == 0 && num % 4 == 0)
			break;
		num++;
			
		}

	     System.out.println(num);	
	}

}
