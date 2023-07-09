package collection.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo15 {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,4,5,6,1,2));
		
		Map<Integer, Long> elment = numbers.stream().collect(Collectors.toMap(Function.identity(), v->1L,Long::sum));
		System.out.println(elment);
		
		
	}
}
