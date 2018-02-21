package basicprograms;

public class TestEncapsulation {
	public static void main(String[] args) {
		Encapsulation object = new Encapsulation();
		object.setI(5);
		object.setName("ish");
		object.setA('a');
		System.err.println(object.getI() + "" + object.getName() + "" + object.getA());

	}
}
