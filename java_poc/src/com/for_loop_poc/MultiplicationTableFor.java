package com.for_loop_poc;

import java.util.Scanner;

//Print the multiplication table of a given number.
public class MultiplicationTableFor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Multiple Num : ");
		int n1 = s.nextInt();
		System.out.print("Enter the how many time you want to print : ");
		int n = s.nextInt();
		
		if(n1%2 == 0) {
		    for(int i=1;i<=n;i++) {
			
				System.out.println(n1+" x "+i+" = "+n1*i);
			}
		}else {
			System.out.println("Multiple number is not a Even Number.");
		}

	}

}
