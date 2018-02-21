package basicprograms;

public class TestInheritance extends Inheritance {
	int a = 100, b = 200;

	public void add() {

		System.out.println("Addition of a and b is :" + (a + b));
	}

	public static void main(String[] args) {
		Inheritance obj = new Inheritance();
		obj.add();
		TestInheritance obj1 = new TestInheritance();
		obj1.add();

	}
}
