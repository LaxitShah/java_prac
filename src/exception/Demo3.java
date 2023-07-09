package exception;

public class Demo3 {

	
	
	public static void main(String[] args) {
		
		
		try {
			Class.forName("exception.Demo2");//without new keyword it will store object in memory
			//checkd excption or compiletime
			System.out.println("loded");
		} catch (ClassNotFoundException e) {
			
			
			
			e.printStackTrace();
		}
		
		
	}
}
