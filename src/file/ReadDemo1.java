package file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadDemo1 {

	public static void main(String[] args) {

		// String
		// file
		try {
			FileReader reader = new FileReader("C://Users//Shaun Pant//Desktop");
			int c = 0;
			while ((c = reader.read()) != -1) {

				System.out.print((char) c);
			}

			reader.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
