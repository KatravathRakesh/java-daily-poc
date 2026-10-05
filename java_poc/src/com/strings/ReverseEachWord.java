package com.strings;

import java.util.Scanner;

public class ReverseEachWord {

	public static String reverse(String str) {
		StringBuilder sb = new StringBuilder("");

		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if (ch == ' ') {
				int len = i - 1;
				for (int j = len; j >= 0; j--) {
					sb.append(str.charAt(j));
				}
				sb.append(" ");
			} else {
				int len = i;
				for (int j = str.length()-1; j >=len; j--) {
					sb.append(str.charAt(j));
				}
				sb.append(" ");
				break;
			}
			
		}

		return sb.toString();

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = s.nextLine();

		System.out.println(reverse(str));
		
		s.close();

	}

}
