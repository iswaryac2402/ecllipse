import java.util.Scanner;

public class ScannerTest {
	int rollno;
	String name;

	public static void main(String[] args) {
		Scanner object = new Scanner(System.in);
		System.out.println("Enter the rollno");
		int rollno = object.nextInt();
		System.out.println("Enter your name");
		String name = object.next();
		System.out.println("rollno:" + rollno);
		System.out.println("name:" + name);

	}
}