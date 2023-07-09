package collection.streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamDemo12 {

	
	public static void main(String[] args) {
		
		//
		String max = Stream.of("samir","raj","parth","akshit").max(Comparator.comparing(String::valueOf)).get();
		System.out.println(max);
	}
	
}
