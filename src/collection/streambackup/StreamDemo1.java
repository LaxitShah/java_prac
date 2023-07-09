package collection.streambackup;

import java.util.stream.Stream;

public class StreamDemo1 {

	
	public static void main(String[] args) {
		
		/*
		 * video streaming
		 * of-->create stream
		 * */
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,89,0,10);
		stream.forEach(p->System.out.println(p));
		
		Stream<Integer> stream1 = Stream.of(new Integer[]{1,2,3,4,5,6,78,89,9});
		stream1.forEach(p->System.out.println(p));
				
		
		
		
		
	}
}
