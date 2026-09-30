package com.fileIO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Rakesh\\OneDrive\\Desktop\\Vcube\\IOException\\file2.txt");
		try (FileReader f1 = new FileReader(f)) {
			int i = f1.read();
			while(i != -1) {
				System.out.print((char)i+"");
				i = f1.read();
			}
		}

	}

}
