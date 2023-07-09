package collection.map;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Emp {

	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Emp(int id) {

		this.id = id;
	}

}

public class MapDemo1 {

	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<>();

		// Map<String, Emp> emp = new TreeMap<>();
		// Map<Emp, String> emp1 = new TreeMap<>();
		// compile
		// runtime excption
		// get output

		map.put(10, "rajesh");
		map.put(5, "dilip");
		map.put(12, "shahid");
		map.put(1, "shahrukh");
		map.put(2, "amit");
		map.put(3, "hritik");
		map.put(3, "roshan");
		map.put(4, null);

		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("hritik"));

		// map.replace(44, "aamir");
		// map.replace(2, "amit", "jaya");

		// System.out.println("remove.."+map.remove(12));
		System.out.println("remove..." + map.remove(12, "shahid"));

		map.putIfAbsent(1, "manoj");

		Set<Integer> keys = map.keySet();

		for (int key : keys) {

			System.out.println(key);

		}

		/*
		 * List<String> list = (List<String>) map.values();
		 * 
		 * for(String s : list){
		 * 
		 * System.out.println(s); }
		 */

		// map --? key value entryset --> set
		// getkey and getvalue
		// m is an instance of entry interface
		// entry is inner interface of map interface

		for (Map.Entry m : map.entrySet()) {

			System.out.println(m.getKey() + "-" + m.getValue());

		}

	}
}
