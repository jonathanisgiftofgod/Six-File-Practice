package org.filepractice;

import java.io.File;
import java.io.IOException;

public class FilePractice {
	public static void main(String[] args) throws IOException {
//		File f = new File("C:\\Users\\Britto\\Desktop\\Britto\\Nancy\\Jonathan");
//		boolean present = f.exists();
//		System.out.println("Folder present " + present);
//		if(present==false) {
//			f.mkdirs();
//			f.exists();
//			boolean exists = f.exists();
//			System.out.println(exists);
//		}
		
		File f = new File("C:\\Users\\Britto\\Desktop\\JAVA\\Britto\\NancyJonathan.txt");
		boolean present = f.exists();
		try {
			boolean created = f.createNewFile();
			System.out.println("File Created " + created);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
		/*File f = new File("C:\\Users\\Britto\\Pictures\\Java\\Day11\\filepractice\\test.txt");
		boolean presents = f.exists();
		System.out.println("Folder present " +presents);
		if(presents==false) {
			try { 
				boolean created = f.createNewFile();
				System.out.println("File created " + created );
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}*/
		/*File f = new File("C:\\Users\\Britto\\Pictures\\Java\\Day11\\filepractice\\test.txt");
		f.delete();
		boolean presents = f.exists();
		System.out.println("File present " + presents );*/
		/*File f = new File("C:\\Users\\Britto\\Pictures\\Java\\Day11\\filepractice\\test.txt");
		f.createNewFile();
		File ff = new File("C:\\Users\\Britto\\Pictures\\Java\\Day11\\filepractice\\newtest.txt");
		boolean renameSuccess = f.renameTo(ff);
		System.out.println("renameSuccess " + renameSuccess);
		String name = ff.getName();
		System.out.println(name);
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());*/
		//		File f = new File("C:\\Users\\Britto\\Pictures\\Java");
		//		String[] list = f.list();
		//		for (int i = 0; i < list.length; i++) {
		//			System.out.println(list[i]);
		//		}
		//		for (String x : list) {
		//			System.out.println(x);
		//		}
//		File f = new File("C:\\Users\\Britto\\Pictures\\Java");
//		File[] listFiles = f.listFiles();
//		for (File x : listFiles) {
//			if(x.isFile()) {
//				String name = x.getName();
//				int lastDot = name.lastIndexOf(".");
//				String extension = name.substring(lastDot+1);
//				System.out.println(extension);
//
//			}
//		}
