package GreenExcersises;

import java.io.File;

public class Main{
public static void main(String[] args) {
		try {
			throw new MyException("GeeksGeeks");
		} catch (MyException ex) {
			System.out.println("caught");
			System.out.println(ex.getMessage());
		}
	}

}
