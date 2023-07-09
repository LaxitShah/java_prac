package collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {

	
	public static void main(String[] args) {
		
		//set // treeset
		//set -->sorting..

		Set<String> set = new HashSet<>();
		set.add("java");
		set.add("python");
		set.add("dbms");
		set.add("c");
		set.add(".net");
	

			

		for(String s:set){
			
			System.out.println(s);
		}
		
		
		
		
		
		
		
	}
}
