package com.while_loop_poc;

import java.util.Scanner;

//Find the product of the digits of a number.
public class ProductOfDigitsWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		int prod = 1;
		int r =0;
		
		while(n>0) {
			r = n%10;
//			if(r != 0) { // if don't want '0' as product then it condition
//				prod *= r;
//			}
			prod *= r;
		
			n = n/10;
		}
		
		System.out.println("Largest digit in a given number : "+prod);

	}

}
