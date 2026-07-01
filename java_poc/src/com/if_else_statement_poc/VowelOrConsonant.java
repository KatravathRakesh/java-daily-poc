package com.if_else_statement_poc;

import java.util.*;
//Check whether a character is a vowel or consonant.
public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the character : ");
		char ch = s.next().charAt(0);
		if((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) &&
			(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )) {
			System.out.println(ch+" is character is a Vowel. ");
		}else {
			System.out.println(ch+" is character is a Consonant. ");
		}
			
	}

}
