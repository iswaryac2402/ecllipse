import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Wrap {
	public static void main(String[] args) {
		List ls = new ArrayList();
		Wrap ob = new Wrap();
		ls.add("hy");
		ls.add("hello");
		ls.add("hi");
		Iterator itr = ls.iterator();
		int i = Integer.parseInt(itr);
		while (itr.hasNext())
			System.out.println(itr.next());
	}

}
