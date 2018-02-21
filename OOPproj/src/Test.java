
public class Test {
	public static void main(String[] args) {
		BICYCLE bicycle = new BICYCLE();

		bicycle.changegear(2);
		bicycle.changecadence(10);
		bicycle.name = "hero";
		bicycle.printdetails();
		System.out.println();
		BICYCLE bicycle2 = new BICYCLE();
		bicycle2.changegear(3);
		bicycle2.changecadence(20);
		bicycle2.name = "phoenix";
		bicycle2.printdetails();

	}

}
