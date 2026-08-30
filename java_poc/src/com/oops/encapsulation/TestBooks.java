package com.oops.encapsulation;

public class TestBooks {

	public static void main(String[] args) {
		Books b = new Books();
		

		
		b.setBookid(101);
		b.setTitle("Java Programing.");
		b.setAuthor("James Gosling.");
		b.setPrice(550.0);
		
		
		System.out.println("Book Id : "+b.getBookid());
		System.out.println("Book Title : "+b.getTitle());
		System.out.println("Book Author : "+b.getAuthor());
		System.out.println("Book Price : "+b.getPrice());
		System.out.println("----------------------------------");
		
		b.setBookid(102);
		b.setTitle("Clean Code.");
		b.setAuthor("Robert Martin.");
		b.setPrice(650.0);
		
		System.out.println("Book Id : "+b.getBookid());
		System.out.println("Book Title : "+b.getTitle());
		System.out.println("Book Author : "+b.getAuthor());
		System.out.println("Book Price : "+b.getPrice());

	}

}
