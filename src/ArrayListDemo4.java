import java.util.ArrayList;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		
		
		ArrayList<String> a = new ArrayList<>();
		a.add("java");
		a.add("python");
		a.add("c");
		
		
		
		ArrayList<String> b = new ArrayList<>();
		b.add("java");
		b.add("python");
		
		
		
		
		if(a.equals(b)){
			
			System.out.println("true");
		}
		else{
			
			System.out.println("false");
		}
			
			
	}
}
