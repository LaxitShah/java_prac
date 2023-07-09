import java.util.ArrayList;

public class ArrayListDemo {

	
	
	public static void main(String[] args) {
		
		
		ArrayList<String> names = new ArrayList<>();
		//add
		names.add("java");
		names.add("python");
		names.add("c++");
		
		names.add("c");
		names.add("DBMS");
		
		for(int i=0;i<=10;i++){
			
		}
		
		int a[] = new int[5];
		
		a[0] =100;
		a[1] =200;
		a[2] =300;

		for(int i=0;i<5;i++){
			
			
			System.out.println(a[i]);
		}
		
		//len
		
		for(int x:a){
			
			System.out.println(x);
		}
		
		
		
		/*
		for(int i=0;i<names.size();i++){
			
			System.out.println(names.get(i));
		}*/
		
		//for each advance for loop enhanced for loop
		
		/*for(String s:names){
			
			System.out.println(s);
		}*/
		
	}
}
