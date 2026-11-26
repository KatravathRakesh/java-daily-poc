package StringHandling;

import java.util.Scanner;

public class ReverseStringWithoutReverseMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the str1 : ");
		String str1 = sc.nextLine(); //java
		
		String rstr = "";
		for(int i=0;i<str1.length();i++) {
			char ch = str1.charAt(i); 
			 rstr = ch+ rstr;
		}
		
		System.out.println("Reverse String : "+rstr);
		
		sc.close();
		
	}

}
