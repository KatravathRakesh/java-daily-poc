package com.while_loop_poc;

import java.util.Scanner;

//Example: 172
//1 + 7 + 2 = 10
//1 + 0 = 1
//output:
//Final digit = 1
//Therefore, 172 is a Magic Number.
public class MagicNumber {

	static int sumNum(int n) {
		int digit = 0;
		int sum = 0;
		while(n > 0) {
			digit = n%10;
			sum += digit;
			n = n/10;
			
		}
		System.out.println("Sum of each digit : "+sum);
		return sum;

	}

	static boolean isMagicNum(int sum) {
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
		
		if(isMagicNum(sum)) {
			System.out.println("Given Number is Magic Number : "+n);
		}else {
			System.out.println("Given Number is Not Magic Number : "+n);
		}
		
		s.close();
	}

}
