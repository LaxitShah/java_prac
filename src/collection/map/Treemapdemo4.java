package collection.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Treemapdemo4 {

	public static void main(String[] args) {

		TreeMap<String, TreeSet<String>> map = new TreeMap<>();
		TreeSet<String> ts = new TreeSet<>();
		ts.add("java");
		ts.add("c++");
		ts.add("DBMs");

		TreeSet<String> ts1 = new TreeSet<>();
		ts1.add("pyhon");
		ts1.add(".net");
		ts1.add("php");

		map.put("m", ts);
		map.put("a", ts1);

		NavigableMap<String, TreeSet<String>> nmap = map.descendingMap();

		for (Map.Entry m : nmap.entrySet()) {

			TreeSet<String> t = (TreeSet<String>) m.getValue();

			for (String s : t) {

				System.out.println(m.getKey() + "--" + s);
			}

		}

	}
}
