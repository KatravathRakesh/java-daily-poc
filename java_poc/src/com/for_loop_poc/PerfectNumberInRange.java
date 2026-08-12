package com.for_loop_poc;

import java.util.Scanner;

//Q)WAP to print perfect number in range 1 to 100
// EX:  
//factor 6  : 1,2,3 = 1+2+3 =6 --> perfect number
public class PerfectNumberInRange {
	
	static boolean perfectNum(int n) {

		boolean flag = false;
		
		int sum = 0;
		for (int i = 1; i <=n/2; i++) {
			if (n % i == 0) {
				sum +=i;
			}
		}
		
		if(sum == n) {
			flag = true;
		}
		
		return flag;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter How many number want to print : ");
		int n = s.nextInt();
		
		System.out.print("Perfect Number  in Given range 1 to "+n+" is : ");
		for(int i=1;i<=n;i++) {
			if(perfectNum(i)) {
				System.out.print(i+" ");
			}
		}
		s.close();

	}

}
