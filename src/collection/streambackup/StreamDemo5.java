package collection.streambackup;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo5 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 9, 9, 010, 29021, 2);
		//list.stream().filter(p -> p % 2 == 0).forEach(System.out::println);  //print...
		//list store...
		
		List<Integer> evens =  list.stream().filter(p->p%2==0).collect(Collectors.toList());
		System.out.println(evens);
		
		
		

	}
}
