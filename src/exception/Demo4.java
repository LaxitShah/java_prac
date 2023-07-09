package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo4 {

	
	public static void main(String[] args) {
		
		
		Scanner sc1 = new Scanner(System.in);
		try {
			Scanner sc = new Scanner(new File("abcd.txt"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
