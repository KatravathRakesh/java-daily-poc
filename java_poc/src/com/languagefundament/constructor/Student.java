package com.languagefundament.constructor;

import java.util.Scanner;

//Create a constructor to initialize student id, name, and marks.
public class Student {
	static String college = "Vcube";
	int St_id;
	String St_name;
	long marks;
	
	Student(){
		System.out.println("No Argument");
		St_id =101;
		St_name = "Ram";
		marks = 75;
	}
	
	
	public Student(int st_id, String st_name, long marks) {
		this.St_id = st_id;
		this.St_name = st_name;
		this.marks = marks;
	}

	void show() {
		System.out.println("College Name : "+college);
		System.out.println("Student ID : "+St_id);
		System.out.println("Student Name : "+St_name);
		System.out.println("Student marks : "+marks);
		System.out.println("*************************");
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.show();
		
		Student s2 = new Student(79,"Katravath Rakesh",70);
		s2.show();
		
		Student s3 = new Student(75,"K Nikhilesh",80);
		s3.show();
		
		Student s4 = new Student(86,"K Yugandhar",79);
		s4.show();
	}

}
