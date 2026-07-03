package com.for_loop_poc;

import java.util.Scanner;

//Print numbers from N to 1.
public class ReverseCounting {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the nth number : ");
		int n = s.nextInt();
		
		for(int i=n;i>=1;i--) {
			System.out.print(i+" ");
		}

	}

}
