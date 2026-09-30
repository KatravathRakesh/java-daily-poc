package com.fileIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		
		try (FileWriter f1 = new FileWriter("C:\\Users\\Rakesh\\OneDrive\\Desktop\\Vcube\\IOException\\file2.txt")) {
			f1.write(65);
			f1.write('\n');
			f1.write("Rakesh");
			f1.write('\n');
			f1.write('A');
		}
		System.out.println("File writen Successfully");

	}

}
