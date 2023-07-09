package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo4 {

	public static void main(String[] args) {

		//group -->() find
		Pattern p = Pattern.compile("\\s");
		Matcher m = p.matcher("samir    @ sa mir. coms");
		int cnt = 0;
		// ''
		
		while (m.find()) {
			cnt++;
		}
		System.out.println(cnt);

	}
}
