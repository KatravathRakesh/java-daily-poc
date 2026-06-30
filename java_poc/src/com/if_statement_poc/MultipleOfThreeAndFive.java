package com.if_statement_poc;

import java.util.*;

//Check if a number is a multiple of both 3 and 5. 
public class MultipleOfThreeAndFive {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the num :");
		int num = s.nextInt();
		
		if(num%3 == 0 && num%5 == 0) {
			System.out.println("Give number is a multiple of both 3 and 5.");
		}

	}

}
