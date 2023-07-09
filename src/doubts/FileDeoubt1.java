package doubts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDeoubt1 {

	public static void main(String[] args) {

		int amount = 1000;

		try {
			FileWriter fw = new FileWriter("int.txt");
			fw.write(new Integer(amount).toString());
			fw.close();
			/**********************/
			FileReader reader = new FileReader("int.txt");

			BufferedReader br = new BufferedReader(reader);

			String stramnt =null;
			while ((stramnt = br.readLine()) != null) {

				System.out.print(stramnt);
			}
			
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
