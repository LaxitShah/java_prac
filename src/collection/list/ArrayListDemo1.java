package collection.list;

import java.util.ArrayList;

public class ArrayListDemo1 {

	
	public static void main(String[] args) {
		
		
		String boys[] = new String[3];
		boys[0]="lakhan";
		boys[1]="poojan";
		boys[2]="deven";
		
		String girls[] = new String[3];
		girls[0]="shreya";
		girls[1]="piyal";
		girls[2]="isha";
		
		
	
		
		ArrayList<String[]> names = new ArrayList<>();
		names.add(boys);
		names.add(girls);
		
		
		
		System.out.println(names);
		for(String s[]:names){
			
			for(int i=0;i<s.length;i++){
				
				System.out.println(s[i]);
			}
		}
		
		
		
		
	}
}
