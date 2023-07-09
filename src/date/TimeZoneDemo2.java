package date;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneDemo2 {

	
	public static void main(String[] args) {
		
		TimeZone zone = TimeZone.getTimeZone("America/New_York");
		
		System.out.println(zone.getOffset(Calendar.ZONE_OFFSET));
		System.out.println(zone.getID());
		System.out.println(zone.getDisplayName());
		
	}
}
