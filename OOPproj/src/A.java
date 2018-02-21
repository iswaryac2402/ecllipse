
public class A {
	int a = 10;
	int b;
	boolean s;

	public void m1() {
		System.out.println("print m1");
	}

	static {
		System.out.println("kokoko");
	}

	public static void main(String[] args) {

		A ob = new A();
		ob.m1();
		System.out.println(ob.a + "" + ob.b + ob.s);
	}
}
