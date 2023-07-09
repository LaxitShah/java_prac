import java.util.ArrayList;

public class ArrayListDemo2 {

	
	public static void main(String[] args) {
		
		ArrayList<String> class11 = new ArrayList<>();
		class11.add("poojan");
		class11.add("deven");
		class11.add("foram");
		
		
		ArrayList<String> class12 = new ArrayList<>();
		class12.add("charmi");
		class12.add("dhruvi");
		class12.add("himang");
		
		ArrayList<String> school = new ArrayList<>();
		
		school.addAll(class11);
		school.addAll(class12);
		
		
		for(String s:school){
			
			System.out.println(s);
		}
		
		
		
		
	}
}
