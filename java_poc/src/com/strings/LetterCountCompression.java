package com.strings;

public class LetterCountCompression {

	static String letterCount(String str) {
		StringBuilder sb = new StringBuilder("");
		
		for(int i=0;i<str.length();i++) {
			int count =1;
			while(i <str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
				count++;
				i++;
			}
			sb.append(str.charAt(i));
			if(count>1) {
				sb.append(count);
			}
			
		}
		return sb.toString();//toString --> used for return String Chatacter
	}
	public static void main(String[] args) {
		String str = "aaaaaabbbcc";
		
		String lc = letterCount(str);
		System.out.println("Letter Count Compression" +lc);

	}

}
