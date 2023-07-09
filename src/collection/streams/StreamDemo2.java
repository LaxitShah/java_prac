package collection.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream.forEach(p -> System.out.println(p));

		Stream<Integer> stream1 = Stream.of(new Integer[] { 1, 2, 34, 5, 6, 7, 87, 8 });
		stream1.forEach(p -> System.out.println(p));

		List<String> list = new ArrayList<String>();
		list.add("samir");
		list.add("raj");
		list.add("parth");
		
		Stream<String> names = list.stream();
		names.forEach(p->System.out.println(p));
		

	}
}
