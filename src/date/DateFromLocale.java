package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class DateFromLocale {

	
	public static void main(String[] args) {
		Calendar currentdate = Calendar.getInstance();
		DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		TimeZone obj = TimeZone.getTimeZone("Asia/Kolkata");
		formatter.setTimeZone(obj);
		System.out.println("Local:: " +currentdate.getTime());
		System.out.println("CST:: "+ formatter.format(currentdate.getTime()));
	}
}
