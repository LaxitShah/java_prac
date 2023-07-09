
abstract class Jeff{
	
	
	public abstract void addInvestment(); // -->dec
	
}

class Flipkart extends Jeff {

	
	public void addInvestment() {
	
		System.out.println("f in");
		
	}
	
}

public class Amazone extends Jeff {

	
	public void addInvestment() {
		
		System.out.println("investment...");
		
	}
	public static void main(String[] args) {
		
		//Amazone a = new Amazone();// amazone instance..
		
		Jeff j = new Amazone(); //parent jeff instance memory amazone
		//run time polymorephisam
		
		Jeff J1 = new Flipkart();
		//a.addInvestment();
		J1.addInvestment();
		
		j.addInvestment();
		
		
	}

	
	
	
}
