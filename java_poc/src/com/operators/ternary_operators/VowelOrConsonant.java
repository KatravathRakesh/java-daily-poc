package com.operators.ternary_operators;

import java.util.Scanner;

//Write a Java program to check whether a given character is a vowel or a consonant using the ternary operator.

public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the character : ");
		char ch = s.next().charAt(0);

		String c = ((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
				|| (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) ? "Vowel" : "Consonant";
		
		System.out.println("Given character is  : "+c);
		
		
		

	}

}
