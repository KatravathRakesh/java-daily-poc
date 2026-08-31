package com.bitManipulation;

import java.util.Scanner;

public class Get_ith_Bit {

//	   256 128 64 32 16 8 4 2 1
/// n =10 => 1010 --> index : 3 2 1 0
/// ith = 2 --> 0
/// 
	static int findithBit(int n, int i) {
		int bit = 1 << i;
		if ((n & bit) == 0) {
			return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = s.nextInt();
		System.out.println("Enter ith index to get : ");
		int i = s.nextInt();

		int ith = findithBit(n, i);
		System.out.println("Get ith Index : "+ith);
		
		s.close();

	}

}
