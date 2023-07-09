import java.util.ArrayList;

public class ArrayListDemo7 {

	
	public static void main(String[] args) {
		
		//<> type safty  -> num int
		// int a[] = new int[100000]
		ArrayList<Integer> num = new ArrayList<>();
		
		num.add(1234);
		num.add(154);
		num.add(89);
		num.add(66);
		
		for(int i:num){
			
			System.out.println(i);
		}
		
				
	}
}
