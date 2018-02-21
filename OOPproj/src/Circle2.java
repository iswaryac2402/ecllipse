
public class Circle2 {
	private double length = 5;
	private double breadth = 6;
	private double height = 8;
	private double area;

	private void volumearea() {
		length = 6;
		breadth = 10;
		height = 2;
		area = length * breadth * height;
		System.out.println("The area of volume is :" + area);
	}

	public static void main(String[] args) {
		Circle2 out = new Circle2();
		Circle2 in = new Circle2();
		out.volumearea();
		in.volumearea();
	}
}
