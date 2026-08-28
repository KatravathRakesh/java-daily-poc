package com.strings;

public class LetterCountDecompression {

	static String letterCount(String str) {
		StringBuilder sb = new StringBuilder("");
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			i++;
			int count = str.charAt(i) -'0';//Convert character  into integer ex : '4' --> 4
			for(int j=0;j<count;j++) {
				sb.append(ch);
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String str = "a4b3c2";
		
		String lc = letterCount(str);
		System.out.println("Letter Count Decompression"+lc);

	}

}
