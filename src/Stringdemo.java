
public class Stringdemo {

	// non prim
	public static void main(String[] args) {

		String name = "java";
		System.out.println(name.length());
		name = name.concat("          a");
		System.out.println(name.length());
		name = name.trim();
		System.out.println(name.length());
	}
}
