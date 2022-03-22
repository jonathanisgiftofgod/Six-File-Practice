package org.filepractice;

import java.io.File;
import java.io.IOException;

public class NewFilePractice {
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
		//		File f = new File("C:\\Users\\Britto\\Desktop\\JAVA\\test.txt");
		//		boolean present = f.exists();
		//		if (present==false) {
		//			try {
		//				boolean created = f.createNewFile();
		//				System.out.println("File Created " +created);
		//			} catch (Exception e) {
		//				e.printStackTrace();
		//			}
		//		}
		//		File f = new File("C:\\Users\\Britto\\Desktop\\JAVA\\BrittoNancyJonathan\\ test.txt");
		//		f.delete();
		//		boolean exists = f.exists();
		//		System.out.println("Present" + exists);
		//		File f = new File("C:\\Users\\Britto\\Desktop\\JAVA\\test.txt");
		//		f.createNewFile();
		//		File ff = new File("C:\\Users\\Britto\\Desktop\\JAVA\\jona.txt");
		//		boolean renameSuccess = f.renameTo(ff);
		//		System.out.println("RenameSuccess" + renameSuccess);
		//		String name = ff.getName();
		//		System.out.println("File Name " + name);
		//		System.out.println(ff.canExecute());
		//		System.out.println(ff.canRead());
		//		System.out.println(ff.canWrite());
		File f = new File("C:\\Users\\Britto\\Desktop\\JAVA");
		String[] list = f.list();

		File[] listFiles = f.listFiles();
		for (File y : listFiles) {
			if(y.isFile()) {
				String name = y.getName();		
				int lastDot = name.lastIndexOf(".");
				String extension = name.substring(lastDot+1);
				if(extension.equals("txt"))
					System.out.println(f +" size " + f.length());
				
			}
		}
	}
}
