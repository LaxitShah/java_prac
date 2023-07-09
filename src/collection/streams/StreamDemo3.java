package collection.streams;

import java.util.Random;
import java.util.stream.Stream;

public class StreamDemo3 {

	public static void main(String[] args) {
		
		Stream<Integer> rno = Stream.generate(()->(new Random()).nextInt(1000));
		
		rno.limit(10).forEach(System.out::println);
		
		
		
	}
}
