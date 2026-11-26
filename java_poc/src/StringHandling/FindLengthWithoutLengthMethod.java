package StringHandling;

import java.util.Scanner;

public class FindLengthWithoutLengthMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the str1 : ");
		String str1 = sc.nextLine();

		char[] ch = str1.toCharArray();

		int count = 0;

		for (char c : ch) {
			System.out.print(c+" ");
			count++;
		}
		System.out.println();
		
		System.out.println("Length Of String is : "+count);
		
		sc.close();
	}

}
