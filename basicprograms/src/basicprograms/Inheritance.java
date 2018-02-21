package basicprograms;

public class Inheritance {
	static int a = 10, b = 5;
	int c = 20, d = 15;

	public void add() {
		System.out.println("Addition of a and b is :" + (a + b));
	}

	public void substract() {
		System.out.println("substraction of c and d is:" + (c - d));
	}

	public static void main(String[] args) {
		Inheritance obj = new Inheritance();
		obj.add();
		obj.substract();
	}

}
