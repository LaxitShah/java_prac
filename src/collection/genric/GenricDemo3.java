package collection.genric;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class GenricDemo3 {

	public static void main(String[] args) {

		// TreeSet list = new TreeSet<>();

		HashSet list = new HashSet<>();

		list.add("samir");
		System.out.println("******"); //
		list.add(12);
		list.add(false);
		list.add(12.22f);
		list.add(123456789012l);
		list.add(12345678.22533d);
		list.add('c');

		for (Object o : list) {

			System.out.println(o);
		}

	}
}
