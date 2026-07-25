package com.operators.arithmetic_operators;

//Swap two numbers using a third variable.

public class SwapTwoNum {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("--------Befor Swap--------");
		System.out.println("A Number : " + a);
		System.out.println("B Number : " + b);

		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("--------After Swap--------");
		System.out.println("A Number : "+a);
		System.out.println("B Number : "+b);

	}

}
