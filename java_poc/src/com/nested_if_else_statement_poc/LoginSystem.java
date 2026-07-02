package com.nested_if_else_statement_poc;

import java.util.*;
//Verify username and password.
public class LoginSystem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Username : ");
		String username = s.nextLine();
		System.out.print("Enter the Password : ");
		String pwd = s.nextLine();
		
		if(username.equals("admin")) {
			if(pwd.equals("123")) {
				System.out.println("Login Successfully!");
			}else {
				System.out.println("Invaild Password");
			}
		}else {
			System.out.println("Invaild Username ");
		}
	}

}
