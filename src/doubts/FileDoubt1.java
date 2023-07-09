package doubts;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileDoubt1 {

	
	public static void main(String[] args) {
		
		
		File parent= new File("a/b");
		System.out.println(parent.hashCode());
		parent = null;
		//System.out.println(parent.hashCode());
		
		File child = new File(parent,"c/zoo2.txt");
		
		
		try {
			child.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
