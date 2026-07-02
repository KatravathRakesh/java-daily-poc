package com.nested_if_else_statement_poc;

import java.util.*;
//Verify documents before approving a passport.
public class PassportVerification {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Is Aadhar Available : ");
		String aadhar = s.nextLine();
		System.out.print("Is DOB proof is Available : ");
		String proof = s.nextLine();
		System.out.print("Is Address proof vaild :  ");
		String address = s.nextLine();
		System.out.print("Is Identity proof vaild : ");
		String identity = s.nextLine();
		System.out.print("Is Police verification : ");
		String verify = s.nextLine();
		
		if(aadhar.equalsIgnoreCase("yes")) {
			if(proof.equalsIgnoreCase("yes")) {
				if(address.equalsIgnoreCase("yes")) {
					if(identity.equalsIgnoreCase("yes")) {
						if(verify.equalsIgnoreCase("clear")) {
							System.out.println("Passport is Approved!");
						}else {
							System.out.println("Passport Rejected!");
						}
					}else {
						System.out.println("Invaild identity Passport Rejected!");
					}
				}else {
					System.out.println("Address proof is invaild");
				}
			}else {
				System.out.println("DOB proof is invaild");
			}
		}else {
			System.out.println("Invaild aadhar no");
		}
	}

}
