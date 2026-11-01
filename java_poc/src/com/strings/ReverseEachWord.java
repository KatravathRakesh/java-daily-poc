package com.strings;

import java.util.Scanner;

public class ReverseEachWord {

	public static String reverse(String str) {
		StringBuilder sb = new StringBuilder("");

		 int start = 0;

	        for (int i = 0; i <= str.length(); i++) {

	            if (i == str.length() || str.charAt(i) == ' ') {

	                for (int j = i - 1; j >= start; j--) {
	                    sb.append(str.charAt(j));
	                }

	                if (i < str.length()) {
	                    sb.append(" ");
	                }

	                start = i + 1;
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
