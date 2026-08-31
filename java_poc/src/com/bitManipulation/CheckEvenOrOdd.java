package com.bitManipulation;

import java.util.Scanner;

public class CheckEvenOrOdd {
//	   256 128 64 32 16 8 4 2 1
/// n = 5
/// 101 & 001 => 1; for -> Odd
/// n = 6
/// 110 & 001 => 0; for -> Even 
/// n = 9
/// 1001 & 0001 => 1;for  -> Odd
	
	
	static boolean isOddOREven(int n ) {
		boolean flag = false;
		if((n&1) ==0) {
			flag = true;//Even 
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n =s.nextInt();
		
		if(isOddOREven(n)) {
			System.out.println("Given Number is Even :"+n);
		}else {
			System.out.println("Given Number is Odd :"+n);
		}
		
		s.close();

	}

}
