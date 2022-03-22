package org.greens;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

public class Excersise6 {
	// find the duplicate words
	public static void main(String[] args) {
		File f = new File("C:\\Users\\Britto\\Desktop\\Joseph\\Jonathan\\Nancy\\abcd.txt");
		try {
			f.createNewFile();
			FileWriter fWrite = new FileWriter(f,true);
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
			bWrite.write("I like ISUZU.");
			bWrite.newLine();
			bWrite.write("Jonathan is a good boy.");
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
			HashMap<String, Integer> hm = new HashMap<>();
			while (line!=null) {
				String[] words = line.split(" ");
				for (String x : words) {
					if (hm.get(x)!=null) {
						hm.put(x, hm.get(x)+1);
					} else {
						hm.put(x, 1);
					}
				}
				line = bRead.readLine();
			}
			Iterator<String> x = hm.keySet().iterator();
			while (x.hasNext()) {
				String temp = x.next();
				if (hm.get(temp)>1) {
					System.out.println(temp+" no. of times appeared "+hm.get(temp));
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
