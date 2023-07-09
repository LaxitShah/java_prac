
interface GOV {

	//interface  ->instance  ->local variable
	//final static
	int taxrate =10; //static 
	public void tax();
	
	
}
interface StateGov{
	
	
	public void mtax();
}
abstract class AMC{
	
	
}


public class TaxPayer extends AMC implements GOV,StateGov{

	
	public void tax() {
		
	
		System.out.println("-->"+GOV.taxrate);
		
	}
	
	public static void main(String[] args) {
		
		GOV g = new TaxPayer();
		g.tax();
		
	}

	@Override
	public void mtax() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
