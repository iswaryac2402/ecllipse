
public class Circle {
	double diametre;
	double radius = 4;
	double areaofcircle;

	public void area() {
		areaofcircle = (Math.PI * radius * radius);
		System.out.println("The area of circle is :" + areaofcircle);
	}

	public static void main(String[] args) {
		Circle c = new Circle();
		c.radius = 4;
		c.area();
	}
}
