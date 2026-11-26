package StringHandling;

import java.util.Scanner;

public class Max_Occurances {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.next();

		int[] arr = new int[127];

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
		}

		int max = Integer.MIN_VALUE;
		char ch = ' ';

		for (int i = 0; i < str.length(); i++) {
			if (arr[str.charAt(i)] > max) {
				max = arr[str.charAt(i)];
				ch = str.charAt(i);
			}
		}
		
		System.out.println("Maximum count Occurances : "+max);
		System.out.println("Maximum Number Of Character Occurances : "+ch);
		
		sc.close();

	}

}
