package singletonPractice;

public class Singleton {
	
	private static Singleton singleton;
	
	private Singleton() {
		
	}
	public static Singleton getInstance(){
		if(singleton==null) {
			singleton = new Singleton();
		}
		return singleton;		
	}
	public void displayMessage() {
		System.out.println("I have called using singleton");
	}
}
