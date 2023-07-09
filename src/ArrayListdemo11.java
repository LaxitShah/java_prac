import java.util.ArrayList;

class Books{
	
	//prop
	int bId;
	String bName;  //instance variable..
	
	public Books(int bId,String bName) {
	
		this.bId =bId;
		this.bName=bName; 
				
	}
	
	
}
public class ArrayListdemo11 {

	
	public static void main(String[] args) {
	
		
		ArrayList<Books> books = new ArrayList<>();
		Books b1 = new Books(101, "java"); 
		Books b2 = new Books(102, "python");
		Books b3 = new Books(103, "dbms");
		Books b4 = new Books(104, "data science");
				
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		
		for(Books b :books){
			
			System.out.println(b.bId+ "--"+b.bName);
			
		}
		
		
		
	}
}
