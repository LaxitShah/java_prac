package collection.list.vector;

import java.util.List;
import java.util.Vector;

public class VectorDemo2 {

	
	public static void main(String[] args) {
		
		Vector<String> v1 = new  Vector<>();
		v1.add("java");
		v1.add("python");
		v1.add("spring");
		v1.add("c++");
		
		List<String>list = v1.subList(0, 1);
		System.out.println(list.get(1));
		
		
		
	}
}
