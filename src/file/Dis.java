package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dis {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(new File("C://Users//Shaun Pant//Desktop//dictonry"));
			while (sc.hasNext()) {

				System.out.println(sc.nextLine());
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
