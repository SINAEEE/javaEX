package com.javaex.practice04_01;

public class Depart extends Employee{
	
	private String department;
	
	Depart(String n, int s, String d){
		super.setName(n);
		super.setSalary(s);
		this.department = d;
	}
	
	Employee e = new Employee();
	
	String e1 = e.getName();
	int e2 = e.getSalary();
	
	public void getInformation() {
		super.getInformation();
		System.out.println("부서 : "+ department);
		
	}
	
}
	
