package enumDemo;

import java.util.Scanner;

public class EnumDemo3 {

	enum Months {
		JAN(1), FEB(2), MARCH(3), APRIL(4);

		/// its an ref var of Month class final static
		Months(int value1) {

			this.val = value1;
		}

		int val;

	}

	public static void main(String[] args) {

		System.out.println("pls enter month...");
		Scanner sc = new Scanner(System.in);

		String m = sc.next();
		Months month = null;

		if (m.equals("january")) {

			month = Months.JAN;
		}

		switch (month) {

		case APRIL:

			break;

		case JAN:

			System.out.println("january.." + Months.JAN.val);

			break;

		case FEB:
			System.out.println("february");
			break;

		}
	}
}
