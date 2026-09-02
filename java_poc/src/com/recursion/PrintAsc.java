package com.recursion;

import java.util.Scanner;

public class PrintAsc {

	public static void printAsc(int n) {
//		base case 
		if(n ==1) {
			System.out.print(n+" ");
			return;
		}
		
		printAsc(n-1);
		System.out.print(n+" ");
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many number want to print : ");
		int n = s.nextInt();
		
		printAsc(n);
		
		s.close();

	}

}
