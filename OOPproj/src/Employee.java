import java.util.ArrayList;
import java.util.List;

public class Employee {
	public int id;
	public String name;
	public String city;

	public Employee(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public String toString() {
		return id + " " + name + " " + city;
	}

	public static void main(String[] args) {
		Employee ob = new Employee(1, "ishwarya", "ongole");
		Employee ob1 = new Employee(2, "navya", "eluru");
		Employee ob2 = new Employee(3, "sneha", "hyb");
		List<Employee> ls = new ArrayList();
		ls.add(ob);

		ls.add(ob1);
		ls.add(ob2);
		// Iterator itr = ls.iterator();
		// while (itr.hasNext()) {
		for (Employee emp : ls)
			System.out.println(emp);
	}
}
