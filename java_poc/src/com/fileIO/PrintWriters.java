package com.fileIO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriters {

	public static void main(String[] args) throws FileNotFoundException {
		
		try (PrintWriter pw = new PrintWriter("C:\\Users\\Rakesh\\OneDrive\\Desktop\\Vcube\\IOException\\file3.txt")) {
			pw.println('R');
			pw.println("Hyper Text Markup Langage");
			pw.println("Java is Dynamic Programming Langage");
			pw.println(12);//int
			pw.println(12.5F);//Float
			pw.println(45.9);//Double
		}

	}

}
