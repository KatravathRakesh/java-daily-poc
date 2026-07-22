package com.oops.encapsulation;

public class TestCollege {

	public static void main(String[] args) {
		College c1 = new College();
		
		c1.setId(101);
		c1.setCollegename("MRCET");
		c1.setFee(-28000);
		
		System.out.println("College ID : "+c1.getId());
		System.out.println("College Name : "+c1.getCollegename());
		System.out.println("College Fee : "+c1.getFee());

	}

}
