package casting;

public class Demo12 {

	public static void main(String[] args) {

		int a = 100;
		float f = a;
		System.out.println(f);

		long d = 2000000000l;
		// error ..
		// a = d;
		a = (int) d;
		System.out.println(a);

	}
}
