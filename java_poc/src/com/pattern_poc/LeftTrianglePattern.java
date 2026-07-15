package com.pattern_poc;

import java.util.Scanner;

//print Left Triangle Pattern
//        *
//      * *
//    * * *
//  * * * *
//* * * * *
public class LeftTrianglePattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number col want to print : ");
		int n = s.nextInt();
		
		for(int i=1;i<=n;i++) {
			//for space
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			
			//for print star
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
