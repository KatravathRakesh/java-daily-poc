package com.pattern_poc;

import java.util.Scanner;

//print Square Pattern
//* * * * * *
//* * * * * *
//* * * * * *
//* * * * * *
public class SquarePattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number col want to print : ");
		int n = s.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
