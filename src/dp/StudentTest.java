package dp;

class Student{
	
	String sName;
	static Student student;  //instance declaration
	
	
	public Student() {
	
		
		System.out.println("const..");
	}
	
	
	public static Student getInstance(){
		
		if(student==null){
			
			student = new Student(); //object...
		}
			
		
	
		return student;
	}
	
	
}

public class StudentTest {

	
	
	public static void main(String[] args) {
		
		
		
		Student s1 = new Student();
		Student s2 = new Student();
	
		s1.sName ="parth";
		System.out.println(s1.sName);
		System.out.println(s2.sName);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		

		
		
		
	}
}
