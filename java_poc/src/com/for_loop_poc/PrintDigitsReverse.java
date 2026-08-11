package com.for_loop_poc;

import java.util.Scanner;

public class PrintDigitsReverse {

	static void printDigitsReverse(int n) {
		int r = 0;
		
		System.out.println("Printed Digits In Reverse Order : ");
		for(int i=n;i>0;i=i/10) {
			r = i%10;
			System.out.println(r);
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		
		printDigitsReverse(n);
		
		s.close();

	}

}
