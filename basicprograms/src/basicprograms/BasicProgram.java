package basicprograms;

public class BasicProgram {
	int number = 10;
	String name = "Hello";

	public void displayname() {
		System.out.println("Hello");
	}

	public BasicProgram(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	public static void main(String[] args) {
		BasicProgram object = new BasicProgram(10, "Hello");
		object.displayname();
	}

}
