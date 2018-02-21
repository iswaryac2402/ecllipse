
public class Task {
	public int counting(String name) {
		// name = "Hello!how are you";
		int s = name.length();
		return s;
	}

	public static void main(String[] args) {
		Task ob = new Task();
		int s1 = ob.counting("Hello!how are you");
		System.out.println(+s1);
	}

}
