package com.for_loop_poc;

import java.util.Scanner;

public class PrintEachDigit {
	
	static void printEachDigit(int n) {
		int rev =0;
		int r =0;
		for(int i=n;i>0;i=i/10) {
			r = i%10;
			rev = rev*10+r;
		}
		System.out.println("Printed Each Digit : ");
		for(int i=rev;i>0;i=i/10) {
			r=i%10;
			System.out.println(r);
		}
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		
		printEachDigit(n);
		
		s.close();

	}

}
