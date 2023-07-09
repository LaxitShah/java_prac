package date;

import java.util.Calendar;

public class CalnderDoubt {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		System.out.println("january -->" + Calendar.JANUARY);
		calendar.set(2020, 5, 23, 15, 20);

		System.out.println("time-->" + calendar.getTime());

		//
		calendar.set(Calendar.MONTH, 10);

		System.out.println("*****"+calendar.get(Calendar.MONTH));

		System.out.println("january -->" + Calendar.JANUARY);
		System.out.println(calendar.get(0));
		System.out.println(calendar.get(1));
		System.out.println(calendar.get(2));
		System.out.println(calendar.get(3));
		System.out.println(calendar.get(4));
		// System.out.println(calendar.get(18));
		System.out.println("--->" + calendar.get(Calendar.SUNDAY));
		System.out.println("-->" + calendar.get(Calendar.FEBRUARY));
		System.out.println("--" + calendar.get(Calendar.APRIL));
		// cal.feb ==1
		System.out.println(Calendar.MONTH);

	}
}
