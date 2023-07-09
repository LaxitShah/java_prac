
interface Drawble{
	
	public int draw();
	
}
public class Drawtest {

	public static void main(String[] args) {
		
		Drawble d =()->{
			
			System.out.println("draw method called..");
			return 100;
		};
		int x = d.draw();
		System.out.println(x);
		
		
	}
}
