package com.pattern_poc;

import java.util.Scanner;

//print Full Pyramid
//    *
//   ***
//  *****
// *******
//*********
public class FullPyramid {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number col want to print : ");
		int n = s.nextInt();
		
		for(int i=1;i<=n;i++) {
			//Print Space
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			
			//To print Star
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
