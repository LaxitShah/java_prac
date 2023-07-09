package date;

import java.util.Calendar;

public class CalnderDemo3 {

	
	public static void main(String[] args) {
		
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		//get
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.getCalendarType());
		
		/*
		 * h.w
		 * */
		System.out.println(c.get(Calendar.DECEMBER)); //19
		System.out.println(c.get(Calendar.NOVEMBER)); //7 
		System.out.println(c.get(Calendar.JANUARY));  //1
		
		System.out.println(Calendar.DECEMBER);
		
		//add 
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("bfr"+calendar.getTime());
		calendar.add(Calendar.YEAR, -25);
		calendar.add(Calendar.DATE,-25);
		calendar.add(Calendar.MONTH, -6);
		System.out.println(Calendar.JANUARY);
		
		System.out.println(Calendar.JANUARY);
		
		// mail --> time appand ->timestamp  ->yyyy mm dd hh mm ss
		//sam@gmail.com   -> tim
		
		System.out.println("after"+calendar.getTime());
		
		
		
		
		
		
		
		
		
		
		
	}
}
