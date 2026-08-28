package com.strings;

public class LastLetterOfWordLowerCase {

	static void lastLetterOfWordLowerCase(String str) {
		StringBuilder sb = new StringBuilder("");
		
		for(int i=str.length()-1;i>=0; i--) {
			if(str.charAt(i) == ' ' && i>0) {
				sb.append(str.charAt(i));
				i--;
				sb.append(Character.toLowerCase(str.charAt(i)));
			}else {
				sb.append(str.charAt(i));
			}
		}
		
		StringBuilder result = new StringBuilder("");
		
		for(int i=sb.length()-1;i>=0;i--) {
			result.append(sb.charAt(i));
		}
		System.out.println(result);
		
	}
	public static void main(String[] args) {
		String str = "HI , I AM RAKESH NAIK !";
		
		lastLetterOfWordLowerCase(str);
	}

}
