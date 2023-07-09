
public class RBI {

	
	int a =10;//class level or instance variable..

	void display(){
		
		int a =5; //local variable ...
		System.out.println(this.a);
		
	}
	public static void main(String[] args) {
		
		RBI r = new RBI();
		r.display();
		
	}
}
