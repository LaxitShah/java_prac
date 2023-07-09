import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLisyDemo3 {

	
	public static void main(String[] args) {
		
		
		ArrayList<String> ranks = new ArrayList<>();
		
		ranks.add("pm"); // 0 
		ranks.add("cm");//1
		ranks.add("comm");//2
		ranks.add("ceo");//3
		
		ranks.add(1, "PMO");
		
		
		//String removeel = ranks.remove(1);
		//System.out.println(removeel);
		//System.out.println("after remove element..");
		
		System.out.println("pls enter rank to search");
		Scanner sc = new Scanner(System.in);
		String sName = sc.next();
	
		//ranks.contains("pm");
		/*boolean flag = ranks.contains(sName);
		if(flag==true){
			System.out.println(sName +" is available in list");
		}
		else{
			
			System.out.println(sName +" is not available in list");
		}
		*/
		
		if(ranks.contains(sName)){
			
			System.out.println(sName +" is available in list");
		}
		else{
			
			System.out.println(sName +" is not available in list");
		}
		
		
		
		
		for(String s:ranks){
			
			System.out.println(s);
		}
		
		
		
		
	}
}
