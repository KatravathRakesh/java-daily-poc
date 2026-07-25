package com.operators.assignment_operators;
//Assignment Operators (=, +=, -=, *=, /=, %=)

public class Problem {

	public static void main(String[] args) {
		
		int a = 10;
//		Add 10 using +=.
//		CE : Type mismatch: cannot convert from double to int
//		a = a + 5.5;
		
		a += 5.5;//Narrow--convert from double to int
		System.out.println("A value : "+a);//15
		
		//Subtract 5 using -=.
//		CE : Type mismatch: cannot convert from double to int
//		a = a - 5.5;
		
		a -= 5.5;//Narrow--convert from double to int
		System.out.println("A value : "+a);//9
		
		//Double a number using *=.
		a *= 10;
		System.out.println("A value : "+a);
		//Divide a number by 2 using /=.
		
		a /= 5;
		System.out.println("A value : "+a);
		//Find remainder using %=.
		a %= 10;
		System.out.println("A value : "+a);

	}

}
