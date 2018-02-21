import java.util.Set;
import java.util.TreeSet;

public class TestPractice {

	public static void main(String[] args) {
		Set<Practice> st2 = new TreeSet<>();
		Practice pr = new Practice();
		Practice pr1 = new Practice();
		Practice pr2 = new Practice();
		st2.add(pr);
		st2.add(pr1);
		st2.add(pr2);
		for (Practice pt : st2) {
			System.out.println(pt);
		}
	}

}
