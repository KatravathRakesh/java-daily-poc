package com.BackTracking;

public class SubString {

	public static void findSubStr(String str, String ans, int i) {
//		base case
		if (i == str.length()) {
			if (ans.length() == 0) {
				System.out.print("null");
			} else {
				System.out.println(ans);
			}
			return;
		}

//		recursion
//		yes choices
		findSubStr(str, ans + str.charAt(i), i + 1);
//		No choices
		findSubStr(str,ans,i+1);

	}

	public static void main(String[] args) {
		String str = "abc";

		findSubStr(str, "", 0);

	}

}
