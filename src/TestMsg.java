

interface Message{
	
	
	public void sayMsg();
}
public class TestMsg implements Message{

	
	public static void main(String[] args) {
		
		Message m = new TestMsg();
		m.sayMsg();
		
	}

	
	public void sayMsg() {

		System.out.println("message called...");
		
	}
	
}
