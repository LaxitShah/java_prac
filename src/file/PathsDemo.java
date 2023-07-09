package file;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsDemo {

	public static void main(String[] args) {

		File abspath = new File("C:\\Users\\Shaun Pant\\Desktop\\Capture.PNG");
		System.out.println("abs path :-->" + abspath);
		
		Path relative = Paths.get("abcd1.txt");
		System.out.println(relative);
		
		Path abs = relative.toAbsolutePath();
		System.out.println(abs);
		
		
		
		
		
		
		

	}
}
