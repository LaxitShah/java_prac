package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScnnerDemo1 {
	// read data from file using Scanner Class....

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(new File("C://Users//Shaun Pant//Desktop//dictonry"));
			while (sc.hasNext()) {

				System.out.println(sc.next());
			}

		} catch (FileNotFoundException e) {
			System.out.println("pls check file name...");
		}

	}
}
