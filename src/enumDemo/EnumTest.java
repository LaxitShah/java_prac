package enumDemo;

import java.util.Calendar;

enum Seasons{
	
	
	
	winter(1),summer(2),spring(3);  //public final static
	
	int value;///instacne variable....
	
	private Seasons(int val) {
	
		this.value = val;
	}
	
	
	
}


enum Http{
	
	
	PAGE_NOTFOUND(404);
	
	int value;
	
	private Http(int code){
		
		this.value = code;
	}
	
}



public class EnumTest {
	
	enum Month{
		
		jan,feb,march;
	}
	
	final static int a=10;

	
	 
	
	
	public static void main(String[] args) {
		
	
		
		
		System.out.println(Http.PAGE_NOTFOUND.value);
		System.out.println(Http.PAGE_NOTFOUND.value);
		
		
	//	System.out.println(Seasons.winter); //final static variable
		
		//System.out.println(Month.feb);
	}
	
}
