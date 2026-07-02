package com.nested_if_else_statement_poc;

import java.util.Scanner;
//Display grade based on marks.
public class GradeCalculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the marks : ");
		int mark = s.nextInt();
		if(mark < 0) {
			System.out.println("Mark should not in negative!");
		}else if(mark <=100) {
			if(mark >90) {
				System.out.println("Grade : A");
			}else if(mark > 80) {
				System.out.println("Grade : B");
			}else if(mark > 70) {
				System.out.println("Grade : C");
			}else if(mark > 60) {
				System.out.println("Grade : D");
			}else if(mark > 50) {
				System.out.println("Grade : E");
			}else if(mark > 35){
				System.out.println("Just Pass");
			}else {
				System.out.println("Fail");
			}
		}else {
			System.out.println("Your marks is above 100 ");
		}

	}

}
