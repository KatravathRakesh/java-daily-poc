package com.while_loop_poc;

import java.util.Scanner;

//Print Z to A using a while loop.
public class PrintReverseAlphabetWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the character from you want to print in reverse order : ");
		char ch = s.next().charAt(0);
		
		while(ch >='A') {
			System.out.print(ch+" ");
			ch--;
		}
	}

}
