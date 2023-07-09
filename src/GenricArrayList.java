import java.util.ArrayList;

public class GenricArrayList {

	
	public static void main(String[] args) {
		
		//salary 12323.12 //int 25 30 450  //12 12 13 12.12 //
		
		ArrayList obj = new ArrayList(); 
		
		obj.add(true);
		obj.add("name");
		obj.add(1234);
		obj.add(12345.55);
		
		boolean b  = obj.contains(true);
		System.out.println(b);
		
		for(Object o :obj){
			
			System.out.println(o);
		}
				
	}
}
