package com.languagefundament.method;

public class MyInfo {

	void displayName(String name) {
		System.out.println("My Name is : "+name);
	}
	void displayAge(int age) {
		System.out.println("My Age is : "+age);
	}
	void displayCollege(String college) {
		System.out.println("My College is : "+college);
	}
	void displayBranch(String branch) {
		System.out.println("My branch is : "+branch);
	}
	void displayCity(String city){
		System.out.println("I am living in this city : "+city);
	}
	void displayState(String state) {
		System.out.println("My state is : "+state);
	}
	void displayCountry(String country) {
		System.out.println("My Country is : "+country);
	}
	void displayEmail(String email) {
		System.out.println("My Email ID : "+email);
	}
	void displayMobile(long mobile) {
		System.out.println("My Mobile Number : "+mobile);
	}
	void displayCGPA(double cgpa) {
		System.out.println("CGPA : "+cgpa);
	}
	void displaySkills(String skill) {
		System.out.println("My skill : "+skill);
	}
	void displayGoal(String goal) {
		System.out.println("MY Goal :"+goal);
	}
	void displayPercentage(double percentage) {
		System.out.println("My Percentage : "+percentage+"%");
	}
	void displayFatherName(String father) {
		System.out.println("My Father Name: "+father);
	}
	void displayMotherName(String mother) {
		System.out.println("My Mother Name : "+mother);
	}
	void displayAddress(String address) {
		System.out.println("Address : "+address);
	}
	void displayInfo() {
		System.out.println("****  My Info  ******");
		displayName("Rakesh");
		displayAge(22);
		displayCollege("MRCET");
		displayBranch("CSE_AIML");
		displayCity("Hyderabad");
		displayState("Telangana");
		displayCountry("India");
		displayEmail("katravathrakesh609@gmail.com");
		displayMobile(8125307059L);
		displayCGPA(8.69);
		displaySkills("Java , MySQL, React.js, JVM");
		displayGoal("Java full Stack Developer ");
		displayPercentage(83);
		displayFatherName("K Hemla Naik");
		displayMotherName("K Javamma");
		displayAddress("5-75, keshavapur Pedda thanda, Koilkonda(M), Mahabubnagar(Dist), Telangana(State), PINCode : 509371");	
	}
	void main(String[] args) {
		displayInfo();
	}
}
