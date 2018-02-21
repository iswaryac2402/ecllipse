import java.util.HashMap;
import java.util.Map;

public class Eg {
	int number;
	String name;

	public Eg(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public String toString() {
		return number + " " + name;
	}

	public static void main(String[] args) {
		Map<Integer, Object> mp = new HashMap<>();
		Eg b1 = new Eg(1, "obj1");
		Eg b2 = new Eg(2, "obj2");
		Eg b3 = new Eg(3, "obj3");

		mp.put(1, b1);
		mp.put(2, b2);
		mp.put(3, b3);
		for (Map.Entry et : mp.entrySet()) {
			System.out.println(et.getKey() + " " + et.getValue());
		}

	}

}
