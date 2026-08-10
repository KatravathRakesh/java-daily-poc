package com.for_loop_poc;

import java.util.Scanner;

public class Print1to100AndSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter how many number want to print : ");
		int n = s.nextInt();
		
		int sum = 0;
		
		System.out.println("Even Number between 1 to 100 :");
		for(int i=1;i<=100;i++) {
			if(i%2 == 0) {
				System.out.print(i+" ");
			}
			sum +=i;
		}
		System.out.println();
		System.out.println("Sum of Number B/W 1 to 100 : "+sum);

	}

}
