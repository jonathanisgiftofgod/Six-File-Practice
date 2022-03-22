package org.greens;

import java.io.File;

public class Excersise7 {
	
	// verify directory available or not
	public static void main(String[] args) {
		File f = new File("E:\\Sele");
		boolean present = f.exists();
		if(present==false) {
			System.out.println("Folder present : " + present);
		}
		else {
			System.out.println("present");
		}
	}
}
