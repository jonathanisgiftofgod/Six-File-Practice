package org.updatedFilePractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Payilagam {
	//FileWriting Buffered reader buffered writer
	//Update the latest word content
	//Lines Count, sentence count, words count
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Britto\\Desktop\\Joseph\\test.txt");
		FileWriter fWritter;
		try {
			fWritter = new FileWriter(file, true);
			BufferedWriter bWriter = new BufferedWriter(fWritter);
			bWriter.write("Tamil");
			bWriter.newLine();
			bWriter.write("English");
			bWriter.newLine();
			bWriter.write("Mathematics");

			bWriter.flush();
			bWriter.close();

			FileReader fReader = new FileReader(file);
			BufferedReader bReader = new BufferedReader(fReader);
			String line = bReader.readLine();
			int lineCount = 0;
			int sentenceCount = 0;
			int wordsCount = 0;
			while(line!=null) {
				String[] sentence = line.split("[.]");
				sentenceCount = sentenceCount+sentence.length;
				String[] words = line.split(" ");
				wordsCount = wordsCount+words.length;
				lineCount++;
				wordsCount++;
				System.out.println(line);
				line = bReader.readLine();
			}
			System.out.println("lines Count: "+lineCount);
			System.out.println("sentence Count: "+sentenceCount);
			System.out.println("words count " + wordsCount);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
