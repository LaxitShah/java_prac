package collection.queue;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	
	public static void main(String[] args) {
		
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("raj");
		lhs.add("parth");
		lhs.add("priya");
		lhs.add("akshit");
		lhs.add("akshit");
		lhs.add(null);
		lhs.add(null);
		
		for(String s : lhs){
			
			System.out.println(s);
		}
		
		
	}
}
