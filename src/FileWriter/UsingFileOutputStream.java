package FileWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputStream {
	public static void main(String[] args) throws IOException {
		String location = "Using FOS.txt";
		String content = "Jonathan is a super star";
		
		FileOutputStream outputStream = new FileOutputStream(location);
		byte[] writeThis = content.getBytes();
		outputStream.write(writeThis);
		outputStream.close();
		
	}
}
