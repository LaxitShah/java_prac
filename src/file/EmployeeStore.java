package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{

	int eId;
	String eName;
	
	public Employee(int eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}

}

public class EmployeeStore{
	
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "jay");
		try {
			ObjectOutputStream object = new ObjectOutputStream(new FileOutputStream("employee.ser"));
			
			object.writeObject(e1);
			System.out.println("data serilized...");
			object.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
