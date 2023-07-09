package collection.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo6 {

	
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=20;i++){
			
			list.add(i);
		}
		Stream<Integer> stream = list.stream();
		Integer[] evenno = stream.filter(i -> i %2 ==0).toArray(Integer[]::new);
		
		for(int i=0;i<evenno.length;i++){
			System.out.println(evenno[i]);
		}
	}
}
