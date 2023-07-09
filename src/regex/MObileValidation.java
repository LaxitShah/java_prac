package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MObileValidation {

	
	public static void main(String[] args) {
		
		//server side validation
		
		//client validation  //view page HTML  //code editable
		Pattern p = Pattern.compile("[^12345]{1}[0-9]{9}");
		Matcher m = p.matcher("5460224296");
		boolean b = m.matches();
		System.out.println(b);
	}
}
