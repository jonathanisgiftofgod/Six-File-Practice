package org.filepractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NewFileWrite {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\Britto\\Desktop\\JAVA\\Britto\\Jonathan.txt");
		FileWriter fWriter;
		try {
			fWriter = new FileWriter(f, true);
			BufferedWriter bwriter = new BufferedWriter(fWriter);
			bwriter.write("Line 1 How are you");
			bwriter.newLine();
			bwriter.write("Line 2 How are you");
			bwriter.newLine();
			bwriter.write("Line 3 How are you");
			bwriter.newLine();
			bwriter.write("Line 4 How are you");
			bwriter.newLine();
			bwriter.write("Line 5 How are you");
			bwriter.newLine();
			bwriter.write("Line 6 How are you");
			bwriter.newLine();
			bwriter.write("Line 7 How are you");
			bwriter.newLine();
			bwriter.write("Line 8 How are you");
			bwriter.newLine();
			bwriter.write("Line 9 How are you");
			bwriter.newLine();
			bwriter.write("Line 10 How are you");
			bwriter.flush();
			bwriter.close();
		
			FileReader fReader = new FileReader(f);
			BufferedReader bReader = new BufferedReader(fReader);
			
			String line = bReader.readLine();
			String newLine = line;
			
			int count = 0;
			int sentenceCount = 0;
			int wordCount = 0;
			for(int i = newLine.length();i>=5;i--) {
				String[] sentence = line.split("[.]");
				sentenceCount = sentenceCount + sentence.length;
				count++;
				String[] word = line.split(" ");
				wordCount = wordCount + word.length;
				System.out.println(line);
				line = bReader.readLine();	
			}
			
			System.out.println("Line Count " + count);
			System.out.println("Sentence Count " + sentenceCount);
			System.out.println("WordCount " + wordCount);
			boolean contains = newLine.contains("java");
			System.out.println(contains);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
