package com.for_loop_poc;

import java.util.Scanner;
//157 --> 1^3 + 5^3 + 3^3 ==> 157 = n
public class ArmstrongNumber {
	
	static boolean isArmstrong(int n) {
		boolean flag = false;
		
		int digit = 0;
		int count =0;
		int sum = 0;
		
		for(int i=n;i> 0;i = i/10) {
			digit = i%10;
			count++;
		}
		
		for(int i=n;i> 0; i = i/10) {
			digit = i%10;
			sum += Math.pow(digit,count);
		}
		
		if(sum == n) {
			flag = true;
		}
		
		return flag;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		
		if(isArmstrong(n)) {
			System.out.println("Give Number is Armstrong : "+n);
		}else {
			System.out.println("Give Number is not Armstrong : "+n);
		}
		s.close();
	}

}
