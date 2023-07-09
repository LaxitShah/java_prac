

class TRAI{
	
	
	public TRAI(int x){
		
		System.out.println("param const of TRAI (p)"+x);
		
	}
	
	
			
}


public class JIO extends TRAI{

	
	
	
	public JIO(int x) {
		super(100);
		System.out.println("default const of JIO (c)");
	}
	
	
	
	
	public static void main(String[] args) {
		
		JIO jio = new JIO(100);
		
		
				
	}
}
