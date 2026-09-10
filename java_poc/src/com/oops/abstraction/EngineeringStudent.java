package com.oops.abstraction;

public class EngineeringStudent implements Student {
	int mark;
	
	EngineeringStudent(int mark) {
		this.mark = mark;
	}
	
	@Override
	public void calculateGrade() {
		System.out.println("***************** EngineeringStudent Info ********************");
		if(mark > 70 && mark <=100) {
			System.out.println("Grade : A"+" , Mark : "+mark);
		}else if(mark >40 && mark <= 70) {
			System.out.println("Grade : B"+" , Mark : "+mark);
		}else if(mark >= 35) {
			System.out.println("Just Pass! Grade : D"+" , Mark : "+mark);
		}else {
			System.out.println("Fail..!"+" , Mark : "+mark);
		}
		
		System.out.println("-------------------------------------------------");
	}
}
