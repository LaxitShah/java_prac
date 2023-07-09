package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {

	
	public static void main(String[] args) {
		
		//(.+)@(.+)
		//[a-zA-Z0-9+_.-]+@(.+)
		//[\\w.-]+@(.+)
		//RFC 5322 approved  -->RFC -->
		//$ string
		//[a-zA-Z0-9_!#$%&+/=`?{|}~^.-]+@[a-zA-Z0-9.-]+
		//
		//domail url
		//? * +
		//[a-zA-z(.+)]+
		//
		Pattern  p = Pattern.compile("[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]"
				+ "+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*");//expression
		Matcher m = p.matcher("samir.sa@gmail.com.in");//input
		boolean b = m.matches();		
		System.out.println(b);
		
	}
}
