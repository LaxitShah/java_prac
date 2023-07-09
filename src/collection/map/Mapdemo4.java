package collection.map;

import java.util.HashMap;
import java.util.Map;

class Movies {

	int mId;
	String mName;

	public Movies(int mId, String mName) {

		this.mId = mId;
		this.mName = mName;
	}

}

public class Mapdemo4 {

	public static void main(String[] args) {

		HashMap<Integer, Movies> movies = new HashMap<>();
		HashMap<Movies, Integer> moviemap = new HashMap<>();
		moviemap.put(new Movies(101, "raZ"), 1);
		moviemap.put(new Movies(102, "raZi"), 2);

		for (Map.Entry m : moviemap.entrySet()) {

			System.out.println(m.getKey() + "-" + m.getValue());
			Movies m3 = (Movies) m.getKey();
			System.out.println(m3.mId+"--"+m3.mName+ "-"+m.getValue()); 
			
		}
		
		System.out.println();
		System.out.println("*********************");

		movies.put(1, new Movies(101, "PK"));
		movies.put(2, new Movies(102, "KP"));

		// Movies m1 = new Movies(101, "PK");

		System.out.println(movies.containsValue(new Movies(101, "PK")));

		for (Map.Entry m : movies.entrySet()) {

			System.out.println(m.getKey() + "" + m.getValue());
			Movies movie = (Movies) m.getValue();
			System.out.println(movie.mName);

		}

	}
}
