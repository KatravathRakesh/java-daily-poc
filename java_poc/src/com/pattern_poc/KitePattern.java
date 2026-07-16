package com.pattern_poc;

import java.util.Scanner;

//print Kite Pattern
//   *
//  ***
// *****
//*******
// *****
//  ***
//   *
public class KitePattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number col want to print : ");
		int n = s.nextInt();
		
		for(int i=1;i<=n;i++) {
			//print space 
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			
			//print Star
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// *****
	    //  ***
	    //   *
		for(int i=1;i<=n-1;i++) {
			//print space
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			
			//print star 2*(n-i)-1
			for(int j=1;j<=2*(n-i)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
