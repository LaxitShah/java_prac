package collection.streambackup;

import java.util.stream.Stream;

public class StreamDemo3 {

	
	public static void main(String[] args) {
		
		/*
		 * s.a.m.i.r
		 * 
		 * */
		
//		String name = "s.a.m.i.r";
//		
//		String names [] = name.split("\\.");
//		for(String s : names){
//			
//			System.out.println(s);
//		}
		
		Stream<String> stream = Stream.of("s.a.m.i.r".split("\\.")); //buffer...
		stream.forEach(p->System.out.println(p));
		
		
		
	}
}
