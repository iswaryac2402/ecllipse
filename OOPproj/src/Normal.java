
public class Normal {
	static boolean found = false;
	static int i = 10;

	public static void main(String[] args) {
		if (i == 10) {
			found = true;
		}
		if (found) {
			System.out.println("found monkey");
		} else {
			System.out.println("escaped!!");
		}
	}
}
