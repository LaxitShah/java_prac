package date;

import java.util.Locale;

public class LocleDemo {

	public static void main(String[] args) {
		
		
		//WIN
		Locale locale = new Locale("fr", "ch");
		
		Locale l[] = Locale.getAvailableLocales();
				
		for(int i=0;i<l.length;i++){
			
			System.out.println(l[i]);
		}
		
		System.out.println(locale);
		
		System.out.println("language ->"+ locale.getDisplayLanguage());
	}
}
