
import java.util.LinkedList;
import java.util.List;

public class Stu {
	public int stuid;
	public String stuname;
	public String stucity;

	public Stu(int stuid, String stuname, String stucity) {
		this.stuid = stuid;
		this.stuname = stuname;
		this.stucity = stucity;
	}

	public static void main(String[] args) {
		List<Stu> ob = new LinkedList<>();
		Stu s = new Stu(5, "ishwarya", "ongole");
		Stu s1 = new Stu(6, "navya", "eluru");
		Stu s2 = new Stu(7, "kavya", "hyb");
		ob.add(s);
		ob.add(s1);
		ob.add(s2);
		// for (Stu st : ob) {
		// System.out.println(st);
		// }
		// Iterator<Stu> it = ob.iterator();
		// while (it.hasNext()) {
		// System.out.println(it.next());
		// }
		for (int i = 0; i < ob.size(); i++) {

			System.out.println(ob.get(i));
		}

	}

	public String toString() {
		return stuid + " " + stuname + " " + stucity;

	}

}
