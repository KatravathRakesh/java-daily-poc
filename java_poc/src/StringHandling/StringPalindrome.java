package StringHandling;

import java.util.Scanner;
//Palindrome : 
//Words: civic, kayak, level, madam, noon, racecar, radar

//Not Palindrome:
//words : rakesh,suresh ,---- etc
public class StringPalindrome {

	public static String reverseString(String str) {
		String rstr = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			rstr = ch + rstr;
		}
		return rstr;
	}
	
	public static boolean isPalindrome(String str,String rstr) {
		
		boolean status = false;
		if(str.equalsIgnoreCase(rstr)) {
			status = true;
		}
		
		return status;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the str1 : ");
		String str = sc.nextLine();

		String rstr =  reverseString(str);
		
		if(isPalindrome(str, rstr)) {
			System.out.println("Given String -> "+str+" <- is Palindrome !");
		}else {
			System.out.println("Given String -> "+str+" <- is not Palindrome !");
		}
		sc.close();

	}

}
