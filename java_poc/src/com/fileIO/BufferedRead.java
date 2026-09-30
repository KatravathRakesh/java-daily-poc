package com.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedRead {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\Rakesh\\OneDrive\\Desktop\\Vcube\\IOException\\file2.txt");
		try (BufferedReader br = new BufferedReader(fr)) {
			String s = br.readLine();
			
			while(s != null) {
				System.out.println(s);
				s = br.readLine();
			}
		}
		

	}

}
