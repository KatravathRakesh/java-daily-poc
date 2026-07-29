package com.operators.instanceof_operators;

public class Problem {

	public static void main(String[] args) {
		Integer a = 10;
		String name = "Rakesh";
		
		System.out.println(a instanceof Integer);
		System.out.println(a instanceof Number);
		System.out.println(a instanceof Object);
//		System.out.println(a instanceof  Double);//CE : Incompatible conditional operand types Integer and Double
//		System.out.println(a instanceof  int); //CE : Incompatible conditional operand types Integer and int
		
		System.out.println(name instanceof String);
		System.out.println(name instanceof Object);
		

	}

}
