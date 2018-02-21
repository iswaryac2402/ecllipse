import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class Collect {

	public static void main(String[] args) {
		List<Integer> names = new ArrayList<>();
		names.add(2);
		names.add(3);
		names.add(4);
		// Iterator itr = names.iterator();
		// while (itr.hasNext()) {
		// System.out.println(itr.next());
		for (Integer print : names) {
			System.out.println(print);
		}
	}
}
