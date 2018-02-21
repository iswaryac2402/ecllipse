
public class TestDemo {
	public Student createStudent(String std_Nr, String std_Name, String std_City) {
		Student object = new Student(std_Nr, std_Name, std_City);
		return object;
	}

	public static void main(String[] args) {
		TestDemo ob = new TestDemo();
		Student s1 = ob.createStudent("20", "Chebrolu", "Ongole");
		System.out.println(s1);

	}

}
