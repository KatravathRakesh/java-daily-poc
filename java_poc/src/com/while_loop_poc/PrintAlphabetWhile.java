package com.while_loop_poc;

import java.util.Scanner;

//Print A to Z using a while loop.
public class PrintAlphabetWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the character from you want to print : ");
		char ch = s.next().charAt(0);
		
		while(ch <= 'Z') {
			System.out.print(ch+" ");
			ch++;
		}
	}

}
