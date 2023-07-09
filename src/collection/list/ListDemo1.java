package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	
	public static void main(String[] args) {
		
	
		//array
		//int a[] = new int[3]; //0 1 2  3
		List<String> list = new ArrayList<String>();
		//Dyanamic array...
		
		//list is collection of objects..
		//index form
		
		list.add("raj");  //0
		list.add("ajayraj"); // 1
		list.add("parth"); //2
		list.add("krishna"); //3
		
		/*
		System.out.println(list.get(0));
		System.out.println(list.size());*/
		
		System.out.println(list);
		/*for(int i=0;i<list.size();i++){
			
			System.out.println(list);
		}*/
		
		
		//System.out.println("removed element.."+list.remove(0));
		
		System.out.println(list);
		
		boolean isavialble = list.contains("raj");
		System.out.println("element is -->"+isavialble);
		System.out.println(list.isEmpty());
		System.out.println(list.indexOf("parth"));
		
		
		//Dictnory  ->read that file
		
		///list upperecase 
	}
	
}
