package com.while_loop_poc;

import java.util.Scanner;

public class DecimalToBinary {

	static void decimalToBinary(int n) {
		int r = 0;
		String binVal = "";
		
		while(n >0) {
			r = n%2;//11%2 = 1,5%2=1,2%2 =0,1%2=1
			n = n/2;// 11/2 = 5,5/2 =2,2/2 =1,1/2=0
			binVal = r + binVal;//1011
			
		}
		
		System.out.println("The Binary Value : "+binVal);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		
		decimalToBinary(n);
		s.close();

	}

}
