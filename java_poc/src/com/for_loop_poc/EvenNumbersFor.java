package com.for_loop_poc;

import java.util.Scanner;

//Print even numbers from 1 to 100.
public class EvenNumbersFor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = s.nextInt();
		
		System.out.println("Even Number :");
		for(int i=1;i<=n;i++) {
			if(i%2 == 0) {
				System.out.print(i+" ");
			}
		}

	}

}
