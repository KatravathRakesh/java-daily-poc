package com.oops.encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		e1.setEid(6150);
		e1.setEname("Katravath Rakesh");
		e1.setSalary(35000);
		
		System.out.println("Employee ID : "+e1.getEid());
		System.out.println("Employee Name : "+e1.getEname());
		System.out.println("Employee Salary : "+e1.getSalary());
		

	}

}
