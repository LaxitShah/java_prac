
public class IncreDemo {

	
	public static void main(String[] args) {
		
		int res1=0,res2=0;
		int a =10;
		
		res1 = a++ + ++a  + ++a + ++a + ++a; //49 -?64
		res2 = ++a + ++a + ++a + ++a + a++ + a++ + a++ +a++;
		
		
		System.out.println(res1);
		System.out.println(res2);
		
		
	}
}
