package date;

import java.util.TimeZone;

public class TimeZoneDemo {

	
	public static void main(String[] args) {
		
		String[] zones = TimeZone.getAvailableIDs();
		int cnt =0;
		for(int i=0;i<zones.length;i++){
			
			System.out.println(zones[i]);
			cnt++;
		}
		System.out.println(cnt);
		
	}
	
}
