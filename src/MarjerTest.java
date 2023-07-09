import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@FunctionalInterface
interface sleep{
	
	public void sleeping();
	
	//2 error
	
}

public class MarjerTest implements Serializable{

	
	public static void main(String[] args) {
		
		try {
			
			ObjectOutputStream object = new ObjectOutputStream(new FileOutputStream("abcd.txt"));
			object.writeObject(new MarjerTest());
			System.out.println("done...");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
