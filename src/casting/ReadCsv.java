package casting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadCsv {

	public static void main(String[] args) throws IOException {

		File file = new File("C://Users//Shaun Pant//Downloads//MOCK_DATA (11).csv");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		while ((line = br.readLine()) != null) {

			String[] data = line.split(",");

			System.out.println(data[0]);

		}
		br.close();
	}
}
