package com.fileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\Rakesh\\OneDrive\\Desktop\\Vcube\\IOException\\file2.txt",true);
		try (BufferedWriter bw = new BufferedWriter(fw)) {
			bw.write("Java is Simple");
			bw.newLine();
			bw.write("Java is Dynamic");
			bw.newLine();
			bw.write("Java is MultiThreaded ");
		bw.flush();
		}

	}

}
