package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

	
	public static void main(String[] args) {
		
		List<String> class1 = new ArrayList<String>();
		class1.add("java");
		class1.add("python");
		class1.add(0, "c");
		class1.set(1, "java8");
		
		
		
		List<String> class2 = new ArrayList<String>();
		class2.add("python");
		class2.add("java");
		
		
		
		System.out.println(class1.equals(class2));
		
		
		/*List<String> tech = new ArrayList<String>();
		tech.addAll(class1);
		tech.addAll(class2);
		*/
		
		for(String s : class1){
			
			System.out.println(s);
		}
		
		
		
	}
}
