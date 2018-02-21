package basicprograms;

public class StaticNonstatic {
	static int a = 10, b = 5; // static variables
	int c = 20, d = 15;// Non-static variables

	public static void add() {// static method
		System.out.println("Addition of a and b is :" + (a + b));
	}

	public void substract() {// Non static-method
		System.out.println("substraction of c and d is:" + (a - b));
	}

	public static void main(String[] args) {
		StaticNonstatic.add();// accessing static class members using class name
		// Access Non static class members using object
		StaticNonstatic obj = new StaticNonstatic();
		obj.substract();

	}
}
