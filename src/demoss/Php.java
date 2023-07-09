package demoss;

interface java {

	void dostuff();
}

abstract class python implements java {

	void getstuff(){}

}

public class Php extends python {

	void trystuff() {

		System.out.println("try");
	}

	public static void main(String[] args) {

		Php  p = new Php();
		p.trystuff();

	}

	@Override
	public void dostuff() {
		// TODO Auto-generated method stub
		
	}

}
