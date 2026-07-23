package com.languagefundament.constructor;

public class Animal {
	String name = "Cat1";
	String color = "Black";
	String type = "HNO";
	

	public static void main(String[] args) {
		System.out.println("Parent class Called !!");

	}
	

}
class cat extends Animal{
	String name = "Cat2";
	String color = "RED";
	String type = "HNO";
	
	public static void main(String[] args) {
		System.out.println("Child class called !!");
		
		cat c1 = new cat();
		c1.showSup();
		c1.showSub();
		
	}
	void showSup() {
		System.out.println("Animal name : "+super.name);
		System.out.println("Animal color : "+super.color);
		System.out.println("Animal type : "+super.type);
		System.out.println("************************************");
	}
	
	void showSub() {
		System.out.println("Animal name : "+this.name);
		System.out.println("Animal color : "+this.color);
		System.out.println("Animal type : "+this.type);
		System.out.println("************************************");
	}
}
