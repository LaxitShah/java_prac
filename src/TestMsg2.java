interface Message2{
	
	
	public void sayMsg();
	
	
}
public class TestMsg2 {

	
	public static void main(String[] args) {
		
		
		Message2 msg =()->{
			
			System.out.println("say..");
		};
		
		msg.sayMsg();
	}
}
