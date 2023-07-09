package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {

	public static void main(String[] args) {

		
		String regex = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,10})";
		//[\\d]?[a-z]?[A-Z]?[@#$%]{8,10}
		//Sam@123
		//matches any char axecept line terimanated..
		
		/*
		 * 	? quantifiers
		 * 	=
		 * .* till line end
		 * \\d [0-9]
		 * */
		
		

		Pattern p1 = Pattern.compile(regex);// expression
		Matcher mp = p1.matcher("Sam@1234");// input
		boolean p = mp.matches();
		System.out.println(p);

	}
}
