import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo5 {

	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("raj");
		names.add("jayraj");
		names.add("viraj");
		names.add("niraj");
		names.add("rajvi");
		names.add("rajvir");
		
		List<String> subnames = new ArrayList<>();
		subnames = names.subList(1, 6);
		
		
		for(String s:subnames){
			
			System.out.println(s);
		}
		
	}
}
