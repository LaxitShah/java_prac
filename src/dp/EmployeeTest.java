package dp;


class Employee{
	
	//cretae instance of employee class
	static Employee employee;
	
	String employeeName;
	
	private Employee(){  //resrict new key word
		
		System.out.println("default const");
	}
	
	public static Employee getInstance(){
		
		if(employee==null){
			
			System.out.println("inside if new keyword");
			employee = new Employee();// object creation...
		}
		
		return employee;
	}
	
	
	
}
public class EmployeeTest {

	
	
	public static void main(String[] args) {
		
		
		
		
		Employee e1 = Employee.getInstance();  
		Employee e2 = Employee.getInstance();
		
		e1.employeeName = "raj";
		System.out.println(e1.employeeName);
		System.out.println(e2.employeeName);
		
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		
	}
}
