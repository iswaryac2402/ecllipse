import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TestStuad {

	public static void main(String[] args) {
		List<Student> al = new ArrayList<>();
		Student ob = new Student(5, "ishwarya", "ongole");
		Student ob1 = new Student(6, "navya", "eluru");
		Student ob2 = new Student(7, "kavya", "hyb");
		al.add(ob);
		al.add(ob1);
		al.add(ob2);
		// for (Student st : al) {
		// System.out.println(st);
		// }
		List<Address> ls = new LinkedList<>();
		Address ad = new Address(617, "Caswycktree", 30022);
		Address ad1 = new Address(622, "johnscreek", 25023);
		Address ad2 = new Address(321, "franklin", 64081);
		ls.add(ad);
		ls.add(ad1);
		ls.add(ad2);
		// for (Address st1 : ls) {
		// System.out.println(st1);
		// }
		Map<Student, Address> mp = new HashMap<>();
		mp.put(ob, ad);
		mp.put(ob1, ad1);
		mp.put(ob2, ad2);
		for (Map.Entry et : mp.entrySet()) {
			System.out.println(et.getKey() + " " + et.getValue());
		}
	}
}
