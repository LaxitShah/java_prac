package date;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class TimeZone_loclae {

	
	public static void main(String[] args) {
		
		
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		
		Locale locale = new Locale("en","CA");
		System.out.println(locale.getDisplayCountry());
		
		
		Calendar calendar = Calendar.getInstance(timeZone);
		System.out.println(calendar.getTime());
				
		
		
	}
}
