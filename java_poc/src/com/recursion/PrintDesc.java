package com.recursion;

import java.util.Scanner;

public class PrintDesc {

	public static void printDesc(int n) {
//		base case
		if(n == 1) {
			System.out.print(n);
			return;
		}
		
		System.out.print(n+" ");
		printDesc(n-1);
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many number want to print : ");
		int n = s.nextInt();
		
		printDesc(n);
		s.close();
	}

}
