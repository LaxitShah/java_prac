package demoss;

public class Demo {

	//non static
	 int a;

	Demo() {
		a = 1000;
	}

	public static void main(String[] args) {

		Demo d = new Demo();
		System.out.println(d.a);
	}
}
