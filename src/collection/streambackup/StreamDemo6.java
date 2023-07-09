package collection.streambackup;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo6 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 900, 0, 0, 12, 23);
		
		
		List<Integer> ev = list.stream().filter(p -> p % 2 == 0).map(p->p * p).collect(Collectors.toList());
		
		System.out.println(ev);
	}
}
