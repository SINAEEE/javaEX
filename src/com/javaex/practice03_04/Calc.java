package com.javaex.practice03_04;

public class Calc {
	
	public static int kr_chge = 1079;

	//long won = 1000000;
	//long dol = 100;
	
	int won = 0;
	int dol = 0;

	//double wtd = 0;
	//double dtw = 0;
	
	static int chge = 1079;
	
	public void setPrice (int won, int dol) {
		this.won = won;
		this.dol = dol;
	}
	
	
	public void PrintCalc() {
		System.out.printf("%d원은 -> %d달러입니다.\n",won,won/chge);
		System.out.printf("%d달러는 -> %d원입니다.\n",dol,dol*chge);
		
	}
	
	

	
	

}
