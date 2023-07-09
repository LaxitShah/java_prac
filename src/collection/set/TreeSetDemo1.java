package collection.set;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<>();

		ts.add("a");
		ts.add("java");
		ts.add("python");
		ts.add("c++");
		ts.add("dbms");
		ts.add("php");
		ts.add("perl");
		ts.add("mean");

		for (String s : ts) {

			System.out.println(s);
		}

		// System.out.println(ts.remove("java"));

		System.out.println("********");

		for (String s : ts) {

			System.out.println(s);
		}
		System.out.println("->" + ts.first());
		// System.out.println("pool first "+ts.pollFirst());
		System.out.println("->" + ts.first());

		System.out.println(" last method -->" + ts.last());
		// System.out.println("pool last.."+ts.pollLast());
		System.out.println(" last method -->" + ts.last());

		NavigableSet<String> ns = ts.descendingSet();
		for (String ds : ns) {

			System.out.println(ds);
		}

		System.out.println("***********************");
		SortedSet<String> ss = ts.subSet("c++", "mean");
		for (String sort : ss) {
			System.out.println(sort);
		}

		System.out.println("floor -->" + ts.floor("a"));

		System.out.println("*************************");
		ns = ts.tailSet("php", true);
		
		

		for (String ds : ns) {

			System.out.println(ds);
		}
		
		
		System.out.println("-------------");
		
		System.out.println(ts.higher("p"));
		
		Object obj [] = ts.toArray();
		//String names [] = (String[])ts.toArray();
		
		
		String x = null;
		for(int i=0;i<obj.length;i++){
			
			x = (String) obj[i];
			x= x.concat("..");
			System.out.println("x ="+x);
			System.out.println(obj[i].toString());
		}
		
		
		
		//System.out.println(sets.toString());

	}
}
