package org.filepractice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class StringPractice {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\Britto\\Pictures\\Java\\Day11\\filepractice\\xyz.txt");
		FileWriter fwriter;
		try {
			fwriter = new FileWriter(f);
			BufferedWriter bwriter = new BufferedWriter(fwriter);
			bwriter.write("Tamil");
			bwriter.newLine();
			bwriter.write("English");
			bwriter.newLine();
			bwriter.write("Maths");
			bwriter.newLine();
			bwriter.write("Science");
			bwriter.newLine();
			bwriter.write("Social");
			bwriter.newLine();
			bwriter.write("Britto");
			bwriter.newLine();
			bwriter.write("Jonathan");
			bwriter.newLine();
			bwriter.write("Nancy");
			bwriter.newLine();
			bwriter.flush();
			bwriter.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
