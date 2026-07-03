package com.for_loop_poc;

import java.util.Scanner;

//Print the squares of numbers from 1 to N.
public class SquareNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		int sqr = 0;
		for(int i=1;i<=n;i++) {
			sqr = i*i;
		}
		System.out.println("Square -> "+n+ " = "+sqr);

	}

}
