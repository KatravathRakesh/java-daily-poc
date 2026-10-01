package com.strings;

import java.util.Scanner;

public class RemoveDuplicate {

	public static String remove(String str1) {
		StringBuilder sb = new StringBuilder("");
		
		for(int i=0;i<str1.length()-1;i++) {
			boolean flag = false;
			for(int j=0;j<i;j++) {
				if(str1.charAt(i) == str1.charAt(j)) {
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				sb.append(str1.charAt(i));
			}
		}

//		OR
		
//		for(int i=0;i<str1.length();i++) {
//			if(sb.lastIndexOf(String.valueOf(str1.charAt(i))) == -1) {
//				sb.append(str1.charAt(i));
//			}
//		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the str1 : ");
		String str1 = s.next();
		
		System.out.println(remove(str1));
		
		s.close();
	}

}
