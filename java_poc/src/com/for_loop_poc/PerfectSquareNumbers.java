package com.for_loop_poc;

import java.util.Scanner;

//Print all perfect square numbers up to N.
public class PerfectSquareNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the nth number : ");
		int n = s.nextInt();
		System.out.print("Perfect square number : ");
		
		for(int i=1;i*i<=n;i++) {
			System.out.print(i*i+" ");
		}
		
	}

}
