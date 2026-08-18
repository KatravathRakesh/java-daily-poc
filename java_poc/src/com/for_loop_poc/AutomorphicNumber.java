package com.for_loop_poc;

import java.util.Scanner;

//Example: 25
//
//25² = 625
//
//Last two digits of 625 = 25
//
//Since the square ends with the original number:
//
//✅ 25 is an Automorphic Number
public class AutomorphicNumber {

	static boolean isAutomorphicNum(int n) {
		boolean flag = true;
		int sq = n*n;
		int temp = n;
		 for(int i=sq,j= temp; j>0;i=i/10,j=j/10) {
			 
			 if(j%10 != i%10) {
				 flag = false;
			 }
		 }
		return flag;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = s.nextInt();
		
		if(isAutomorphicNum(n)) {
			System.out.println("Given Number is Automorphic Number : "+n);
		}else {
			System.out.println("Given Number is not Automorphic Number : "+n);
		}

		s.close();
	}

}
