package com.strings;

public class StringBuilderInJava {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("Hello");//mutable
     
		System.out.println(s);
		s.append("Word");
		System.out.println(s);
		s.insert(5,", ");
		System.out.println(s);
		s.delete(5, 7);
		System.out.println(s);
	}

}
