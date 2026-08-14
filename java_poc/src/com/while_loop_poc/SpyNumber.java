package com.while_loop_poc;

import java.util.Scanner;

//Example: 1124
//
//Sum:
//1 + 1 + 2 + 4 = 8
//
//Product:
//1 × 1 × 2 × 4 = 8
//
//Since:
//Sum = Product
//
//1124 is a Spy Number
public class SpyNumber {

	static boolean isSpyNum(int n) {
		boolean flag = false;
		
		int sum =0;
		int r =0;
		int prod =1;
		
		while(n >0) {
			r = n%10;
			sum += r;
			prod *= r;
			n = n/10;
		}
	
		if(sum == prod) {
			flag = true;
		}
		
		System.out.println("Sum of each digit is : "+sum);
		System.out.println("Product of each digit is : "+prod);

		return flag;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = s.nextInt();
		
		if(isSpyNum(n)) {
			System.out.println("Given Number is Spy Number : "+n);
		}else {
			System.out.println("Given Number is not Spy Number : "+n);
		}
		
		s.close();

	}

}
