package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo3 {

	public static void main(String[] args) {

		// FileWriter fw = new FileWriter("abcd.txt");
		// FileWriter fw = new FileWriter(new File(""));
		// File file = new File("abcd.txt");
		// FileWriter fw = new FileWriter(file);

		FileWriter fw = null;
		try {
			 fw = new FileWriter("demo1.txt");
			 fw.write("\n samir hello");
			
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // char to char s a m i r
		finally {
			
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// r w w+ a
	}
}
