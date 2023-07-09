import java.util.ArrayList;

public class ArrayListDemo12 {

	public static void main(String[] args) {

		String a[] = new String[3];

		a[0] = "samir";
		a[1] = "raj";
		a[2] = "viraj";
		
		String b[] = new String[3];

		b[0] = "java";
		b[1] = "python";
		b[2] = "c++";
		
		int x[] = new int[3];
		x[0]=100;

		ArrayList<String[]> names = new ArrayList<>();
		
		names.add(a);
		names.add(b);
		

		for (String s[] : names) {

			for (int i = 0; i < s.length; i++) {
				System.out.println(s[i]);
			}
		}
	}

}
