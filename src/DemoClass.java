
class Water {

	public void pepsi() {

		System.out.println("pepsi called....p");
		this.pepsi();
	}
}

public class DemoClass extends Water {

	public void pepsi() {

		System.out.println("pepsi called....c");
		// this.pepsi();
	}

	public void cola() {

		this.pepsi();

	}

	public static void main(String[] args) {

		DemoClass d = new DemoClass();
		//d.pepsi();
		d.cola();
	}
}
