package com.strings;

import java.util.Scanner;

public class StringReverseAndPalindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the str1 : ");
		String str1 = s.nextLine();
		String rstr = "";
		
//		To Print Reverse Order Of String Java --> avaJ
		for(int i=0;i<str1.length();i++) {
			char c = str1.charAt(i);//j a v a
			rstr = c + rstr;/// j  aj  vaj   avaj
			
		}
		
		System.out.println("Reverse Order Of String : "+rstr);
		
		

		
//		 Check is Palindrome or Not is Palindrome
		
		if(str1.equalsIgnoreCase(rstr)) {
			System.out.println("Give String is Palindrome");
		}else {
			System.err.println("Give String is not Palindrome");
		}
		

	}

}
