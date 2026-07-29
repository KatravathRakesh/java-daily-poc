package com.operators.ternary_operators;

import java.util.Scanner;

//2.Assign a grade based on marks using nested ternary operators.
//Marks >= 90 → A
//Marks >= 75 → B
//Marks >= 60 → C
//Marks >= 40 → D
//Otherwise → Fail
public class Grademarks {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the marks : ");
		int marks = s.nextInt();

		String grade = 
				  (marks >= 90) ? "A"
				: ((marks >= 75) ? "B" 
				: ((marks >= 60) ? "C"
				: ((marks >= 40) ? "D"
				: "Fail")));
		
		System.out.println("Grade : " + grade);
	}

}
