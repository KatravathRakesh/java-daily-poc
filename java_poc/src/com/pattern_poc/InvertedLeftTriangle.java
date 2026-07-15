package com.pattern_poc;

import java.util.Scanner;
//Print Inverted Left Triangle
//* * * * *
//  * * * *
//    * * *
//      * *
//        *
public class InvertedLeftTriangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number col want to print : ");
		int n = s.nextInt();
		
		for(int i=1;i<=n;i++) {
			//for space
			for(int j=2;j<=i;j++) {
				System.out.print(" ");
			}
			
			// To print star
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
