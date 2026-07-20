package com.languagefundament.method;

import java.util.Scanner;

public class Calculator {

	public static int add(int a,int b) {
		return a+b;
	}
	
	public static long subtract(int a, int b) {
		return a-b;
	}
	public static float multiply(int a, int b) {
		return a*b;
	}
	
	public static double divide(int a, int b) {
		return a/b;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the a Value : ");
		int a = s.nextInt();
		System.out.print("Enter the b Value : ");
		int b = s.nextInt();
		
		System.out.println("Addition :"+add(a,b));
		System.out.println("Subtract :"+subtract(a,b));
		System.out.println("Multiply :"+multiply(a,b));
		System.out.println("Divide : "+divide(a,b));
		
	}

}
