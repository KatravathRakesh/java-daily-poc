package com.if_else_statement_poc;

import java.util.*;
//Check whether BMI is normal or abnormal.
public class BMIStatus {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the weight (kg) : ");
		float w = s.nextFloat();
		System.out.println("Enter height (m) :");
		float h = s.nextFloat();
		
		float bmi = w/(h*h);
		
		System.out.println("BMI : "+bmi);
		
		if(bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("BMI is normal. ");
		}else {
			System.out.println("BMI is abnormal. ");
		}

		s.close();
	}

}
