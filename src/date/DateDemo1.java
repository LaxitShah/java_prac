package date;

import java.util.Date;

public class DateDemo1 {

	public static void main(String[] args) {

		// Date date2 = new Date(2323223232l);
		Date date = new Date();
		System.out.println(date);

		System.out.println(date.getDate());
		System.out.println(date.getDay()); //monday is first day of the week
		System.out.println(date.getHours());
		System.out.println(date.getTime());
		System.out.println(date.getTimezoneOffset());
		//
		
		
		

	}
}
