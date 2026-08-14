package com.while_loop_poc;

import java.util.Scanner;

//Example: 19
//1² + 9² = 1 + 81 = 82
//8² + 2² = 64 + 4 = 68
//6² + 8² = 36 + 64 = 100
//1² + 0² + 0² = 1
//
//Therefore, 19 is a Happy Number.
public class HappyNumber {

	static int sumNum(int n) {
		int sum =0;
		int r =0;
		
		while(n>0) {
			r = n%10;
			sum += Math.powExact(r, 2);//it will take only integer value
			n = n/10;
		}
		System.out.println("Sum of Each Digit : "+sum);
		return sum;
	}
	
	static boolean ishappyNum(int sum) {
		boolean flag = false;
		
		while(sum >=10) {
			sum = sumNum(sum);
			
		}
		if(sum == 1) {
			flag = true;
		}
		
		return flag;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		
		int sum = sumNum(n);
		
		if(ishappyNum(sum)) {
			System.out.println("Given Number is Happy Number : "+n);
		}else {
			System.out.println("Given Number is not  Happy Number : "+n);
		}
		
		s.close();
	}

}
