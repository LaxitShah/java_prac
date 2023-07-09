package collection.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo5 {

	
	public static void main(String[] args) {
		
		
		
		Stream<String> stream = Stream.of("a#b#C#d#e".split("\\#"));
		stream.forEach(p->System.out.println(p));
		
		
		IntStream stream1 = "123456_abcd#dxyA".chars();
		stream1.forEach(p->System.out.println(p));
		
	}
}
