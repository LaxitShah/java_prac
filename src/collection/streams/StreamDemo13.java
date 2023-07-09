package collection.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 * 
 * */
public class StreamDemo13 {

	/*
	 * 1,2,3,4,3,4,5,6,7,1,8,9
	 * 
	 * */
	
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
		
		Optional<String>reduce = names.stream().reduce((s1,s2)->s1+"#"+s2);
		reduce.ifPresent(System.out::println);
		
		
	}
}
