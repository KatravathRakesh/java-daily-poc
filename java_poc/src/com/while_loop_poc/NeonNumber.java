package com.while_loop_poc;

import java.util.Scanner;

//Example: 9
//
//9² = 81
//
//8 + 1 = 9
//
//Since the sum is equal to the original number:
//
//✅ 9 is a Neon Number.
public class NeonNumber {

	static int sumNum(int n) {
		int sum =0;
		int sq = n*n;
		int temp = sq;
		int r = 0;
		
		while(sq >0) {
			r = sq%10;
			sum += r;
			sq = sq/10;
			
		}

		System.out.println("Square of Given Number "+n+" is : "+temp);
		System.out.println("Sum of each square digit : "+sum);
		return sum;
	}
	
	static boolean isNeonNum(int sum, int n) {
		boolean flag = false;
		
		if(sum == n) {
			flag = true;
		}
		
		return flag;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = s.nextInt();
		
		int sum = sumNum(n);
		
		if(isNeonNum(sum,n)) {
			System.out.println("Given Number is Neon Number : "+ n);
		}else {
			System.out.println("Given Number is not Neon Number : "+ n);
		}
		
		s.close();

	}

}
