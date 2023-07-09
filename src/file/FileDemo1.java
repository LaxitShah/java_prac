package file;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) {

		File file = new File("abcd1.txt"); // root level
		// create new file
		try {
			if (file.exists()) {
				
				System.out.println("file already exists...");
				
			} else {
				file.createNewFile();
				System.out.println("file created...");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
