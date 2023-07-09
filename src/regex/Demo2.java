package regex;

import java.util.regex.*;
//abc  -->hello.java,hi.java.abcd.java
//abc//xyz  -->gm.java

public class Demo2 {

	//quan
	//regex Metachar
	public static void main(String[] args) {
		//\\d [0-9]
		//\\D [^0-9]
		//\\w [a-zA-z_0-9]
		//\\w [^a-zA-z_0-9]
		//\\ . : $
		//  -->samir-->
		//\\s[\t\n\r]
		//\\S[^\t\n\r]
		Pattern p = Pattern.compile("[a-z ]");// [0-9]
		Matcher m = p.matcher("s");
		boolean b = m.matches();
		System.out.println(b);
		
	}
}
