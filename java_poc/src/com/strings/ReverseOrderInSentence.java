package com.strings;

public class ReverseOrderInSentence {

	public static String reverseOrder(String[] str) {
		StringBuilder  sb = new StringBuilder("");
		
		for(int i=str.length-1;i>=0;i--) {
			String str1 = str[i];
			sb.append(str1+" ");
			
		}
		
		return sb.toString();
	}
	public static void main(String[] args) {
		String[] str = {"Java", "Is", "OOP"};

		System.out.println(reverseOrder(str));
	}

}
