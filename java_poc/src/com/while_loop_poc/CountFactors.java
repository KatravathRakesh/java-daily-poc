package com.while_loop_poc;

import java.util.Scanner;

//Example:
//
//12 → 1, 2, 3, 4, 6, 12
//
//Total factors = 6

public class CountFactors {

	static void factor(int n) {
		int count = 1;
		System.out.print("Factor of "+n+" : ");
		int i=1;
		while(i<=n/2) {
			if(n%i == 0) {
				System.out.print(i+" ");
				count++;
			}
			i++;
		}
		System.out.print(n);
		
		System.out.println();
		System.out.println("Total Count : " +count );
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		
		factor(n);
		s.close();
	}

}
