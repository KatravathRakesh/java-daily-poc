package com.strings;

import java.util.Scanner;

public class Anagram {

	public static boolean isAnagram(String str1, String str2) {
		
//		base case
		if(str1.length() != str2.length()) {
			return false;
		}
		
		boolean[] visited = new boolean[str1.length()];
	
		for(int i=0;i<str1.length();i++) {
			boolean flag = false;
			for(int j=0;j<str2.length();j++) {
				if(str1.charAt(i) == str2.charAt(j) && !visited[j]) {
					visited[j] = true;
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter str1 : ");
		String str1 = s.next();
		System.out.print("Enter str2 : ");
		String str2 = s.next();
		
		if(isAnagram(str1,str2)) {
			System.out.println("Given String  is Anagram ");
		}else {
			System.out.println("Given String  is Anagram ");
		}

		s.close();
	}

}
