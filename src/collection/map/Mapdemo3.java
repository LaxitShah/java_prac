package collection.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Mapdemo3 {

	public static void main(String[] args) {

		TreeMap<String, String> maps = new TreeMap<>();
		
		//
		maps.put("a", "raj"); // object 1
		maps.put("x", "avijayraj");
		maps.put("p", "parth");
		maps.put("n", "manoj");

		// navigable map
		// na
		NavigableMap<String, String> nmpa = maps.descendingMap();

		for (Map.Entry m : nmpa.entrySet()) {

			System.out.println(m.getKey() + "-" + m.getValue());
		}

	}
}
