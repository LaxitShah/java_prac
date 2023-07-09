package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormateDemo {

	public static void main(String[] args) {

		Date date = new Date();
		//pls enter first name and laste
		//de ven jain
		//a -z  >firstName
		// surname
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss EEEE zzzz D w W");
		String newDate = simpleDateFormat.format(date);
		System.out.println(newDate);
	}
}
