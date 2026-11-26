package StringHandling;

import java.util.Scanner;

public class CompareToMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter str1 : ");
		String str1 = sc.next();
		
		System.out.print("Enter str2 : ");
		String str2 = sc.next();
		
//		CompareTo --> two String same then 0  or ASCII value (str1 - str2)
		System.out.println(str1.compareTo(str2));
		
		sc.close();
		

	}

}
