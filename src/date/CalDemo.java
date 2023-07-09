package date;

import java.util.Calendar;

public class CalDemo {

	
	public static void main(String[] args) {
		
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.getTime());
		System.out.println(c.getTimeInMillis());
		System.out.println(c.getFirstDayOfWeek());
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(16));
		
		
		
	}
}
