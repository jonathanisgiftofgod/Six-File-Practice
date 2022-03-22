package org.greens;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Excersise3 {
	// row count
	public static void main(String[] args) {
		File f = new File("C:\\Users\\Britto\\Desktop\\Joseph\\Jonathan\\Nancy\\abcd.txt");
		try {
			f.createNewFile();
			FileWriter fWrite = new FileWriter(f);
			BufferedWriter bWrite = new BufferedWriter(fWrite);
			bWrite.write("My name is Jonathan.");
			bWrite.newLine();
			bWrite.write("I am studying 3rd standard b section.");
			bWrite.newLine();
			bWrite.write("My mother name is Nancy Curie Abihail.");
			bWrite.newLine();
			bWrite.write("My father name is Britto Joseph.");
			bWrite.newLine();
			bWrite.write("I like Maths.");
			bWrite.newLine();
			bWrite.write("My like ISUZU.");
			bWrite.newLine();
			bWrite.write("Jonathan is a good boy");
			bWrite.newLine();
			bWrite.write("Nancy is a good girl.");
			bWrite.newLine();
			bWrite.write("Britto is a good boy.");
			bWrite.newLine();
			bWrite.write("I am learning java.");
			bWrite.newLine();

			bWrite.flush();
			bWrite.close();
		
			FileReader fRead = new FileReader(f);
			BufferedReader bRead = new BufferedReader(fRead);
			String line = bRead.readLine();
			int sentenceCount = 0;
			while (line!=null) {
				String[] sentence = line.split("[.]");
				for (String x : sentence) {
					System.out.println(x);
					sentenceCount++;
				}
				line = bRead.readLine();				
			}
			System.out.println("row count "+ sentenceCount);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
