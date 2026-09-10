package com.oops.abstraction;

public class MedicalStudent implements Student {

	int mark;
	MedicalStudent(int mark){
		this.mark = mark;		
	}
	
	@Override
	public void calculateGrade() {
		System.out.println("***************** MedicalStudent Info ********************");
		if(mark > 80 && mark <=100) {
			System.out.println("Grade : A"+" , Mark : "+mark);
		}else if(mark >60 && mark <= 81) {
			System.out.println("Grade : B"+" , Mark : "+mark);
		}else if(mark >= 50) {
			System.out.println("Just Pass! Grade : D"+" , Mark : "+mark);
		}else {
			System.out.println("Fail..!"+" , Mark : "+mark);
		}
		
		System.out.println("--------------------------------------------");
		
	}

}
