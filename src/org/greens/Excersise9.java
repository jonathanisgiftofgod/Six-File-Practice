package org.greens;

import java.io.File;

public class Excersise9 {
	// Create sub directory D:\Java\Selenium\Material.
	public static void main(String[] args) {
		File f = new File("E:\\Sele\\material");
		boolean present = f.exists();
		if(present==false) {
			boolean exists = f.mkdir();
			System.out.println("Folder present : " + exists);
		}
		else {
			System.out.println("present");
		}
	}
}
