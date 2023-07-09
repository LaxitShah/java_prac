package file.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo2 {

	
	public static void main(String[] args) {
		
		Path path = Paths.get("..//Pract_7pm//src//file//NIO//deven.txt");
		System.out.println(path.normalize());
		System.out.println(path.getParent());
		System.out.println(path.getRoot());
		try {
			Files.createFile(path);
			System.out.println("file created...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
