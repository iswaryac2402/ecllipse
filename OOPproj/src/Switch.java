public class Switch {

	public void demoSwitch() {
		int number = 1;
		switch (number) {
		case 2:
			System.out.println("papa");
			break;
		case 1:
			System.out.println("ish");
		}
	}

	public static void main(String[] args) {
		Switch obj = new Switch();
		obj.demoSwitch();
	}
}
