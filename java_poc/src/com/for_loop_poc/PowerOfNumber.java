package com.for_loop_poc;

import java.util.Scanner;

//Find the power of a number using a loop.
public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Base : ");
		int base = s.nextInt();
		System.out.print("Enter the Power : ");
		int power = s.nextInt();
		int result = 1;
		System.out.print("Power of a number : ");
		if(power == 0) {
			result = 1;
		}
		for(int i=1;i<=power;i++) {
			result *= base ;
			System.out.print(result+" ");
		}
		System.out.println();
		System.out.print("Power of number : "+result);

	}

}
