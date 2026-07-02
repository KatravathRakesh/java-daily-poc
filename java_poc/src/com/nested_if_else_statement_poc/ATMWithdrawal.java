package com.nested_if_else_statement_poc;

import java.util.*;
//Allow withdrawal only if the PIN is correct and balance is sufficient.
public class ATMWithdrawal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the PIN : ");
		String PIN = s.nextLine();
		System.out.print("Enter the Balance : ");
		double balance = s.nextDouble();
		System.out.print("Enter the Withdrawal amount : ");
		double withdrawal = s.nextDouble();
		
		if(PIN.equals("2233")) {
			if(balance >= 500) {
				if(withdrawal >balance) {
					System.out.println("Insufficient balance.");
				}else {
					double remaining = balance - withdrawal;
					System.out.println("Transaction Successful! Have a good day. Thank you for visiting!");
					System.out.println("Remaining Balance: " + remaining);
				}
			}else {
				System.out.println("Minimum balance requirement not met");
			}
		}else {
			System.out.println("Invalid PIN , Please try again!");
		}
	}

}
