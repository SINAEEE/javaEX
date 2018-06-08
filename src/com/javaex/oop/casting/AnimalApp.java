package com.javaex.oop.casting;

public class AnimalApp {
	
	public static void main(String[] args) {
		Animal dog1 = new Dog("Snoopy"); // upcasting
		//bark()도 가능해야함
		
		dog1.eat();
		dog1.walk();
		//dog1.bark(); //실행X,
		
		Dog dog2 = new Dog("Doo");
		dog2.eat();
		dog2.walk();
		dog2.bark();
		
		//Downcasting : 명시적으로 타임을 지정해야함
		((Dog)dog1).bark(); //dog1을 Animal->Dog르 다운캐스팅
		
		Animal pet = new Dog("Azi");
		pet.eat();
		pet.walk();
		
		pet = new Cat("Yaong");
		pet.eat();
		pet.walk();
		
		//실제로 pet이 dog인지 cat인지 판별해보아야함
		
		//pet.bark();//지금은 고양이니까 에러가남
		
		if(pet instanceof Dog) {
			((Dog)pet).bark(); //pet이 Dog인게 확인완료되었으면 실행가능
		}else if (pet instanceof Cat) {
			((Cat)pet).meow();
		}
	}

}
