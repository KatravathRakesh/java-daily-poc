package com.strings;

public class StringDecompression {

	static void stringDecompression(String str) {
		StringBuilder sb = new StringBuilder("");

		for (int i = 0; i < str.length(); i++) {
			int count = str.charAt(i) - '0';
			i++;
			if (str.charAt(i) == '[') {
				i++;
				String temp = "";
				while (str.charAt(i) != ']') {
					temp += str.charAt(i);
					i++;
				}
				for (int j = 0; j < count; j++) {
					sb.append(temp);
				}
			}

		}
		System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		String str = "3[a]2[ab]2[c]";

		stringDecompression(str);

	}

}
