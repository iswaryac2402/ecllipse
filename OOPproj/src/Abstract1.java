
abstract class AbstractClass {
	public abstract void m1();

	public void m2() {
		System.out.println("print value");
	}
}

public class Abstract1 extends AbstractClass {
	public void m2() {
		System.out.println("no value");
	}

	public static void main(String[] args) {
		Abstract1 ob = new Abstract1();
		ob.m2();
	}

}
