
public class Construct {
	int lenght;
	int breadth;
	int Area;

	Construct(int b, int l) {
		this.lenght = b;
		this.breadth = l;
		Area = (lenght * breadth);
		System.out.println(Area);
	}

	public static void main(String[] args) {
		Construct object = new Construct(5, 6);

	}
}