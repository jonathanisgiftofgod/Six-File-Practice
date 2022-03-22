package FileWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Practice {
	public static void main(String[] args) {
		try {
			File f = new File("C:\\Users\\Britto\\eclipse-workspace\\FilePractice\\UsingBufferedWriter.txt");
			FileReader fRead = new FileReader(f);
			BufferedReader bRead = new BufferedReader(fRead);
			String line = bRead.readLine();
			while(line!=null) {
				String[] sentence = line.split("[.]");
				for (String x : sentence) {
					System.out.println(x);
				}
				line = bRead.readLine();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
