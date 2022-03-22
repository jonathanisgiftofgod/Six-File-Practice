package org.greens;

import java.io.File;

public class Excersise10 {
	// verify directory available or not
	public static void main(String[] args) {
		File f = new File("E:\\Old Backup Laptop\\D");
		File[] listFiles = f.listFiles();
		for (File x : listFiles) {
			System.out.println(x);
		}
	}
}
