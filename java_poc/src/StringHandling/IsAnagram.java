package StringHandling;

import java.util.Arrays;
import java.util.Scanner;

public class IsAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the str1 : ");
		String str1 = sc.next();
		
		System.out.println("Enter the str2 : ");
		String str2 = sc.next();
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("Given String is Anagram !");
		}else {
			System.out.println("Given String is not Anagram !");
		}

		sc.close();
	}

}
