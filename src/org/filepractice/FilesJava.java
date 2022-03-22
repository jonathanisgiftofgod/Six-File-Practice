package org.filepractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilesJava {
	public static void main(String[] args) {
		File ff = new File("C:\\Users\\Britto\\Pictures\\Java\\Day11\\filepractice\\abc1.txt");
		FileWriter fwriter;
		try {
		fwriter = new FileWriter(ff, true);
		BufferedWriter bWriter = new BufferedWriter(fwriter);
		bWriter.write("Tamil");
		bWriter.newLine();
		bWriter.write("English");
		bWriter.newLine();
		bWriter.write("Maths");
		bWriter.flush();
		bWriter.close();
		
		FileReader fReader = new FileReader(ff);
		BufferedReader bReader = new BufferedReader(fReader);
		String line = bReader.readLine();
		int count = 0;
		int sentenanceCount = 0;
		int wordCount = 0; 
		int charCount = 0;
		while(line != null) {
			String[] sentence = line.split("[.]");
			String[] word = line.split(" ");
			
			wordCount = wordCount + word.length;
			sentenanceCount = sentenanceCount + sentence.length;
			charCount = charCount + line.length();
			System.out.println(line);
			line = bReader.readLine();
			count ++;
			
		}
		System.out.println("Line count" +count);
		System.out.println("Sentenance Count" + sentenanceCount);
		System.out.println("Word Count"+ wordCount);
		System.out.println(charCount);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			File f = new File("C:\\Users\\Britto\\Pictures\\Java\\Day11\\filepractice\\abc.txt");
			FileWriter writer = new FileWriter(f);
			BufferedWriter bufferWriter = new BufferedWriter(writer);
			writer.write(65);
			writer.write(" How are you");
			writer.flush();
			writer.close();
			
			FileReader fileReader = new FileReader(f);	
			int output = fileReader.read();
			while(output != -1) {
				System.out.print((char) output);
				output = fileReader.read();
			}
			char[] ch = new char[(int)f.length()];
			System.out.println(+ch.length);
			
		}
			
			catch (IOException e) {
			e.printStackTrace();
		}
	}
}
