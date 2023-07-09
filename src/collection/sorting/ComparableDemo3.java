package collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Movie implements Comparable<Movie> {

	int id;
	String name;

	public Movie(int id, String name) {

		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Movie o) {

		return name.compareTo(o.name);
	}

}

public class ComparableDemo3 {

	public static void main(String[] args) {

		List<Movie> al = new ArrayList<>();
		
		al.add(new Movie(50, "raz")); //add compareToo
		al.add(new Movie(55, "pk"));
		al.add(new Movie(200, "anand"));
		al.add(new Movie(50, "kyoki"));

		Collections.sort(al);
		
		for (Movie m : al) {

			System.out.println(m.id + " " + m.name);
		}

	}
}
