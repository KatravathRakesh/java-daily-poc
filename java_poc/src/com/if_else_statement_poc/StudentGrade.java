package com.if_else_statement_poc;

import java.util.Scanner;

public class StudentGrade {

	static String getGradeInfo(double marksP) {
		String grade = "";
		
		if(marksP >100 || marksP<0) {
			System.out.println("Invalid marks percentage");
		}else if(marksP >=90) {
			grade = "Excellent : A";
		}else if(marksP >=80) {
			grade = "Good : B";
		}else if(marksP >=60) {
			grade = "Ok : C";
		}else if(marksP >= 35) {
			grade = "Just Passed";
		}else {
			grade ="Failed";
		}
		return grade;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the marks persentage % : ");
		double marksP = s.nextDouble();
		String grade = getGradeInfo(marksP);
		System.out.println("Your Grade on marksP "+marksP+" is "+grade);

	}

}
