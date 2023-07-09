package exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		try {
			System.out.println("pls enter age:-");
			Scanner sc = new Scanner(System.in);
			int age = sc.nextInt();
			System.out.println(age);

			System.out.println("pls enter no1 and no2  :");

			int a = sc.nextInt();
			int b = sc.nextInt();

			int c = a / b;

			System.out.println(c);

		}

		catch (ArithmeticException e) {

			System.out.println("mmm");
		}

		catch (Exception e) {

			System.out.println("error");
		}

		/*
		 * catch (InputMismatchException | ArithmeticException e) {
		 * 
		 * System.out.println("pls enter only digits in age column"); }
		 */

	}
}
