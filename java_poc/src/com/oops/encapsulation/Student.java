package com.oops.encapsulation;

public class Student {

	private int id;
	private String name;
	private long marks;
	private String collegeName;
	
	//No arg Constructor
	public Student() {
		System.out.println("No - Argument Construction");
	}
	
	
	public String toString() {
		return " Student Info : [ Student ID : "+id+", Student Name : "+name+
				", Student Marks : "+marks+ ", Student CollegeName : " +collegeName +" ] ";
	}
	
	//Getter And Setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMarks() {
		return marks;
	}
	public void setMarks(long marks) {
		this.marks = marks;
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	public void setcollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
}
