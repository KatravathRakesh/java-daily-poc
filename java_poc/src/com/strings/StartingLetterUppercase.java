package com.strings;

//output 
// Hi, I Am Rakesh Naik !
public class StartingLetterUppercase {

	static void startingLetterUppercase(String str) {
		StringBuilder sb = new StringBuilder("");
		
		char ch =  Character.toUpperCase(str.charAt(0));
		sb.append(ch);
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)== ' ' && i<str.length()-1) {
				sb.append(str.charAt(i));
				i++;
				ch = Character.toUpperCase(str.charAt(i));
				sb.append(ch);
			}else {
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb);
	}
	public static void main(String[] args) {
		String str = "hi, i am rakesh naik !";
		
		startingLetterUppercase(str);

	}

}
