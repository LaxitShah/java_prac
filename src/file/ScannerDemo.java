package file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter age:-");
		int age = sc.nextInt();
		System.out.println(age);

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("pls enter name");
		String sName = null;
		try {
			sName = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sName);

		System.out.println("***");

	}
}
