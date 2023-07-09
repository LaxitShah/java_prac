package collection.streambackup;

import java.util.Random;
import java.util.stream.Stream;

public class StreamDemo4 {

	
	public static void main(String[] args) {
		
		
		Random r = new Random();
		
		
		for(int i=1;i<=20;i++){
			
			int rno = r.nextInt(1000);
			System.out.println(rno);
		}
		
		//generate..
		//() ->callback function
		
		Stream<Integer> randomNo =  Stream.generate(()->(new Random().nextInt(1000)));
		//limit..
		//count 20 
		randomNo.limit(20).forEach(System.out::println);
		//foreach   end.. 50.. 50
		//condtion
		
		
		
		
		
	}
}
