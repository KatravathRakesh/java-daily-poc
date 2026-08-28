package com.strings;

import java.util.Scanner;

public class PrintSubString {

	static void substring(String str,int si,int ei) {
		String subStr = "";
		for(int i=si;i<ei;i++) {
			subStr += str.charAt(i);
		}
		
		System.out.println(subStr);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = "HelloWorld";
		System.out.print("Enter the Starting index : ");
		int si = s.nextInt();
		System.out.print("Enter the Ending index : ");
		int ei = s.nextInt();
		
		substring(str,si,ei);
		
		s.close();

	}

}
