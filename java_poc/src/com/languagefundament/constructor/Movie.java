package com.languagefundament.constructor;

public class Movie {
	String director;
	String hero;
	String name;
	double budget;
	
	Movie(){
		System.out.println("No-Argument Constructor ");
		this("S.S RajaMule");
	}
	
	Movie(String director){
		this.director = director;
	}
	
	
	
	public Movie(String director, String hero) {
		super();
		this.director = director;
		this.hero = hero;
	}
	

	public Movie(String director, String hero, String name) {
		super();
		this.director = director;
		this.hero = hero;
		this.name = name;
	}

	
	public Movie(String director, String hero, String name, double budget) {
		super();
		this.director = director;
		this.hero = hero;
		this.name = name;
		this.budget = budget;
	}

	void show() {
		System.out.println("---------------------------------");
		System.out.println("Director Name : "+director);
		System.out.println("Hero Name : "+hero);
		System.out.println("Movie Name : "+name);
		System.out.println("Movie budget : "+budget);
		System.out.println("---------------------------------");
	}
	public static void main(String[] args) {
		System.out.println("Main Method Started !!");
		
		Movie m = new Movie();
		m.show();
		
		Movie m1 = new Movie("Ram");
		m1.show();
		
		System.out.println("Main Method ended !!");
	}

}
