package demoss;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//dd 
//iland of isolation

public class TryMethodDemo {

	public static void main(String[] args) {

		/*
		 * Scanner sc = null; try { sc = new Scanner(new File("Pink.txt")); //
		 * sc.close(); sc.next(); } catch (FileNotFoundException e) { // TODO
		 * Auto-generatedcatch block e.printStackTrace(); } finally {
		 * System.out.println("inside finally."); sc.close(); sc.next();
		 * 
		 * } }
		 */
		try {
			Scanner sc1 = new Scanner(new File("Pink.txt"));
			sc1.next();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// auto close..
		// Scanner sc = null;
		try (Scanner sc = new Scanner(new File("Pink.txt"))) {

			sc.next();

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} finally {

		}

	}
}