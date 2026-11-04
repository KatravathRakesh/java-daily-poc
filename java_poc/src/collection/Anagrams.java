package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//1.Write a Java program to check whether two given strings are anagrams or not using ArrayList.
//Input:   listen
//         silent
//Output:
//Anagrams
public class Anagrams {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the str1 : ");
		String str1 = s.nextLine();
		System.out.print("Enter the str2 : ");
		String str2 = s.nextLine();
		
		ArrayList<Character> l1 = new ArrayList<>();
		ArrayList<Character> l2 = new ArrayList<>();
		
		
//		convert String to character Arrays
		for(Character ch1 : str1.toCharArray()) {
			l1.add(ch1);
		}
		
		for(Character ch2 : str2.toCharArray()) {
			l2.add(ch2);
		}
		
		Collections.sort(l1);
		Collections.sort(l2);
		
		if(l1.equals(l2)) {
			System.out.println("Given String is Anagram");
		}else {
			System.out.println("Given String is not Anagram");
		}
		
		s.close();

	}

}
