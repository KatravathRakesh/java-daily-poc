package com.while_loop_poc;

import java.util.Scanner;

//Find the sum of digits.
public class SumOfDigitsWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = s.nextInt();
		int sum =0;
		int r = 0;
		int n1 = n;
		
		while(n>0) {
			r = n % 10;
			sum += r;
			n = n / 10;
		}
		System.out.println("Sum of digits "+n1+" : "+sum);

	}

}
