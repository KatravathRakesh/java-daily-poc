package com.pattern_poc;

import java.util.Scanner;

//print Butterfly Pattern
//*        *
//**      **
//***    ***
//****  ****
//**********
//****  ****
//***    ***
//**      **
//*        *
public class ButterflyPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number col want to print : ");
		int n = s.nextInt();
		
		for(int i=1;i<=n;i++) {
			//print star
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			//print space
			for(int j=2*(n-i);j>=1;j--) {//2(n-i) == 2*4
				System.out.print(" ");
			}
			
			//print star
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//****  **** //2    
		//***    *** // 4
		//**      ** //6
		//*        * //8
		
		for(int i=1;i<=n-1;i++) {
			//print star
			for(int j=n-1;j>=i;j--) {
				System.out.print("*");
			}
			
			//print space
			for(int j=1;j<=2*i;j++) {
				System.out.print(" ");
			}
			
			//print star
			for(int j=n-1;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
