package com.javaex.practice04_04;

public class SoundApp {
	
	public static void main(String[] args) {
		
		printSound(new Cat());
		printSound(new Dog());
		printSound(new Sparrow());
		printSound(new Duck());
		
	}
	
	public static void printSound(Soundable soundable) { 
		
		
		
		Soundable s1 = new Cat();
		s1.sound();
		
		Soundable s2 = new Dog();
		s2.sound();
		
		Soundable s3 = new Sparrow();
		s3.sound();
		
		Soundable s4 = new Duck();
		s4.sound();
		
		
	}

}