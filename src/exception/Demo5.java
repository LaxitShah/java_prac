package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo5 {

	
	
	public void getFile() throws Exception,FileNotFoundException,ArithmeticException 	{
		
		
			Scanner sc = new Scanner(new File("abcd.txt"));
			System.out.println("pass one excption");
			try{
			int a = 10,b=0,c=1;
			c = a /b;
			System.out.println(c);
			}catch (ArithmeticException e) {
				
				System.out.println("cannot divide");
			}
		
			// TODO Auto-generated catch block
		
		
		
	}
	public static void main(String[] args) throws ArithmeticException, Exception {
		//compiler
		
	/*	try{
		Scanner sc = new Scanner(new File("abcd124.txt"));//checked handel try catch method signature
		//catch block..
		while(sc.hasNext()){
			
			System.out.println(sc.next());
		}
		}catch (FileNotFoundException e) {
			
			System.out.println("pls check file in server");
		}
*/	
		Demo5 d1 = new Demo5();
		d1.getFile();
				
		
	}
}
