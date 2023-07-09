package casting;

import java.util.ArrayList;

public class DemoObject {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();

		//String s[] = (String[]) al.toArray();
		//System.out.println(s);

		String value = String.valueOf(12000);
		System.out.println(value.concat("java"));

	}
}
