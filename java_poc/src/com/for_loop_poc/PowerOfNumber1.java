package com.for_loop_poc;

import java.util.Scanner;

//Example:
//2³ = 2 × 2 × 2 = 8
public class PowerOfNumber1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Base : ");
		int base = s.nextInt();
		System.out.print("Enter the Power : ");
		int p = s.nextInt();
		int result = 1;
		System.out.print("Power of a Number : ");
		if(p == 0) {
			result = 1;
		}
		
		for(int i=1;i<=p;i++) {
			result *= base;
			System.out.print(result+" ");
		}
		System.out.println();
		System.out.print("Power of a Number : "+result);
		
		s.close();

	}

}
