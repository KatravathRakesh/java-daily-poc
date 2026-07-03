package com.for_loop_poc;

import java.util.Scanner;

//Print numbers from 1 to 100.
public class PrintOneToHundredFor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = s.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}

	}

}
