package collection.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo7 {

	
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
		
		
		names.stream().filter((s)->s.startsWith("j".toUpperCase()) && s.endsWith("y")).map(String::toUpperCase).forEach(System.out::println);
		
		
	}
}
