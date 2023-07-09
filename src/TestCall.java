
abstract class TRAI1 {

	public abstract void call();
	// idea

	public void mms() {

		System.out.println("mms");
	}

}

class Airtel extends TRAI1 {

	public void call() {

		System.out.println("airtel called..");
		// indea -->telc ->trai -->call -->call();
		TRAI1 t1 = new Idea(); // web appliaction
		t1.call();
	}

}

class Idea extends TRAI1 {

	public void call() {

		System.out.println("idea called..");

	}

}

public class TestCall {

	// user raj --> idea --> airtle simaran
	public static void main(String[] args) {

		TRAI1 t1 = new Airtel();
		t1.call();

		TRAI1 t2 = new Airtel();
		t2.mms();

	}

}
