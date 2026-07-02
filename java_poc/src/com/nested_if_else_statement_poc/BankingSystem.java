package com.nested_if_else_statement_poc;

import java.util.Scanner;

//Allow transactions only after account and PIN verification
public class BankingSystem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Verify Account HolderName : ");
		String name = s.nextLine();
		System.out.print("Verify PIN : ");
		String pin = s.next();
		
		if(name.equals("Rakesh")) {
			if(pin.equals("2233")) {
				System.out.println("Transaction Successful.!!");
			}else {
				System.out.println("Invalid PIN.");
			}
		}else {
			System.out.println("Invaild Account HolderName.");
		}

	}

}
