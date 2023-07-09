package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLIstDemo4 {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(4, 5, 6);
		List<Integer> list3 = Arrays.asList(7, 8, 9);

		List<List<Integer>> al = new ArrayList<List<Integer>>();

		al.add(list1);
		al.add(list2);
		al.add(list3);

		System.out.println(al.get(0));

		for (int i = 0; i < al.size(); i++) {
			
			for (int x : al.get(i)) {

				System.out.println(x);
			}

		}
		

		List<Integer> al1 = new ArrayList<>();
		al1.add(1);
		
		
		System.out.println("contains all..."+list1.containsAll(al1));
		
		
				

	}
}
