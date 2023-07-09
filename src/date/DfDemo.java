package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class DfDemo {

	
	public static void main(String[] args) {
		
		
		Calendar calendar = Calendar.getInstance();
		
		DateFormat dateFormat  = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		TimeZone obj = TimeZone.getTimeZone("Europe/London");
		dateFormat.setTimeZone(obj);
		System.out.println(calendar.getTime());
		
		System.out.println(dateFormat.format(calendar.getTime()));
		
	}
}
