package collection.streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamDemo11 {
/*
 * temp variable  filter comapare
 * 
 * parra
 * 
 * functia4onal programming..
 * 
 * */
	
	public static void main(String[] args) {
		
		Integer maxnum = Stream.of(1,2,3,4,5,6,7,8,9,0).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(maxnum);
		
		Integer minnum = Stream.of(1,2,3,4,5,6,7,8,9,0).min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(minnum);
		
		
	}
}
