package com.while_loop_poc;

import java.util.Scanner;

//Example: 145
//
//1! + 4! + 5!
//
//= 1 + 24 + 120
//
//= 145
//
//Original number = factorial sum
//
//✅ 145 is a Strong Number.

public class StrongNumber {
	

	static int fact(int n) {
		int fact =1;
		int i=1;
		while(i<=n) {
			fact *=i;
			i++;
		}
		return fact;
	}
	static boolean isStrongNum(int fact,int n) {
		boolean flag = false;
		int r =0;
		int sum =0;
		int temp = n;
		while(temp>0) {
			r = temp%10;
			sum += fact(r);
			temp = temp/10;
		}
		
		if(sum == n) {
			flag = true;
		}
		
		return flag;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = s.nextInt();
		
		int fact = fact(n);
		if(isStrongNum(fact,n)) {
			System.out.println("Given Number is Strong Number : "+n);
		}else {
			System.out.println("Given Number is not Strong Number : "+n);
		}

		s.close();
	}

}
