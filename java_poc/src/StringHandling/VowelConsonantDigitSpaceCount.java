package StringHandling;

import java.util.Scanner;

public class VowelConsonantDigitSpaceCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the str1 : ");
		String str = sc.nextLine().toLowerCase();

		int vowelCount = 0;
		int ConsonantCount = 0;
		int DigCount = 0;
		int SpaceCount = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
	            str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
	            str.charAt(i) == 'u') {	
				vowelCount++;
			}else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				ConsonantCount++;
			} else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				DigCount++;
			} else if (str.charAt(i) == ' ') {
				SpaceCount++;
			}
		}
		
		System.out.println("Total Vowel Count : "+vowelCount);
		System.out.println("Total Consonant Count : "+ConsonantCount);
		System.out.println("Total Digit Count : "+DigCount);
		System.out.println("Total Space Count : "+SpaceCount);

		sc.close();

	}

}
