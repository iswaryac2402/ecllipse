import java.util.Scanner;

public class DemoSwitch {
	int number;

	public void demoSwitch() {
	switch(number) {
	Scanner obj=new Scanner(System.in);
			System.out.println("Enter the number");
			int number=obj.nextInt();
	case0:
		System.out.println("zero");
	case1:
		System.out.println("one");
	}
	}

	public static void main(String[] args) {
		DemoSwitch object = new DemoSwitch();
		object.demoSwitch();
	}
}
