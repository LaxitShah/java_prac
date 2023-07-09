package collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

/*
 *  HashSet Demo.....
 * 
 * */

class Book {

}

public class HashSetDemo1 {

	public static void main(String[] args) {

		HashSet<Book> hs1 = new HashSet<>();
		hs1.add(new Book());

		HashSet<String> hs = new HashSet<>();

		hs.add("java");
		hs.add("python");
		hs.add("c++");
		hs.add("php");
		hs.add("data");
		hs.add("swift");
		hs.add("android");
		hs.add("android");// 001 001...
		hs.add(null);
		hs.add(null);

		/*
		 * for (String s : hs) {
		 * 
		 * System.out.println(s); }
		 */

		TreeSet<String> ts = new TreeSet<>();
		ts.add("x");
		ts.add("y");

		List<String> list = new ArrayList<String>();
		list.add("perl");
		list.add(".net");
		list.add("perl");
		list.add("perl");

		hs.addAll(ts);
		hs.addAll(list);

		System.out.println(hs.toString());
		System.out.println(hs.remove("data"));

		HashSet<String> clonehs = (HashSet<String>) hs.clone();
		
		
		
		for (String s : clonehs) {

			System.out.println(s);
		}

	}
}
