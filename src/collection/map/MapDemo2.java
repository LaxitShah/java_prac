package collection.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo2 {

	public static void main(String[] args) {

		TreeMap<Integer, List<String>> map = new TreeMap<>();
		List<String> list1 = new ArrayList<String>();
		list1.add("inception");
		list1.add("titanic");
		list1.add("FNF");
		list1.add("The Book");

		List<String> list2 = new ArrayList<>();
		list2.add("money heiest");
		list2.add("stranger things");
		list2.add("Game of Thrones");

		List<String> list3 = new ArrayList<>();
		list3.add("PINK");
		list3.add("Thapad");
		list3.add("YJHD");

		map.put(1, list1);
		map.put(2, list2);
		map.put(3, list3);

		for (Map.Entry m : map.entrySet()) {

			//System.out.println(m.getKey() + " -" + m.getValue());

			List<String> list = (List<String>) m.getValue();
			for (String s : list) {
				System.out.println(s);
			}

		}

	}
}
