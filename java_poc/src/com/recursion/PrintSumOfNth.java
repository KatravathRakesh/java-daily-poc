package com.recursion;

import java.util.Scanner;

public class PrintSumOfNth {

	static int sum(int n) {
		if(n == 1) {
			return 1;
		}
		
		return n + sum(n - 1);//Recursion mean calling method again;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many number want to sum : ");
		int n = s.nextInt();

		int sum = sum(n);
		System.out.println("Sum Of Nth Number : "+sum);
		s.close();

	}
}
