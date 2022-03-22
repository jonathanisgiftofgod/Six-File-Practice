package org.greens;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExcersise {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\Britto\\Desktop\\Joseph\\Green\\excersise.txt");
		try {
			f.createNewFile();
			FileWriter fWrite = new FileWriter(f);
			BufferedWriter bWrite = new BufferedWriter(fWrite);
			bWrite.write(".");
			bWrite.newLine();
			bWrite.write("1. I love you");
			bWrite.newLine();
			bWrite.write("2. He goes to school.");
			bWrite.newLine();
			bWrite.write("3. I went to park.");
			bWrite.newLine();
			bWrite.write("4. I read novel.");
			bWrite.newLine();
			bWrite.write("5. The birds are flying.");
			bWrite.newLine();
			bWrite.write("6. How are you.");
			bWrite.newLine();
			bWrite.write("7. I am learning java.");
			bWrite.newLine();
			bWrite.write("8. Excersise everyday.");
			bWrite.newLine();
			bWrite.write("9. knowledge is power.");
			bWrite.newLine();
			bWrite.write("10. Old is gold.");
			bWrite.flush();
			bWrite.close();

			FileReader fRead = new FileReader(f);
			BufferedReader bRead = new BufferedReader(fRead);
			String line = bRead.readLine();
			int wordsCount = 0;
			int contains = 0;
			int sentenceCount = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the text");
			String text = sc.next();
			while(line!=null) {
				String[] words = line.split(" ");
				String[] sentence = line.split(".");
				for (String x : words) {
					if (x.contains(text)) {
						contains++;
					} else {

					}
				}
				sentenceCount++;
				if(sentenceCount%2==0) {
					System.out.println(line);
					
				}
				line = bRead.readLine();				
			}
			
			System.out.println(sentenceCount);
			if (contains>0) {
				System.out.println("That word contains");
			} else {
				System.out.println("not contains");
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}


}































//public static void main(String[] args) {
//	File f = new File("C:\\Users\\Britto\\Desktop\\Joseph\\Green\\excersise.txt");
//	try {
//		f.createNewFile();
//		FileWriter write = new FileWriter(f);
//		BufferedWriter bwriter = new BufferedWriter(write);
//		bwriter.write(" .");
//		bwriter.newLine();
//		bwriter.write("1. I love you.");
//		bwriter.newLine();
//		//		
//		FileReader reader = new FileReader(f);
//		BufferedReader breader = new BufferedReader(reader);
//		String line = breader.readLine();
//		int sentenceCount = 0;
//		int wordCount = 0;
//		int contains = 0;
//		while (line!=null) {
//			String[] sentence = line.split("[.]");
//			sentenceCount = sentenceCount+sentence.length;
//			String[] words = line.split(" ");
//			for (String x : words) {
//				if (x.contains("java")) {
//					contains++;
//				} else {
//					
//				}
//			}
//			
//			wordCount = wordCount+words.length;
//			sentenceCount++;
//			wordCount++;
//			line = breader.readLine();
//			System.out.println(line);
//			
//		}
//		System.out.println("sentence count "+sentenceCount);
//		System.out.println("words count "+wordCount);
//		if (contains>0) {
//			System.out.println("Java contains? " + "contains");
//		} else {
//			System.out.println("Java contains? " + "Not contains");
//		}
//		
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
//}
