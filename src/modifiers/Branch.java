package modifiers;

class Bank {

	private int id;// private instance variable....

	private void detail() {

		System.out.println("detail called..");
		System.out.println(id);
	}
	
	void demo(){
		
		Bank b1 = new Bank();
		b1.detail();
	
	}
	

}

public class Branch extends Bank {

	private void detail() {

		System.out.println("detail called..local");

	}

	public static void main(String[] args) {

		 Branch b1 = new Branch();
		 b1.demo();
		
	}

}
