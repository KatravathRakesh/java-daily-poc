package com.if_statement_poc;

import java.util.*;
//Check whether the entered character is a digit.

public class CharacterDigitCheck {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the character : ");
		char ch = s.next().charAt(0);
		if(ch >= '0' && ch <= '9') {
			System.out.println("Entered character is a digit.");
		}

	}

}
