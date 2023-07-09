package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {

	
	public static void main(String[] args) {
		
		//Pattern p = Pattern.compile("...z");  //.
		//Matcher m = p.matcher("xyzz");
		//boolean b = m.matches();
		//System.out.println(b);
		
		//Regex Character classes
		/*Pattern p = Pattern.compile("[a-z&&[^def]]");  //[abc]//[^abc]//[a-zA-z]
		//[0-9]//[a-d[m-q]] //[a-z&&[^def]]
		Matcher m = p.matcher("d");
		boolean b = m.matches();
		System.out.println(b);
		*///Regex Quantifiers
		
		Pattern p = Pattern.compile(""); 
		//? once or not at all  
		//+ ->once and more time  [a-zA-Z0-9]+[0-9]+
		//* ->zero or more
		// press Y for yes N for EXIT
		//{5} fix
		//{1,}  -->one and more
		//{5,10} -->min five and max 10
		Matcher m = p.matcher("sam@gmail.com");
		boolean b = m.matches(); 
		System.out.println(b);
		
		
		
		
		
	}
}
