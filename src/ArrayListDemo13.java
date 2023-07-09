import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo13 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("x");

		/// interface...
		Iterator itr = al.iterator();

		// boolean
		while (itr.hasNext()) {

			System.out.println(itr.next());
		} // 0 1 2 3

		System.out.println(itr.next());

	}
}
