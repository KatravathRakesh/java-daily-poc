package com.oops.encapsulation;

public class Student {

	private int id;
	private String name;
	private long marks;
	
	
	public String toString() {
		return " Student Info : [ Student ID : "+id+", Student Name : "+name+
				", Student Marks : "+marks+ " ] ";
	}
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
	
}
