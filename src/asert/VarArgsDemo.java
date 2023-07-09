package asert;

public class VarArgsDemo {

	public void demo(int a) {

		System.out.println(a);
	}

	public void demo1(String s, int p, int... a) {

		System.out.println(s);
		System.out.println("p =>" + p);
		System.out.println(a);
		for (int x : a) {
			System.out.println(x);
		}

	}

	public void add(int... a) {

		System.out.println("---" + a);
		System.out.println("var args a");
	}

	public void add(int a) {

		System.out.println("normal args");
	}

	public void add(String... s) {

		System.out.println("****" + s);
	}

	public static void main(String[] args) {

		VarArgsDemo v = new VarArgsDemo();
		v.demo(12);
		v.demo1("s", 1, 2, 55, 67, 89, 78);
		// v.add(12, 22);
		// v.add("a", 12);
		v.add(12);

	}
}
