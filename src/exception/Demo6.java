package exception;

import java.io.FileInputStream;
import java.util.Scanner;

public class Demo6 {

	@Override
	protected void finalize() throws Throwable {

		System.out.println("finilized called....");
	}

	public static void main(String[] args) {

		int a[] = new int[3];

		Scanner sc = new Scanner(System.in);
		sc.next();

		try {
			a[0] = 100;
			a[1] = 200;
			a[2] = 300;

			for (int i = 0; i <= 3; i++) {

				System.out.println(a[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("pls chcek size of an array...");
		}
		//

		finally {

			System.out.println("finally exce...");
			sc.close(); // transation management

		}
		System.gc();

	}
}
