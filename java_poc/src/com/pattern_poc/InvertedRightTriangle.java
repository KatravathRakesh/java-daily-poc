package com.pattern_poc;

import java.util.Scanner;

//print Inverted Right Triangle
//* * * * *
//* * * *
//* * *
//* *
//*
public class InvertedRightTriangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number col want to print : ");
		int n = s.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
