package com.oops.abstraction;

public class ManagementStudent implements Student{

	int mark;
	ManagementStudent(int mark){
		this.mark = mark;
	}
	
	@Override
	public void calculateGrade() {
		System.out.println("***************** ManagementStudent Info ********************");
		if(mark > 90 && mark <=100) {
			System.out.println("Grade : A"+" , Mark : "+mark);
		}else if(mark >70 && mark <= 90) {
			System.out.println("Grade : B");
		}else if(mark >= 60) {
			System.out.println("Just Pass! Grade : D"+" , Mark : "+mark);
		}else {
			System.out.println("Fail..!"+" , Mark : "+mark);
		}
		
		System.out.println("-------------------------------------------------");
		
		
	}

}
