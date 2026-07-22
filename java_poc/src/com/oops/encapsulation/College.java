package com.oops.encapsulation;

public class College {
	private int id;
	private String collegename;
	private double fee;
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	
	public String getCollegename() {
		return collegename;
	}
	
	public void setFee(double fee) {
		if(fee > 0) {
			this.fee = fee;
		}else {
			System.out.println("Enter Fee is Invalid !!");
		}
	}
	
	public double getFee() {
		return fee;
	}
	
	
}
