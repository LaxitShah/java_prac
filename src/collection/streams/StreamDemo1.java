package collection.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {

	
	public static void main(String[] args) {
		
		
		List<String> series =Arrays.asList("sacred games","mirzapur","scam 1992","breath","stranger Things","sai");
		
		List<String> result = series.stream().sorted().filter(res->res.startsWith("s")).collect(Collectors.toList());
		
		System.out.println(result);
		
		List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,7,57);
		//map..
		List<Integer> square = number.stream().map(res->res * res).collect(Collectors.toList());
		System.out.println(square);
		
		
	}
}
