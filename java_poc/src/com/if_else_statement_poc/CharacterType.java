package com.if_else_statement_poc;

import java.util.*;
//Check whether a character is an alphabet or not.
public class CharacterType {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Character : ");
		char ch = s.next().charAt(0);
		if((ch >= 'a' && ch <= 'z') ||
		   (ch >= 'A' && ch <= 'Z')) {
			System.out.println("Give character is an alphabet.");
		}else {
			System.out.println("Give character is an not alphabet ");
		}

	}

}
