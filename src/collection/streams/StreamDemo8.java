package collection.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo8 {

	
	public static void main(String[] args) {
		
		
		List<String> names = new ArrayList<String>();
		names.add("Jay");
		names.add("Jayraj");
		names.add("raj");
		names.add("parth");
		names.add("sneha");
		names.add("harit");
		names.add("akshit");
		names.add("kishan");
		names.add("radha");
		
		
		names.stream().filter((p)->p.length()>3).sorted().map(String::toUpperCase).forEach(System.out::println);
		
	}
}
