package file.NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {

	
	public static void main(String[] args) {
		
		//path
		Path path = Paths.get("D:\\ANGULAR\\EmployeeCrud\\angular.json");
		
		System.out.println(path.getFileName());
		
		System.out.println(path.getName(0));
		
		System.out.println(path.getRoot());
		
		System.out.println(path.getParent());
		
		System.out.println(path.subpath(0, 2)); 
		
		
		
	}
}
