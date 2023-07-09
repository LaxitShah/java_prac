package demoss;

import java.util.Scanner;

public class ContinueDemo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		start: while (true) {
			System.out.println("pls enter no :-");
			int no = sc.nextInt();
			System.out.println(no);
			if (no < 15)
				continue start;

			break;
		}
		System.out.println("done...");
	}
}
