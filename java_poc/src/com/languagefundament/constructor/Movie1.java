package com.languagefundament.constructor;

public class Movie1 {
	String name;
	String director;
	String heroname;
	double budget;

	Movie1() {
		System.out.println("No-Argument constructor !");
		this("Unknown");

	}

	Movie1(String name) {
		this(name, "Unknown");
	}

	Movie1(String name, String director) {
		this(name, director, "Unknown");
	}

	Movie1(String name, String director, String heroname) {
		this(name, director, heroname, 10000000.0);
	}

	Movie1(String name, String director, String heroname, double budget) {
		this.name = name;
		this.director = director;
		this.heroname = heroname;
		this.budget = budget;
	}

	Movie1(Movie1 m) {
		this(m.name, m.director, m.heroname, m.budget);
	}

	void show() {
		System.out.println("Movie Name : " + name);
		System.out.println("Movie Director : " + director);
		System.out.println("Movie Hero Name : " + heroname);
		System.out.println("Movie Budget : " + budget);
		System.out.println("---------------------------------------");
	}

	public static void main(String[] args) {
		Movie1 m = new Movie1();
		m.show();

		Movie1 m1 = new Movie1("Kick");
		m1.show();
		
		Movie1 m2 = new Movie1("OG", "Durga");
		m2.show();
		
		Movie1 m3 = new Movie1("KALKI","krathi","Prabhesh");
		m3.show();
		
		Movie1 m4 = new Movie1("Peddi","Gopal","Ram Charan",4000000000.0);
		m4.show();
		
		Movie1 m5 = new Movie1(m3);
		m5.show();
		

	}

}
