package collection.set;

import java.util.TreeSet;

public class TreeSetDemo2 {

	
	public static void main(String[] args) {
		
		
		
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(101);
		ts.add(102);
		ts.add(103);
		ts.add(104);
		
		
		Object obj [] = ts.toArray();
		int x =0;
		String m =null;
		for(int i=0;i<obj.length;i++){
			
			x = (int) obj[i];  //0 obj
			x++;
			
			System.out.println("x = >"+x);
			System.out.println(obj[i]);
		}
		
	}
}
