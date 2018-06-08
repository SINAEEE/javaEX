package com.javaex.oop.goods.v1;

public class GoodsApp {

	public static void main(String[] args) {
		Goods notebook = new Goods();
		notebook.name = "Dell XPS";
		notebook.price = 2000000;
		
		Goods camera = new Goods();
		camera.name = "Nikon";
		camera.price = 7000000;
		
		System.out.printf("%s,%d원", 
				notebook.name, 
				notebook.price);
		
		System.out.printf("%s, %d원", 
				camera.name, 
				camera.price); //멤버필드 접근시 .을 이용하여 접근

	}

}
