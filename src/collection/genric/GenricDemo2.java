package collection.genric;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenricDemo2 {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("samir");
		list.add(12);
		list.add(false);
		list.add(12.22f);
		list.add(123456789012l);
		list.add(12345678.22533d);
		list.add('c');

		//
		for (Object o : list) {

			System.out.println(o.toString().concat("***"));
		}

		// iterator interface...

		Iterator itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());

		}

	}
}
