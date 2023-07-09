import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo10 {

	public static void main(String[] args) {
		
		
		ArrayList<String> al = new ArrayList<>();
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("c");
		al1.add("c++");
		
		
		al.add("java");
		
		String abc = al.get(0).concat(al1.get(0));
		al.add(abc);
		al.add("python");
		al.add(abc);
		al.add("AI");
		al.add("ML");
		al.add("dbms");
		al.addAll(al1);
		
		
		
		//Collections.sort(al);
		
		
		for(String s:al){
			
			System.out.println(s);
		}
		
		
				
	}
}
