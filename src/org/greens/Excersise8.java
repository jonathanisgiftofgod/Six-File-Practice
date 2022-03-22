package org.greens;

import java.io.File;

public class Excersise8 {
	// verify directory available or not, if not, create a new folder
	public static void main(String[] args) {
		File f = new File("E:\\Sele\\");
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
