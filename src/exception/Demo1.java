package exception;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {

		try {
			System.out.println("pls enter no1 and no2  :");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();

			int c = a / b;

			System.out.println(c);
		} catch (ArithmeticException e) {

			
			System.out.println("cannot divide by zero");
			e.printStackTrace();
			
			System.out.println(e.getMessage());
		}

	}
}
