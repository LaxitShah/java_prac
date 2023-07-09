
public class Bank {

	
	//bank ()-->JVM -->DEFAULT CONST
	
	int a; //instance variablae //2345
	
	
	public Bank() {
	
		this.a = 1000;	
		System.out.println("default const...0 param const...");
	}
	
	public Bank(int a) { //1234
		
		//a =12
		
		System.out.println("param");
	}
	
	void display(){
		//local a  -->
		System.out.println(a); // -->  //2345
	}
	
	public static void main(String[] args) {
	
		Bank b = new  Bank(12);     //instance dec //param for object b
		//Bank b1 = new Bank(1200);  
		b.display();
		
	}
}
