package collection.set;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class SetDemo2 {

	
	public static void main(String[] args) {
	
		
		TreeSet<String> ts = new TreeSet<>();
		ts.add("java");
		ts.add("python");
		ts.add("c++");
		ts.add("java");
		
		ArrayList<String> al[]  = (ArrayList[])ts.toArray();
		System.out.println(al);
		
		
	}
}
