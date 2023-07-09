package demoss;

abstract class test {

	protected test() {

		System.out.println("test called..");
	}

}

class type {

	protected type() {

	}
}

public class Demo12 extends type {

	public Demo12() {

		System.out.println("demo 12 ");
	}

	public static void main(String[] args) {

		Demo12 d = new Demo12();
		// test t = new test();
		type t = new type();

	}
}
