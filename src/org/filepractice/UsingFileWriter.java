package org.filepractice;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {
	public static void main(String[] args) throws IOException {
		String location = "UsingFileWriter.txt";
		String content = "Learning Java is Simple";
		
		FileWriter fileWriter = new FileWriter(location);
		fileWriter.write(content);
		fileWriter.close();

	}
}
