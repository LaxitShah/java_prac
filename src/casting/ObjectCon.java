package casting;

import java.util.ArrayList;

public class ObjectCon {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		/*
		 * Object o = "jay"; Object o1 = 12; al.add((String) o);
		 */

		Object o1 = "12";
		String s1 = (String) o1;

		Integer.parseInt(s1);
		int p = (int) o1;
		System.out.println(p);

	}
}
