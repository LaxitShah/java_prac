package collection.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo14 {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,2,3,4,5,6,7,8,9,2,3,4,9));
		
		List<Integer> numbers2 = numbers.stream().distinct().collect(Collectors.toList());
		Set<Integer> numbers3 = numbers.stream().distinct().collect(Collectors.toSet());
		
		System.out.println(numbers2);
		System.out.println(numbers3);
		
		List<String> names = new ArrayList<>(Arrays.asList("samir","samir","raj","parth","deven","poojan"));
		
		List<String> names1 = names.stream().distinct().collect(Collectors.toList());
		System.out.println(names1);
				
		
		
	}
}
