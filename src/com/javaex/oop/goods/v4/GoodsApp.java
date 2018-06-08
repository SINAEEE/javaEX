package com.javaex.oop.goods.v4;

public class GoodsApp {

	public static void main(String[] args) {
		//Goods notebook = new Goods();
		//notebook.name = "Dell XPS";
		//notebook.price = 2000000;
		//notebook.setName("Dell XPS");
		//notebook.setPrice(2000000);
		Goods notebook = new Goods("Dell XPS", 2000000);
		
		//Goods camera = new Goods();
		//camera.name = "Nikon";
		//camera.price = 7000000;
		//camera.setName("Nikon");
		//camera.setPrice(700000);
		Goods camera = new Goods("Nikon", 700000);
		
		//System.out.printf("%s,%d원", 
			//	notebook.name, 
				//notebook.price);
		System.out.printf("%s,%d원", 
				notebook.getName(), 
				notebook.getPrice());
		
		notebook.showInfo();
		
	//	System.out.printf("%s, %d원", 
		//		camera.name, 
			//	camera.price); //멤버필드 접근시 .을 이용하여 접근
		
		System.out.printf("%s, %d원", 
				camera.getName(), 
				camera.getPrice()); //멤버필드 접근시 .을 이용하여 접근
			
		camera.showInfo();
		
		//camera.setPrice(10); //이럴땐 Goods클래스의 setter를 막아주어서 정보은닉 시도 할수있다.
		


	}

}
