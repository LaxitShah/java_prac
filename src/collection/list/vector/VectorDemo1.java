package collection.list.vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		
		
		list.add("java");
		
		

		Vector<String> v1 = new Vector<String>();

		v1.add("java");
		v1.add("python");

		v1.setElementAt("c++", 0);

		v1.set(0, "java");

		for (String s : v1) {

			System.out.println(s);
		}

		Vector<String> v2 = new Vector<>();
		System.out.println("FIRST ELEMENT...." + v1.firstElement());
		System.out.println("last element..." + v1.lastElement());

		v2 = (Vector<String>) v1.clone();

		String elem = v1.elementAt(0);
		System.out.println("element at --> 0 " + elem);
		v1.addElement("PHP");

		System.out.println("***************");
		for (String s : v1) {

			System.out.println(s);
		}
		
		System.out.println("contains"+v1.contains("java"));
		System.out.println("contains all...."+v1.containsAll(list));
		System.out.println("equals method.."+v1.equals(list));
		
		
		

	}
}
