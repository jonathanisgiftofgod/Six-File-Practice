package singletonPractice;

public class SingletonMain {
	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		instance1.displayMessage();
		instance2.displayMessage();
	}
}
