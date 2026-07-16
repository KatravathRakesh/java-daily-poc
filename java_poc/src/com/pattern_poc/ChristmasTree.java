package com.pattern_poc;

import java.util.Scanner;

//print Christmas Tree
//  *  //1 --> 2-1
// ***  //3 -->4-1
//***** //5  ->6-1
//  *
//  *
public class ChristmasTree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number col want to print : ");
		int n = s.nextInt();
		
		for(int i=1;i<=n;i++) {
			//print space
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			
			//print star
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n-1;i++) {
			//print space
			for(int j=1;j<=n-1;j++) {
				System.out.print(" ");
			}
			
			//print star
			for(int j=1;j<=1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
