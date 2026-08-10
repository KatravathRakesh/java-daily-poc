package com.array_practices_poc;

public class LargestNameInArray {

	public static void main(String[] args) {
		String[] name = {"Rakesh", "Raju","MS.Dhoni","Yugandhar"};
		
		String max = "";
		
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i]+" || ");
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<name.length;i++) {
			if(max.length() < name[i].length()) {
				max = name[i];
			}
		}
		
		System.out.println("Largest Name in Given Array List : "+max);

	}

}
