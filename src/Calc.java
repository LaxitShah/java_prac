

interface CalcImpl{
	
	int sum(int a,int b);//int (2)
}

public class Calc {

	
	public static void main(String[] args) {
		
		CalcImpl c =(a,b)->{
			
			
			return a + b;
		};
		//1.8
		
		int ans = c.sum(100, 200);
		System.out.println(ans);
		
		
	}
}
