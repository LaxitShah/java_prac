package file.NIO;

import java.io.File;
import java.io.IOException;

public class PathDemo4 {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\..\\Program Files");
		
		
		try {
			String s = f.getCanonicalPath();
			System.out.println(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
