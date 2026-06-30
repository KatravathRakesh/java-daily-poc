package com.if_statement_poc;

import java.util.*;

//Print "Even" only if the number is even.
public class EvenNumberCheck {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the num : ");
		int num = s.nextInt();
		if(num%2 == 0) {
			System.out.println("Even");
		}
	}

}
