package com.if_statement_poc;

import java.util.Scanner;

//Check whether attendance is at least 75%
public class AttendanceEligibility {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the attendance : ");
		int attendance = s.nextInt();
		
		
		if(attendance >= 75) {
			System.out.println("you should not to pay any condonation fee and Eligible to write Exam.");
		}

	}

}

