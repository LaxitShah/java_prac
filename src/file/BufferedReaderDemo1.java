package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo1 {

	public static void main(String[] args) {

		try {
			BufferedReader reader = new BufferedReader(new FileReader("C://Users//Shaun Pant//Desktop//dictonry"));
			// readLine String null '\0'
			String st;
			/*
			 * stack heap
			 * 
			 * st -> a --> b
			 * 
			 */

			int cnt = 0;
			while ((st = reader.readLine()) != null) {

				System.out.println(st);
				cnt++;
			}
			System.out.println("no of word in file =" + cnt);
			reader.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
