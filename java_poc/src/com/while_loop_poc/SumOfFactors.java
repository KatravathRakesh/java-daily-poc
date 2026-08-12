package com.while_loop_poc;

import java.util.Scanner;

public class SumOfFactors {

	static void factor(int n) {
		int sum = 0;
		System.out.print("Factor of "+n+" : ");
		int i=1;
		while(i<=n) {
			if(n%i == 0) {
				System.out.print(i+" ");
				sum += i;
			}
			i++;
		}
		
		System.out.println();
		System.out.println("Total Sum : " +sum );
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		
		factor(n);
		s.close();
	}

}
