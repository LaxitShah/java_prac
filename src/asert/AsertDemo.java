package asert;

import java.util.Scanner;

public class AsertDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter value of no:");
		int no = sc.nextInt();
		assert no > 18:"age is not valid..";
		
		
		System.out.println("valid...."+no);
	}
}
