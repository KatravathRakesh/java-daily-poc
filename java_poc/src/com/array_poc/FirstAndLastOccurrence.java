package com.array_poc;

import java.util.Scanner;

public class FirstAndLastOccurrence {

	static void firstandLastOccurrence(int[] num, int target) {
		int firstindex = num.length;
		int lastindex = 0;
		
		for(int i=0;i<num.length;i++) {
			if(target == num[i]) {
				if(firstindex > i) {
					firstindex = i;
				}else if(lastindex < i) {
					lastindex = i;
				}
					
			}
		}
		
		System.out.println("First Occurrence in given Array : "+firstindex);
		if(lastindex >0) {
			System.out.println("Last Occurrence in given Array : "+lastindex);
		}else {
			System.out.println("Last Occurrence in given Array : "+firstindex);
		}
		
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num = {10,20,30,10,30,50,10};
		System.out.print("Enter the target : ");
		int target = s.nextInt();
		
		firstandLastOccurrence(num,target);
		
		s.close();
	}

}
