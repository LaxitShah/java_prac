package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDemo {

	
	public static void main(String[] args) {
		
		FileWriter fw;
		try {
			fw = new FileWriter("demo1.txt");
			BufferedWriter br = new BufferedWriter(fw);
			br.write("hi this is file...");
			br.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
