package com.lumen.objbasics;

public class BookMain {

	public static void main(String[] args) {
		Book book=new Book();
		book.title="data science";
		book.author="ravi";
		book.price=100;
		book.showbook();
		int amount=(int) book.getDiscountedPrice(50);
		System.out.println(amount);
		

	}

}
