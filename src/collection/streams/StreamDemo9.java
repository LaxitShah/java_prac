package collection.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo9 {

	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("jay");
		names.add("jayraj");
		names.add("raj");
		names.add("parth");
		names.add("sneha");
		names.add("harit");
		names.add("akshit");
		names.add("kishan");
		names.add("radha");
		
		boolean res = names.stream().anyMatch((s)->s.startsWith("j"));
		System.out.println(res);
		
		res = names.stream().noneMatch((s)->s.startsWith("x"));
		System.out.println(res);
		
		res = names.stream().allMatch((s)->s.startsWith("j"));
		System.out.println(res);
		
		long cnt = names.stream().count();
		System.out.println(cnt);
		
		
		String name = names.stream().filter((p)->p.startsWith("j")).findAny().get();
		System.out.println(name);
	}
}
